package cn.lzc.miniprograms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//配置Mybatis mapper的扫描路径
@MapperScan("cn.lzc.miniprograms.mapper")
@SpringBootApplication
public class SpringbootMybatisMiniprogramsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisMiniprogramsApplication.class, args);
    }
}
