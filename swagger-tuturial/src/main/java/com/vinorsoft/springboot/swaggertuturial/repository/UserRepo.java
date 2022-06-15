package com.vinorsoft.springboot.swaggertuturial.repository;

import com.vinorsoft.springboot.swaggertuturial.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
}
