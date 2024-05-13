package web.app.runner.run;

import java.time.LocalDateTime;
import java.util.Objects;

public class run {

    private int id;
    private String name;

    public run(int id, String name, LocalDateTime startTime, LocalDateTime endTime, int distance) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "run{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", distance=" + distance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        run run = (run) o;
        return id == run.id && distance == run.distance && Objects.equals(name, run.name) && Objects.equals(startTime, run.startTime) && Objects.equals(endTime, run.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, startTime, endTime, distance);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public run() {
    }

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int distance;

}
