package com.zm.easyjira.utils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.zm.easyjira.model.IssueCreateBO;

/**
 * @author 仲谋
 * @description:
 * @date 2021/5/18
 **/
public class CreatePayloadInitService {

    /**
     * 初始化参数
     */
    public static ObjectNode buildPayLoad(IssueCreateBO issueCreateBO) {
        JsonNodeFactory jnf = JsonNodeFactory.instance;
        ObjectNode payload = jnf.objectNode();
        ObjectNode fields = payload.putObject("fields");
        fields.put("summary", issueCreateBO.getSummary());
        ObjectNode parent = fields.putObject("parent");
        parent.put("key", issueCreateBO.getParentKey());
        ObjectNode issuetype = fields.putObject("issuetype");
        issuetype.put("id", issueCreateBO.getIssueType());
        ObjectNode project = fields.putObject("project");
        project.put("id", issueCreateBO.getProjectId());
        fields.put("description", issueCreateBO.getDescription());
        ObjectNode priority = fields.putObject("priority");
        priority.put("id", "10002");
        ObjectNode timeTracking = fields.putObject("timetracking");
        timeTracking.put("remainingEstimate", issueCreateBO.getRemainingEstimate());
        timeTracking.put("originalEstimate", issueCreateBO.getEstimate());
        ObjectNode assignee = fields.putObject("assignee");
        assignee.put("name", issueCreateBO.getAssigneeName());
        ObjectNode customField10511 = fields.putObject("customfield_10511");
        customField10511.put("id", issueCreateBO.getTaskType());
        fields.put("customfield_10501", issueCreateBO.getStartDate());
        fields.put("customfield_10500", issueCreateBO.getEndDate());
        return payload;
    }


    /**
     * 初始化私有化参数
     */
    public static ObjectNode buildPrivatePayLoad(IssueCreateBO issueCreateBO) {
        JsonNodeFactory jnf = JsonNodeFactory.instance;
        ObjectNode payload = jnf.objectNode();
        ObjectNode fields = payload.putObject("fields");
        fields.put("summary", issueCreateBO.getSummary());
        ObjectNode parent = fields.putObject("parent");
        parent.put("key", issueCreateBO.getParentKey());
        ObjectNode issuetype = fields.putObject("issuetype");
        issuetype.put("id", issueCreateBO.getIssueType());
        ObjectNode project = fields.putObject("project");
        project.put("id", issueCreateBO.getProjectId());
        fields.put("description", issueCreateBO.getDescription());
        ObjectNode priority = fields.putObject("priority");
        priority.put("id", "10002");
        ObjectNode timeTracking = fields.putObject("timetracking");
        timeTracking.put("remainingEstimate", issueCreateBO.getRemainingEstimate());
        timeTracking.put("originalEstimate", issueCreateBO.getEstimate());
        ObjectNode assignee = fields.putObject("assignee");
        assignee.put("name", issueCreateBO.getAssigneeName());
        ObjectNode customField10511 = fields.putObject("customfield_10511");
        customField10511.put("id", issueCreateBO.getTaskType());
        fields.put("customfield_10501", issueCreateBO.getStartDate());
        fields.put("customfield_10500", issueCreateBO.getEndDate());

        ArrayNode customfield_11300 = fields.putArray("customfield_11300");
        customfield_11300.add(issueCreateBO.getReferenceKey());

        ObjectNode customfield_10510 = fields.putObject("customfield_10510");
        customfield_10510.put("id", issueCreateBO.getParentProductLineEnum().getCode());
        ObjectNode child = customfield_10510.putObject("child");
        child.put("id", issueCreateBO.getChildProductLineEnum().getCode());


        return payload;
    }
}
