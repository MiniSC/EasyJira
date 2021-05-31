package com.zm.easyjira.model.enums;


public enum ParentProductLineEnum {
    易联("11613"),
    灵析("13605"),
    易窗("13602"),
    安盾("13600"),
    易客("13603"),
    数据中台("11650"),
    通信中台("11651"),
    公共服务("10318"),
    研发工具链("10438"),
    产研运营("14200");

    private String code;

    ParentProductLineEnum(String code) {

        this.code = code;
    }

    public String getCode() {
        return code;
    }
}



