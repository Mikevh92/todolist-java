/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.models.Task;
import app.models.TaskList;
/**
 *
 * @author miguelvazquez
 */
public class HomeController {
    private TaskList taskList = new TaskList();
    
    public void addInitTask(String title){
        Task task = new Task();
        task.setTitle(title);
        
        this.taskList.addTask(task);
    }
    
    public Task getTaskSelected(int index){
        return taskList.getTaskIndex(index);
    }
    
    public void setTaskItem(int index, String title, String detail, boolean realizado){
        Task task = new Task();
        task.setTitle(title);
        task.setDetails(detail);
        task.setDone(realizado);
        
        this.taskList.setTask(index, task);
    }
}
