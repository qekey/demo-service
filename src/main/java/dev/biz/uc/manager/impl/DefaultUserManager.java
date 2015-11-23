package dev.biz.uc.manager.impl;

import dev.biz.uc.manager.UserManager;

public class DefaultUserManager {
	
    public boolean login(String userName,String pwd){
    	return true;
    }
	
	public boolean login(String userName,String pwd,String checkCode){
		return true;
	}
	
	public boolean thirdPartyLogin(String thirdPartyId,String openId){
		return true;
	}

}
