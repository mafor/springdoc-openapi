package test.org.springdoc.api.app70;

import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/secure")
    @ResponseBody
    public String secured() {
        return "It works!";
    }

    @SecurityRequirements
    @GetMapping("/open")
    @ResponseBody
    public String open() {
        return "It works!";
    }
}
