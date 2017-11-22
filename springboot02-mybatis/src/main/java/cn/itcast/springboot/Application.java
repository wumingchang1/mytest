package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot的启动类
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年11月19日 上午9:16:18
 * @version 1.0
 */
@SpringBootApplication // 转化成Spring Boot的启动类
public class Application {

	public static void main(String[] args) {
		/** 第二种方式：用run方法运行Spring Boot应用 (去掉Banner) */
		SpringApplication springApplication = new SpringApplication(Application.class); 
		/** 设置横幅模式: 关闭 */
		springApplication.setBannerMode(Mode.OFF);
		/** 运行 */
		springApplication.run(args);
	}
}
