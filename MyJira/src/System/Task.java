package System;

import java.util.Objects;

public class Task {

    private String name;

    private Integer time;

    private Boolean status;

    public Task(String name, Integer time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getTime() {
        return time;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return Objects.equals(getName(), task.getName()) && Objects.equals(getTime(), task.getTime()) && Objects.equals(getStatus(), task.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getTime(), getStatus());
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", status=" + status +
                '}';
    }
}
