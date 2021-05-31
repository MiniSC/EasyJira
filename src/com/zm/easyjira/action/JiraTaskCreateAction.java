package com.zm.easyjira.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.zm.easyjira.data.DataCenter;
import com.zm.easyjira.dialog.AddJiraTaskDialog;

public class JiraTaskCreateAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {

        Editor requiredData = e.getRequiredData(CommonDataKeys.EDITOR);
        SelectionModel selectionModel = requiredData.getSelectionModel();
        String selectedText = selectionModel.getSelectedText();
        DataCenter.SELECT_TEXT = selectedText;

        AddJiraTaskDialog addNoteDialog = new AddJiraTaskDialog();
        addNoteDialog.show();

    }
}
