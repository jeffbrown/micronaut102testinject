package micronaut102testinject;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/demo")
public class DemoController {

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}