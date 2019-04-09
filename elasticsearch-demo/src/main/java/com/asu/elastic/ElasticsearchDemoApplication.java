package com.asu.elastic;

import com.asu.elastic.service.CustomersService;
import com.asu.elastic.models.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


@Configuration
@EnableWebMvc
@EnableSpringDataWebSupport
@SpringBootApplication
public class ElasticsearchDemoApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(ElasticsearchDemoApplication.class);

    @Autowired
    private CustomersService cService;

    public static void main(String[] args) {
        SpringApplication.run(ElasticsearchDemoApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        // test save
        Customer c1 = cService.addCustomer(new Customer("name1", "address 1", 18));
        System.out.println("test save");
        System.out.println(c1.getId());

        // test count
        System.out.println("test count");
        System.out.println(cService.countById());

        // test FindALL
        System.out.println("test FindALL");
        Iterable<Customer> it = cService.findALL();
        for (Customer customer : it) {
            System.out.println(customer);
        }

        // test query
        List<Customer> dabanggNamedQuery = cService.getByUserName("dabangg");
        logger.info("Content of dabangg name book {}", dabanggNamedQuery);
    }

}
