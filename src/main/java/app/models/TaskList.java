/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.models;

import java.util.ArrayList;

/**
 *
 * @author miguelvazquez
 */
public class TaskList {
    private ArrayList<Task> list = new ArrayList<>();

    public ArrayList<Task> getList() {
        return list;
    }

    public void setList(ArrayList<Task> list) {
        this.list = list;
    }
    
    public void addTask(Task task){
        this.list.add(task);
    }
    
    /**
     * Retorna el item de la lista, se requiere id del item
     * @param id
     * @return Task; 
     */
    public Task getTask(int id){
        for(Task item : this.list){
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }
}
