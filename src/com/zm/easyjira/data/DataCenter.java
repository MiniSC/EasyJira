package com.zm.easyjira.data;

import com.zm.easyjira.model.NoteData;

import javax.swing.table.DefaultTableModel;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 仲谋
 * @description:
 * @date 2021/5/30
 **/
public class DataCenter {
    /**
     * 选择的文本内容
     */
    public static String SELECT_TEXT;
    /**
     * 文件名
     */
    public static String FILE_NAME;
    /**
     * 笔记列表
     */
    public static List<NoteData> NOTE_LIST = new LinkedList<>();

    public static String[] head = {"Jira key", "任务名称", "描述信息", "用时", "开始时间", "结束时间"};

    public static DefaultTableModel TABLE_MODEL = new DefaultTableModel(null, head);

}
