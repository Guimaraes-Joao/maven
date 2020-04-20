package vieira.joao.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author João Pedro
 * @return Project with Maven without dependecy.
 *
 */
@SpringBootApplication
public class MavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenApplication.class, args);

        System.out.println("hello word SpringBoot com Maven!");
	}

}
