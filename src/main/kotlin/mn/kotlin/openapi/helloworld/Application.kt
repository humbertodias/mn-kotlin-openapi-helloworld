package mn.kotlin.openapi.helloworld

import io.micronaut.runtime.Micronaut.*
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*

@OpenAPIDefinition(
    info = Info(
            title = "mn-kotlin-openapi-helloworld",
            version = "0.0"
    )
)
object Api {
}

fun main(args: Array<String>) {
	run(*args)
}

