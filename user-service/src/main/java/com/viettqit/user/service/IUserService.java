package com.viettqit.user.service;

import com.viettqit.user.VO.ResponseTemplateVO;
import com.viettqit.user.entity.User;

public interface IUserService {
    User saveUser(User user);
    ResponseTemplateVO getUserWithDepartment(Long userId);
}
