package com.globant.bootcamp.repository;
import com.globant.bootcamp.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Long>{

}
