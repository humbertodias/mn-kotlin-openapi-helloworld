# Micronaut - OpenApi

Testing openapi through micronaut with kotlin

## How to

Run

```
./gradlew run
```

Then

### [Swagger-ui](http://localhost:8080/swagger/views/swagger-ui/#)

<img width="1423" alt="imagen" src="https://user-images.githubusercontent.com/9255997/194904998-e6b54812-2ffa-492c-9930-f745c72a20bf.png">

## [OpenAPI](http://localhost:8080/swagger/mn-kotlin-openapi-helloworld-0.0.yml)

```yaml
openapi: 3.0.1
info:
  title: mn-kotlin-openapi-helloworld
  version: "0.0"
paths:
  /hello/{name}:
    get:
      operationId: index
      parameters:
      - name: name
        in: path
        description: The person's name
        required: true
        schema:
          type: string
      responses:
        "200":
          description: The greeting
          content:
            text/plain:
              schema:
                type: string

```


# Ref

- [micronaut-openapi guide](https://micronaut-projects.github.io/micronaut-openapi/latest/guide/)
