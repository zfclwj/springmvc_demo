package org.andy.service;

import java.util.List;

import org.andy.entity.UserInfo;

public interface UserInfoService {
	// ͨ��Id��ѯUserInfo  
    UserInfo getById(Integer id);  
  
    // ��ѯȫ����UserInfo  
    List<UserInfo> findAll();  
  
    // ���UserInfo  
    Integer save(UserInfo userInfo);  
}
