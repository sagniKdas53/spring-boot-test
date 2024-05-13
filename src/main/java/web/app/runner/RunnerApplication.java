package web.app.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import web.app.runner.run.Location;
import web.app.runner.run.Run;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class RunnerApplication {

    public static final Logger logger = LoggerFactory.getLogger(RunnerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RunnerApplication.class, args);
        logger.info("Started Application");
        logger.debug("Debug message");
        logger.trace("Trace message");
        logger.warn("Warning message");
        logger.error("Error message");
        logger.info("Finished Application");
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            Run run = new Run(1, "Run 1", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.OUTDOOR);
            logger.info(run.toString());
        };
    }
}

// CheckPoint: https://youtu.be/31KTdfRH6nY?t=2506
// https://youtu.be/31KTdfRH6nY?t=2929
// https://youtu.be/31KTdfRH6nY?t=3909