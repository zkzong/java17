package org.example.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

@SpringBootApplication
public class YfProducerApplication {
    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(YfProducerApplication.class);
        //显示由收集的启动步骤数据ApplicationStartup。需要SpringApplication使用BufferingApplicationStartup.
        application.setApplicationStartup(new BufferingApplicationStartup(2048));
        application.run(args);
        System.out.println("(♥◠‿◠)ﾉﾞ  YfProducerApplication启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
