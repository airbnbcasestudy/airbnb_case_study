package vn.codegym.airbnb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "vn.codegym.airbnb" })
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class AirbnbCaseStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirbnbCaseStudyApplication.class, args);
    }

}
