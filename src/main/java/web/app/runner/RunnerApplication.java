package web.app.runner;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

}

// CheckPoint: https://youtu.be/31KTdfRH6nY?t=2506