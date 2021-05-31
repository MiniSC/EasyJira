package com.zm.easyjira.model;


import com.zm.easyjira.model.enums.ChildProductLineEnum;
import com.zm.easyjira.model.enums.ParentProductLineEnum;

/**
 * @author 仲谋
 * @description:
 * @date 2021/5/8
 **/

public class IssueCreateBO {
    /**
     * 任务标题
     */
    String summary;
    /**
     * 描述信息
     */
    String description;
    /**
     * 父jira的key
     */
    String parentKey;
    /**
     * issue类型 标识子任务
     */
    String issueType = "10003";
    /**
     * 预估时间
     */
    String estimate;
    /**
     * 剩余预估时间
     */
    String remainingEstimate;
    /**
     * 指派人名称全拼
     */
    String assigneeName;
    /**
     * 开始时间
     */
    String startDate;
    /**
     * 结束时间
     */
    String endDate;
    /**
     * 任务类型
     */
    String taskType;
    /**
     * 项目Id
     */
    String projectId;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getParentKey() {
        return parentKey;
    }

    public void setParentKey(String parentKey) {
        this.parentKey = parentKey;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getEstimate() {
        return estimate;
    }

    public void setEstimate(String estimate) {
        this.estimate = estimate;
    }

    public String getRemainingEstimate() {
        return remainingEstimate;
    }

    public void setRemainingEstimate(String remainingEstimate) {
        this.remainingEstimate = remainingEstimate;
    }

    public String getAssigneeName() {
        return assigneeName;
    }

    public void setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }


    ////    ======================以下为私有化必选参数=====================
    /**
     * 关联问题key
     * 例：CSRPRJ-4115
     */
    String referenceKey;
    /**
     * 父级产品线
     */
    ParentProductLineEnum parentProductLineEnum;
    /**
     * 子级产品线
     */
    ChildProductLineEnum childProductLineEnum;

    public String getReferenceKey() {
        return referenceKey;
    }

    public void setReferenceKey(String referenceKey) {
        this.referenceKey = referenceKey;
    }

    public ParentProductLineEnum getParentProductLineEnum() {
        return parentProductLineEnum;
    }

    public void setParentProductLineEnum(ParentProductLineEnum parentProductLineEnum) {
        this.parentProductLineEnum = parentProductLineEnum;
    }

    public ChildProductLineEnum getChildProductLineEnum() {
        return childProductLineEnum;
    }

    public void setChildProductLineEnum(ChildProductLineEnum childProductLineEnum) {
        this.childProductLineEnum = childProductLineEnum;
    }
}
