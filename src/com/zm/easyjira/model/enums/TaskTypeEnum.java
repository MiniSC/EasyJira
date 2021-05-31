package com.zm.easyjira.model.enums;


import java.util.ArrayList;
import java.util.List;

public enum TaskTypeEnum {

    原型设计("10335"),
    视觉设计("10385"),
    交互设计("10386"),
    评审("10435"),
    前端("10336"),
    后端("10337"),
    联调("10339"),
    测试("10340"),
    走查("10394"),
    回归("10395"),
    其他("12000");

    private String code;

    TaskTypeEnum(String code) {
        this.code = code;
    }


    public static List<String> keys() {
        List<String> keyList = new ArrayList<>();
        for (TaskTypeEnum value : TaskTypeEnum.values()) {
            keyList.add(value.name());
        }
        return keyList;
    }

    public static TaskTypeEnum nameOf(String enumName) {
        for (TaskTypeEnum value : TaskTypeEnum.values()) {
            if (enumName.equals(value.name())) {
                return value;
            }
        }
        throw new RuntimeException("不存在的任务类型");
    }


    public String getCode() {
        return code;
    }
}
