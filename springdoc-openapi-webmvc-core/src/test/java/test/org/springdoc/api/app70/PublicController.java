package test.org.springdoc.api.app70;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SecurityRequirements
@RequestMapping("/public")
public class PublicController {

    @SecurityRequirements({@SecurityRequirement(name = "bearer-jwt")})
    @Operation(description = "Security overridden on the class level, and then on the method level")
    @GetMapping("secure")
    @ResponseBody
    public String secure() {
        return "It works!";
    }


    @Operation(description = "Security overridden on the class level")
    @GetMapping("public")
    @ResponseBody
    public String open() {
        return "It works!";
    }
}
