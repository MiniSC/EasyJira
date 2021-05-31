package com.zm.easyjira.utils;


import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.zm.easyjira.model.IssueCreateBO;
import com.zm.easyjira.model.ResultModel;

import static com.zm.easyjira.config.CommonConfig.account;
import static com.zm.easyjira.config.CommonConfig.password;
import static com.zm.easyjira.config.CommonConfig.isPrivateIssue;
import static com.zm.easyjira.utils.CreatePayloadInitService.buildPayLoad;
import static com.zm.easyjira.utils.CreatePayloadInitService.buildPrivatePayLoad;
import static com.zm.easyjira.utils.ObjectMapperCastUtil.initObjectMapper;

/**
 * @author 仲谋
 * @description:
 * @date 2021/5/18
 **/
public class HttpCommandUtils {

    /**
     * 创建问题
     *
     * @param issueCreateBO 问题创建业务对象
     */
    public static ResultModel createIssue(IssueCreateBO issueCreateBO) {
        ObjectNode payload = null;
        //初始化参数列表
        if (isPrivateIssue) {
            payload = buildPrivatePayLoad(issueCreateBO);
        } else {
            payload = buildPayLoad(issueCreateBO);
        }
        HttpResponse<JsonNode> accept = null;
        //初始化参数序列化方法
        initObjectMapper();
        //请求jira创建任务
        try {
            accept = Unirest.post("https://jira.indata.cc/rest/api/2/issue")
                    .basicAuth(account, password)
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .body(payload)
                    .asJson();
        } catch (UnirestException e) {
            e.printStackTrace();
        }

         JsonNode body = accept.getBody();
         String result = body.toString();
        final ResultModel resultModel = JSONObject.parseObject(result, ResultModel.class);
        return resultModel;
    }
}
