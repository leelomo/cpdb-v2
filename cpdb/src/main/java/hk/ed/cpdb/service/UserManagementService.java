package hk.ed.cpdb.service;

import hk.ed.cpdb.dao.UserDao;
import hk.ed.cpdb.dto.UserRoleDto;
import hk.ed.cpdb.entity.Role;
import hk.ed.cpdb.entity.User;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UserManagementService {

	@Resource
	private UserDao userDao;
	
	@Transactional
	public User editUser(User user){
		User target = userDao.getById(user.getId());
		target.setName(user.getName());
		target.setFullName(user.getFullName());
		target.setPassword(user.getPassword());
		target.setRole(user.getRole());
		target.setDisable(user.getDisable());
		
		return user;
	}
	
	@Transactional
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		return userDao.getById(id);
	}
	
	@Transactional
	public User getByName(String name) {
		// TODO Auto-generated method stub
		return userDao.getByName(name);
	}
	
	@Transactional
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.listAllUser();
	}
	
	@Transactional
	public List<Role> getAllRole() {
		// TODO Auto-generated method stub
		return userDao.listAllRole();
	}
	
	@Transactional
	public List<UserRoleDto> getAllUserListByRole() {
		// TODO Auto-generated method stub
		List<UserRoleDto> dto = new ArrayList<UserRoleDto>();
		
		List<User> users = userDao.listAllUser();
		List<Role> roles = userDao.listAllRole();
		
		for(Role r : roles){
			UserRoleDto targetDto = new UserRoleDto();
			List<User> targetUsers = new ArrayList<User>();
			for(User u : users){
				if(u.getRole().equals(r)){
					targetUsers.add(u);
				}
			}
			targetDto.setRole(r);
			targetDto.setUsers(targetUsers);
			dto.add(targetDto);
		}
		
		return dto;
	}
}
