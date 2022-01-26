package com.tuling.repositories;

import com.tuling.pojo.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * @author libo.a
 * @date 2022/1/26 4:30 PM
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
