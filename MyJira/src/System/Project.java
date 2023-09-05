package System;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;

    private Task[] backlog;

    private Dev[] team;

    public Project(String name) {
        this.name = name;
    }

    public void registerTask(String nome, Integer time){
        Task newTask = new Task(nome,time);
    }

    public void registerDev(String name, String team){
        Dev newDev = new Dev(name, team);
    }

    public Boolean assignTaskDev(Task task, Dev dev){
        if (dev == null || task == null){
            throw new IllegalArgumentException("Entradas Invalidas");
        }
        dev.acceptTask(task);
        return true;
    }

    public void finishTask(String task, Dev dev){
        if (dev == null || task == null){
            throw new IllegalArgumentException("Entradas Invalidas");
        }
        dev.finishTask(task);
    }

    public String listDevs(){
        String Devlist = 


    }

}
