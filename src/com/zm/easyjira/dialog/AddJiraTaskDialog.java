package com.zm.easyjira.dialog;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.Notifications;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.MessageDialogBuilder;
import com.intellij.openapi.ui.MessageType;
import com.intellij.ui.EditorComboBox;
import com.intellij.ui.EditorComboBoxEditor;
import com.intellij.ui.EditorTextField;
import com.intellij.ui.TextFieldWithAutoCompletion;
import com.zm.easyjira.model.IssueCreateBO;
import com.zm.easyjira.model.ResultModel;
import com.zm.easyjira.model.enums.ProjectEnums;
import com.zm.easyjira.model.enums.TaskTypeEnum;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

import static com.zm.easyjira.utils.HttpCommandUtils.createIssue;

/**
 * @author 仲谋
 * @description:
 * @date 2021/5/30
 **/
public class AddJiraTaskDialog extends DialogWrapper {

    public AddJiraTaskDialog() {
        super(true);
        setTitle("创建子任务");
        init();
    }

    /**
     * 任务标题
     */
    EditorTextField summary;
    /**
     * 描述信息
     */
    EditorTextField description;
    /**
     * 父jira的key
     */
    EditorTextField parentKey;
    /**
     * issue类型 标识子任务
     */
    String issueType = "10003";
    /**
     * 预估时间
     */
    EditorTextField estimate;
    /**
     * 剩余预估时间
     */
    EditorTextField remainingEstimate;
    /**
     * 指派人名称全拼
     */
    EditorTextField assigneeName;
    /**
     * 开始时间
     */
    EditorTextField startDate;
    /**
     * 结束时间
     */
    EditorTextField endDate;
    /**
     * 任务类型
     */
    EditorComboBox taskType;
    /**
     * 项目类型
     */
    EditorComboBox projectType;

    @Override
    protected @Nullable
    JComponent createCenterPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 2, 10, 5));
        JLabel summarylabel = new JLabel("任务概要:");
        JLabel descriptionLabel = new JLabel("任务描述");
        JLabel parentKeyLabel = new JLabel("父任务key");
        JLabel estimateLabel = new JLabel("任务用时");
        JLabel remainingEstimateLabel = new JLabel("剩余用时");
        JLabel assigneeNameLabel = new JLabel("指派人名称");
        JLabel startDateLabel = new JLabel("开始时间");
        JLabel endDateLabel = new JLabel("结束时间");
        JLabel taskTypeLabel = new JLabel("任务类型");
        JLabel projectTypeLabel = new JLabel("项目类型");

        summary = new EditorTextField("");
        description = new EditorTextField("");
        parentKey = new EditorTextField("");
        estimate = new EditorTextField("");
        remainingEstimate = new EditorTextField("");
        assigneeName = new EditorTextField("");
        startDate = new EditorTextField("");
        endDate = new EditorTextField("");
        taskType = new EditorComboBox("");
        for (String key : TaskTypeEnum.keys()) {
            taskType.addItem(key);
        }
        projectType = new EditorComboBox("");
        for (String key : ProjectEnums.keys()) {
            projectType.addItem(key);
        }


        panel.add(summarylabel);
        panel.add(summary);


        panel.add(descriptionLabel);
        panel.add(description);

        panel.add(parentKeyLabel);
        panel.add(parentKey);

        panel.add(estimateLabel);
        panel.add(estimate);

        panel.add(remainingEstimateLabel);
        panel.add(remainingEstimate);

        panel.add(assigneeNameLabel);
        panel.add(assigneeName);

        panel.add(startDateLabel);
        panel.add(startDate);

        panel.add(endDateLabel);
        panel.add(endDate);

        panel.add(taskTypeLabel);
        panel.add(taskType);

        panel.add(projectTypeLabel);
        panel.add(projectType);

        return panel;
    }

    @Override
    protected JComponent createSouthPanel() {
        JPanel jPanel = new JPanel();
        JButton button = new JButton("创建任务");
        button.addActionListener(e -> {
            handle();
            AddJiraTaskDialog.this.dispose();
        });

        JButton createNotClose = new JButton("批量创建任务");
        createNotClose.addActionListener(e -> handle());

        jPanel.add(button);
        jPanel.add(createNotClose);

        return jPanel;
    }

    private void handle() {
        ResultModel issue = createIssue(getCreateBO());
        if (issue.isSuccess()) {
            MessageDialogBuilder.yesNo("操作结果", "添加成功,issueKey" + issue.getKey()).show();
        } else {
            MessageDialogBuilder.yesNo("操作结果", "操作失败").show();
            NotificationGroup markbok_id = new NotificationGroup("markbok_id", NotificationDisplayType.BALLOON);
            Notification sucessAdd = markbok_id.createNotification("操作失败:" + issue.getErrorMsg(), MessageType.ERROR);
            Notifications.Bus.notify(sucessAdd);
        }
    }


    public IssueCreateBO getCreateBO() {
        IssueCreateBO issueCreateBO = new IssueCreateBO();
        issueCreateBO.setSummary(summary.getText());
        issueCreateBO.setDescription(description.getText());
        issueCreateBO.setIssueType(issueType);
        issueCreateBO.setParentKey(parentKey.getText());
        issueCreateBO.setEstimate(estimate.getText());
        issueCreateBO.setRemainingEstimate(remainingEstimate.getText());
        issueCreateBO.setStartDate(startDate.getText());
        issueCreateBO.setEndDate(endDate.getText());
        issueCreateBO.setTaskType(TaskTypeEnum.nameOf(taskType.getText()).getCode());
        issueCreateBO.setProjectId(ProjectEnums.nameOf(projectType.getText()).getCode());
        return issueCreateBO;
    }


}
