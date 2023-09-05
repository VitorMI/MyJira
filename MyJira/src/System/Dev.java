package System;


import java.util.List;
import java.util.Objects;

public class Dev {

    private String name;

    private String team;

    private List<Task> myTask;

    public Dev(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public String getNome() {
        return name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public Boolean acceptTask(Task newTask){
        for (Task task : myTask){
            if (task.equals(newTask)){
                throw new IllegalArgumentException("Task já atribuida por outro Dev");
            }
        }
        myTask.add(newTask);
        return true;
    }

    public void finishTask(String taskName){
        myTask.removeIf(task -> task.getName().equals(taskName));
    }

    public String listTask(String devName){
        if (devName == null){
            throw new IllegalArgumentException("Dev não cadastrado");
            }
        return myTask.toString();
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(name, dev.name) && Objects.equals(getTeam(), dev.getTeam()) && Objects.equals(myTask, dev.myTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getTeam(), myTask);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", myTask=" + myTask +
                '}';
    }
}
