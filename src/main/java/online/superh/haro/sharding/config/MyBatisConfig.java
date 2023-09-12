package online.superh.haro.sharding.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-09-12 14:12
 */
@Configuration
//指定Mapper接口
@MapperScan(basePackages = "online.superh.haro.sharding.mapper")
public class MyBatisConfig {

    /**
     * MybatisPlus拦截器配置
     */
    // @Bean
    // public MybatisPlusInterceptor mybatisPlusInterceptor() {
    //     MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
    //     interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));//如果配置多个插件,切记分页最后添加
    //     return interceptor;
    // }

}
