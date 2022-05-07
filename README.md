# Getting Started
Basic spring boot deployment.
* Build the application using `mvn clean install`. If you don't have maven installed in your computer then use `./mvnw clean install`
* To Run the application `java -jar restful-docker-0.0.1-SNAPSHOT.jar`
* Then open any web browser and navigate to http://localhost:8080/

(OR)

Deploy the application in Docker:
    
* You can find the Docker configuration in `Dockerfile` in root directory
* Create an image based on the `Dockerfile` using `docker build -t <IMAGE_NAME> .`
* To run the container using the image, `docker run -p 8080:8080 <IMAGE_NAME>`
* Then open any web browser and navigate to http://localhost:8080/


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.7/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.7/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.6.7/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.7/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

