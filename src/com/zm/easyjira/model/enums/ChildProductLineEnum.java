package com.zm.easyjira.model.enums;


public enum ChildProductLineEnum {
    呼叫中心(ParentProductLineEnum.易联, "13800"),
    统一训练平台(ParentProductLineEnum.易联, "11635"),
    智能外呼(ParentProductLineEnum.易联, "11636"),
    智能接待(ParentProductLineEnum.易联, "11695"),
    智能客服(ParentProductLineEnum.易联, "11637"),
    辅助机器人(ParentProductLineEnum.易联, "11638"),
    营销机器人(ParentProductLineEnum.易联, "11696"),
    智能知识库(ParentProductLineEnum.易联, "11697"),
    智能质检(ParentProductLineEnum.易联, "11698"),
    百应好声音(ParentProductLineEnum.易联, "11723"),
    智能催收系统(ParentProductLineEnum.易联, "11743"),
    天盾(ParentProductLineEnum.易联, "13801"),
    自定义报表(ParentProductLineEnum.易联, "11910"),
    工作手机(ParentProductLineEnum.灵析, "13620"),
    在线客服(ParentProductLineEnum.易窗, "13621"),
    视频客服(ParentProductLineEnum.易窗, "13622"),
    协同工单(ParentProductLineEnum.易窗, "13623"),
    虚拟数字人(ParentProductLineEnum.易窗, "13624"),
    AIPH(ParentProductLineEnum.易窗, "13625"),

    BA平台(ParentProductLineEnum.安盾, "13626"),
    BI平台(ParentProductLineEnum.安盾, "13627"),
    反诈平台(ParentProductLineEnum.安盾, "13628"),

    易聊宝(ParentProductLineEnum.易客, "13900"),
    智能搜客(ParentProductLineEnum.易客, "13629"),
    集客营销(ParentProductLineEnum.易客, "13630"),
    营销自动化(ParentProductLineEnum.易客, "13631"),
    在线商城(ParentProductLineEnum.易客, "13632"),
    智能触客(ParentProductLineEnum.易客, "13633"),
    销售分析(ParentProductLineEnum.易客, "13634"),
    CPQ(ParentProductLineEnum.易客, "13635"),
    客户管理(ParentProductLineEnum.易客, "13636"),
    CRM_APP(ParentProductLineEnum.易客, "13637"),
    CRM小程序(ParentProductLineEnum.易客, "13638"),
    企微通(ParentProductLineEnum.易客, "13639"),
    审批(ParentProductLineEnum.易客, "13640"),
    任务和日程(ParentProductLineEnum.易客, "13641"),
    汇报(ParentProductLineEnum.易客, "13643"),
    日历(ParentProductLineEnum.易客, "13644"),

    数据中心(ParentProductLineEnum.数据中台, "11701"),
    CDP(ParentProductLineEnum.数据中台, "11702"),

    通信中台(ParentProductLineEnum.通信中台, "13606"),

    API开放平台(ParentProductLineEnum.公共服务, "10319"),
    官网(ParentProductLineEnum.公共服务, "11000"),
    导入导出(ParentProductLineEnum.公共服务, "11219"),
    账号管理(ParentProductLineEnum.公共服务, "10618"),
    企业(ParentProductLineEnum.公共服务, "10619"),
    费用(ParentProductLineEnum.公共服务, "10620"),
    帮助中心(ParentProductLineEnum.公共服务, "10621"),
    系统设置(ParentProductLineEnum.公共服务, "11733"),
    其他(ParentProductLineEnum.公共服务, "11736"),
    百应星球(ParentProductLineEnum.公共服务, "13700"),
    Boss后台(ParentProductLineEnum.公共服务, "13701"),
    OPE后台(ParentProductLineEnum.公共服务, "13702"),
    星图(ParentProductLineEnum.公共服务, "13703"),

    前端生态圈共建(ParentProductLineEnum.研发工具链, "10702"),
    效能改进(ParentProductLineEnum.研发工具链, "10703"),
    运维生态圈(ParentProductLineEnum.研发工具链, "10706"),

    研发运营(ParentProductLineEnum.产研运营, "14201"),


    ;

    private ParentProductLineEnum parentProductLineEnum;

    private String code;

    ChildProductLineEnum(ParentProductLineEnum parentProductLineEnum, String code) {
        this.parentProductLineEnum = parentProductLineEnum;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public ParentProductLineEnum getParentProductLineEnum() {
        return parentProductLineEnum;
    }
}
