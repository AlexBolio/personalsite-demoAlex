package mx.com.edifact.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ITIC Roger Azcorra Novelo [RJAN]
 */
public class ResumeController {

    @GetMapping("/resume")
    public String index() {
        return "resume";
    }

}
