package dev.biz.uc.manager;

import dev.biz.uc.entity.User;

public interface UserManager {	
	
	public boolean login(String userName,String pwd);
	
	public boolean login(String userName,String pwd,String checkCode);
	
	public boolean thirdPartyLogin(String thirdPartyId,String openId);
	
	public String getCheckCode(String userName);
	
	public void logout(String userName);
	
	public String getUserId(String userName);
	
	public String getUserName(String userId);	
	
	public void register(User user);
	
	public void register(String thirdPartyRegisterId,User user);	
	
	public void changePwd(String oldPwd,String newPwd);
	

	
	public User getUserInfo();
	
	
	

}
