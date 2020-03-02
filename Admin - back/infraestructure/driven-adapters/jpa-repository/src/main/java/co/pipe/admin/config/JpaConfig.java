package co.pipe.admin.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.reactivecommons.utils.ObjectMapperImp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JpaConfig {
    @Value("${spring.datasource.driver-class-name}")
    private String dbDriver;
    @Value("${spring.datasource.url}")
    private String connectionString;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;

    @Bean
    public BasicDataSource dataSourceConfig() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(this.dbDriver);
        dataSource.setUrl(this.connectionString);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public ObjectMapperImp objectMapperConfig() {
        return new ObjectMapperImp();
    }

//    @Bean
//    public Function<UserData, User> functionConfig() {
//        return new Function<UserData, User>() {
//            @Override
//            public User apply(UserData userData)
//            {
//                return User.builder().build();
//            }
//        };
//    }

}
