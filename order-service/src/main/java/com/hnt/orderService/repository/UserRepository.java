package com.hnt.orderService.repository;

import org.springframework.data.repository.CrudRepository;
import com.hnt.orderService.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>  {

}
