package com.zm.easyjira.window;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

/**
 * @author 仲谋
 * @description:
 * @date 2021/5/31
 **/
public class TaskListWindowFactory implements ToolWindowFactory {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        TaskListWindow noteListWindow = new TaskListWindow(project, toolWindow);
        noteListWindow.init();
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(noteListWindow.getContentPanel(), "", false);
        toolWindow.getContentManager().addContent(content);
    }
}
