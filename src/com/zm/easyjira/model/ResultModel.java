package com.zm.easyjira.model;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.ObjectUtils;

import java.util.List;

/**
 * @author 仲谋
 * @description:
 * @date 2021/5/31
 **/
public class ResultModel {


    private boolean isSuccess;
    private String key;
    private String errorMsg;
    private List<String> errorMessages;

    public boolean isSuccess() {
        return (null == errorMsg || "".equals(errorMsg)) && CollectionUtils.isEmpty(errorMessages);
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }

    public void setErrorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
    }
}
