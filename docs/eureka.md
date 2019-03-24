什么是服务网关
服务网关 = 路由转发 + 过滤器

1、路由转发：接收一切外界请求，转发到后端的微服务上去；

2、过滤器：在服务网关中可以完成一系列的横切功能，例如权限校验、限流以及监控等，这些都可以通过过滤器完成（其实路由转发也是通过过滤器实现的）。

### eureka server 与 eureka client 区别

- spring-cloud-starter-eureka:
Spring Cloud Starter Eureka (deprecated, please use spring-cloud-starter-netflix-eureka-client

- spring-cloud-starter-eureka-server:
Spring Cloud Starter Eureka Server (deprecated, please use spring-cloud-starter-netflix-eureka-server)


- spring-cloud-starter-netflix-eureka-client:
Spring Cloud Starter Netflix Eureka Client

```
Category/License		Group / Artifact	Version	Updates
Apache 2.0		com.netflix.eureka » eureka-client	1.9.8	1.9.9
Apache 2.0		com.netflix.eureka » eureka-core	1.9.8	1.9.9
Apache 2.0		com.netflix.ribbon » ribbon-eureka	2.3.0	2.4.2
BSD		com.thoughtworks.xstream » xstream	1.4.10	1.4.11.1
Apache 2.0		org.springframework.cloud » spring-cloud-starter		
Apache 2.0		org.springframework.cloud » spring-cloud-netflix-hystrix	2.1.1.RELEASE	✔
Apache 2.0		org.springframework.cloud » spring-cloud-netflix-eureka-client	2.1.1.RELEASE	✔
Apache 2.0		org.springframework.cloud » spring-cloud-starter-netflix-archaius	2.1.1.RELEASE	✔
Apache 2.0		org.springframework.cloud » spring-cloud-starter-netflix-ribbon	2.1.1.RELEASE	✔
```

- spring-cloud-starter-netflix-eureka-server:
Spring Cloud Starter Netflix Eureka Server

```
Apache 2.0		com.netflix.ribbon » ribbon-eureka	2.3.0	2.4.2
Apache 2.0		org.springframework.cloud » spring-cloud-starter		
Apache 2.0		org.springframework.cloud » spring-cloud-netflix-eureka-server	2.1.1.RELEASE	✔
Apache 2.0		org.springframework.cloud » spring-cloud-starter-netflix-archaius	2.1.1.RELEASE	✔
Apache 2.0		org.springframework.cloud » spring-cloud-starter-netflix-ribbon	2.1.1.RELEASE	✔
```

说明:
spring cloud中discovery service有许多种实现（eureka、consul、zookeeper等等），@EnableDiscoveryClient基于spring-cloud-commons,@EnableEurekaClient基于spring-cloud-netflix。
就是如果选用的注册中心是eureka，那么就推荐@EnableEurekaClient，如果是其他的注册中心，那么推荐使用@EnableDiscoveryClient。
