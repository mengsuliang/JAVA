#### Spring系列

##### **1.Spring Boot**
- 快速开发框架，快速整合第三方框架（Maven依赖关系 ### Maven继承），完全采用注解化，简化XML配置，最终以java应用程序进行执行。
- SpringBoot是伴随着Spring 4.0而生的，boot是引导的意思，它的作用其实就是在于帮助开发者快速的搭建Spring框架。
- 使用Spring Boot 可以简化配置、简化部署、简化编码、简化监控。

| 简化配置 | 采用 Java Config 的方式，对 Spring 进行配置。新建一个类，不用 @Service注解，即它是个普通的类，要想使它也成为一个 Bean 让 Spring 去管理，只需要@Configuration 和@Bean两个注解即可 |
| -------- | ------------------------------------------------------------ |
| 简化部署 | 使用 Spring Boot 后，我们不需要在服务器上去部署 tomcat，因为 Spring Boot 内嵌了 tomcat，我们只需要将项目打成 jar 包，使用 java -jar xxx.jar一键式启动项目 |
| 简化编码 | 在使用 Spring 的时候，需要在 pom 文件中添加多个依赖，而 Spring Boot 会帮助开发着快速启动一个 web 容器，在 Spring Boot 中，只需要在 pom 文件中添加如下一个 starter-web 依赖即可 |
| 简化监控 | 引入 spring-boot-start-actuator 依赖，直接使用 REST 方式来获取进程的运行期性能参数，从而达到监控的目的 |