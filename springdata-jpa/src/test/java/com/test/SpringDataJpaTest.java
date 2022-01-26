package com.test;

import com.tuling.config.SpringDataJPAConfig;
import com.tuling.pojo.Customer;
import com.tuling.repositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

/**
 * @author libo.a
 * @date 2022/1/26 4:39 PM
 */
@ContextConfiguration(classes = SpringDataJPAConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringDataJpaTest {

    @Autowired
    CustomerRepository repository;

    @Test
    public void test() {
        Customer customer = new Customer();
        customer.setCustName("李四");
        repository.save(customer);
    }

    @Test
    public void testF() {
        Optional<Customer> byId = repository.findById(1L);
        System.out.println(byId.get());
    }
}
