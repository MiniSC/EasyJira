package com.zm.easyjira.window;

import com.intellij.openapi.fileChooser.FileChooser;
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.MessageDialogBuilder;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.ToolWindow;
import com.zm.easyjira.data.DataCenter;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author 仲谋
 * @description:
 * @date 2021/5/31
 **/
public class TaskListWindow {
    private JTable taskTable;
    private JButton refresh;
    private JButton close;
    private JPanel mainPanel;


    public void init() {
        taskTable.setModel(DataCenter.TABLE_MODEL);
        taskTable.setEnabled(true);
    }


    public TaskListWindow(@NotNull Project project, @NotNull ToolWindow toolWindow) {

        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });


        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toolWindow.hide(null);

            }
        });
    }

    public JPanel getContentPanel() {
        return mainPanel;
    }

}
