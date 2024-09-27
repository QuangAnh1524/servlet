package crm.service;

import java.util.List;

import crm.model.Role;
import crm.repository.RoleRepository;

public class RoleService {
	RoleRepository roleRepository = new RoleRepository();
	
	public List<Role> getRole() { 
		return roleRepository.getRole(); 
	}
	
	public boolean deleteByRoleId(int id) {
		return roleRepository.deleteByRoleID(id) > 0 ? true : false; 
	} 
	
	public boolean inseartRole(int id, String name, String description) {
		return roleRepository.insertRole(id, name, description) > 0 ? true : false; 
	}
}
