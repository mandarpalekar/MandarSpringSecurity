/**
 * 
 */
package com.mandar.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mandar.springsecurity.model.Role;

/**
 * @author Mandar
 *
 */
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role,Long> {
	Role findByRole(String role);
}
