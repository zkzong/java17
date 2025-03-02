# java17

## java

集合

CPU飙升100%
- DeadlockDemo
- JVMCPU

## designpattern



## Spring Boot 3

### test-sb3

**WebMvcConfigurer**

**上传、下载**

文件上传依赖jar包：
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

### db

#### mysql

##### mybatis

多线程读取数据库记录

###### mybatis-plus

spring boot 3依赖mybatis-plus包：
```xml
<dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>mybatis-plus-spring-boot3-starter</artifactId>
    <version>3.5.8</version>
</dependency>
```

使用saveOrUpdate保存或更新mysql数据，可以根据主键id更新，也可以根据指定字段更新。

### rabbit

https://www.bilibili.com/video/BV1Sw4m117aj/?spm_id_from=333.880.my_history.page.click&vd_source=43e61552391289e9e1e841467f81b0c5

### xxljob

动态修改xxljob任务

### apollo

@EnableApolloConfig可以不用加

@ApolloJsonValue

@ApolloConfigChangeListener监听配置变化