package mn.kotlin.openapi.helloworld.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class HelloController {
    /**
     * @param name The person's name
     * @return The greeting
     */
    @Get(uri = "/hello/{name}", produces = [MediaType.TEXT_PLAIN])
    fun index(name: String): String {
        return "Hello $name!"
    }
}