package nl.jonaskoperdraat.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.dotwebstack.framework", "nl.jonaskoperdraat.api"})
public class Bootstrap {
  public static void main(String[] args) {
    SpringApplication.run(Bootstrap.class, args);
  }
}
