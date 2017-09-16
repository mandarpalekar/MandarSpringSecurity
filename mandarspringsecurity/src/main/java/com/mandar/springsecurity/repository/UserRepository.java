package com.mandar.springsecurity.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mandar.springsecurity.model.User;


/**
 * @author Mandar
 *
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Long>{
	User findByEmail(String email);
}
