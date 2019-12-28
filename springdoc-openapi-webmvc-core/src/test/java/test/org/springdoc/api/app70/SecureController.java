package test.org.springdoc.api.app70;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class SecureController {

    @GetMapping("secure")
    @Operation(description = "Inherited global security")
    @ResponseBody
    public String secure() {
        return "It works!";
    }

    @SecurityRequirements
    @Operation(description = "Overridden global security")
    @GetMapping("public")
    @ResponseBody
    public String open() {
        return "It works!";
    }
}
