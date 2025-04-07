package mx.com.edifact.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ITIC Roger Azcorra Novelo [RJAN]
 */
public class ProjectsController {

    @GetMapping("/projects")
    public String index() {
        return "projects";
    }

}
