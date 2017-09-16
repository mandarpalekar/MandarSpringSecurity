/**
 * 
 */
package com.mandar.springsecurity.service;

import com.mandar.springsecurity.model.User;

/**
 * @author Mandar
 *
 */
public interface IUserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
