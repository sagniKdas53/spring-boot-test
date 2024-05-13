package web.app.runner.run;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        String name,
        LocalDateTime startTime,
        LocalDateTime endTime,
        int distance,
        Location location
) {}
