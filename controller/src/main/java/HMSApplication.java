import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages = {"com.basics.*"})
@EntityScan(basePackages = {"com.basics.*"})
@EnableJpaRepositories(basePackages = {"com.basics.*"})
@SpringBootApplication
public class HMSApplication {

    public static void main(String[] args) {
        SpringApplication.run(HMSApplication.class);
    }


}
