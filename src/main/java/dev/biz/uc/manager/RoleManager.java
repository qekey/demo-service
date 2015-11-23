package dev.biz.uc.manager;

import java.util.List;

import dev.biz.uc.entity.Role;

public interface RoleManager {	
	
	public void add(Role role);
	
	public void del(String roleId);
	
	public void update(Role role);
	
	public List<Role> listAll();
	
	public List<Role> list(String roleGroupId);
	
	public Role getRole(String roleId);
	

}
