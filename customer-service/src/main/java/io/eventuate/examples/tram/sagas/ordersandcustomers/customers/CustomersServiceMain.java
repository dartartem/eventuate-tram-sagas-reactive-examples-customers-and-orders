package io.eventuate.examples.tram.sagas.ordersandcustomers.customers;

import io.eventuate.examples.tram.sagas.ordersandcustomers.customers.web.CustomerWebConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Configuration
@Import({CustomerConfiguration.class, CustomerWebConfiguration.class})
public class CustomersServiceMain {

  public static void main(String[] args) {
    SpringApplication.run(CustomersServiceMain.class, args);
  }
}
