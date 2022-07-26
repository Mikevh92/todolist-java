/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package app;

import app.views.Home;
import app.views.TaskDetail;

/**
 *
 * @author miguelvazquez
 */
public class Todolist {
    

    public static void main(String[] args) {
        System.out.println("run...!");
        
        TaskDetail taskDetail = new TaskDetail();
        Home home = new Home(taskDetail);
        home.setVisible(true);
    }
}
