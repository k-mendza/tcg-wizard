package tcg.wizard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import tcg.wizard.service.MTGService;

@SpringBootApplication
public class TcgWizardApplication {

    public static void main(String[] args) {
        SpringApplication.run(TcgWizardApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
