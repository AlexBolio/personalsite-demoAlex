package mx.com.edifact.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ITIC Roger Azcorra Novelo [RJAN]
 */
public class ContactoController {

    @GetMapping("/contact")
    public String index() {
        return "contact";
    }

}
