package cn.ekgc.gred;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>智慧医疗信息平台 - 注册中心启动类</b>
 * @author Administrator
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class GredRegistryStarter {
	public static void main(String[] args) {
		SpringApplication.run(GredRegistryStarter.class, args);
	}
}
