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
    public Task getTaskId(int id){
        for(Task item : this.list){
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }
    
    /**
     * Retorna el item de la lista, se requiere el index del item
     * @param index
     * @return Task
     */
    public Task getTaskIndex(int index){
        return this.list.get(index);
    }
    
    /**
     * modificar un item de la lista
     */
    public void setTask(int index, Task task){
        this.list.set(index, task);
    }
    
    /**
     * elimina un item de la lista
     */
    public void removeTask(int index){
        this.list.remove(index);
    }
}
