package web.app.runner.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//@RestController
@Repository
public class RunRepo {
    private final List<Run> runs = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RunRepo runRepo = (RunRepo) o;
        return Objects.equals(runs, runRepo.runs);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(runs);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RunRepo{");
        sb.append("runs=").append(runs);
        sb.append('}');
        return sb.toString();
    }

    //@GetMapping("/runs")
    String getRuns() {
        return this.toString();
    }

    List<Run> getRunsList() {
        return runs;
    }

    void addRun(Run run) {
        runs.add(run);
    }


    @PostConstruct
    public void init() {
        runs.add(new Run(1, "Run 1", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.OUTDOOR));
        runs.add(new Run(2, "Run 2", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 10, Location.INDOOR));
    }
}
