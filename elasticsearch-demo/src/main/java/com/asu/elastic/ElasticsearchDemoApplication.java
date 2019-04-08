package com.asu.elastic;

import com.asu.elastic.service.CustomersService;
import com.asu.elastic.models.Customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;

import java.util.List;
//import org.springframework.data.elasticsearch.core.ElasticsearchOperations;


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
        Customer c1= cService.addCustomer(new Customer("name1","address 1",18));
        System.out.println(c1.getId());

        List<Customer> dabanggNamedQuery = cService.getByUserName("dabangg");
        logger.info("Content of dabangg name book {}", dabanggNamedQuery);
    }

}
