package sz.co.eswatinibank.intranetdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class IntranetDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntranetDiscoveryServerApplication.class, args);
	}

	
}
