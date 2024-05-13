package web.app.runner.run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/runs")
public class RunController {

    private final RunRepo runRepo;

    @Autowired
    public RunController(RunRepo runRepo) {
        this.runRepo = runRepo;
    }

    @GetMapping("")
    private String getRuns() {
        return runRepo.getRuns();
    }

    @GetMapping("/")
    String home() {
        return "Hello World";
    }

    @GetMapping("/init")
    String init() {
        runRepo.init();
        return runRepo.getRuns();
    }

    @GetMapping("/1")
    String getRun1() {
        return runRepo.getRunsList().get(0).toString();
    }

    @GetMapping("/2")
    String getRun2() {
        return runRepo.getRunsList().get(1).toString();
    }
    
//    @GetMapping("/add")
//    String add() {
//        runRepo.add();
//        return runRepo.getRuns();
//    }


}
