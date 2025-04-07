package mx.com.edifact.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ITIC Roger Azcorra Novelo [RJAN]
 */
@Controller
public class ProjectsController {

    @GetMapping("/projects")
    public String index() {
        return "projects";
    }
 
}
