package com.zm.easyjira.model.enums;


import java.util.ArrayList;
import java.util.List;

public enum ProjectEnums {

    /**
     * 百应项目管理
     */
    百应项目管理_PRJ("10636"),

    /**
     * 百应大客户项目管理
     */
    百应大客户项目管理_CSRPRJ("10643");

    private String code;

    ProjectEnums(String code) {

        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static List<String> keys() {
        List<String> keyList = new ArrayList<>();
        for (ProjectEnums value : ProjectEnums.values()) {
            keyList.add(value.name());
        }
        return keyList;
    }

    public static ProjectEnums nameOf(String enumName) {
        for (ProjectEnums value : ProjectEnums.values()) {
            if (enumName.equals(value.name())) {
                return value;
            }
        }
        throw new RuntimeException("不存在的项目");
    }

}
