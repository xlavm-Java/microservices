# microservices

Implement one microservice basic in Java 

The goal of this lab is to implement an application with 1 basic microservice.
The microservice-udea-reservation microservice will use a RESTful API, passing it as an input parameter the id of a reservation and receiving the information of this (name of who is associated with the reservation) as a response.

To perform the exercise, we will use Netflix Eureka, as a microservices discovery and registration server. Eureka is embedded within Spring Cloud.

Development will start by starting to generate the projects based on a Maven template that will be built directly
with Spring Boot.

* Deploy an application with 1 basic microservice.
* Use a RESTful API for the implementation of the microservice.
* Use Netflix Eureka as a microservices discovery and registration server.
* Generate the Maven-based microservices.
* Integrate microservices with Zuul.
* Implement a load balancer using Ribbon.
* Use a Circuit-Breaker pattern with Hystrix.