package com.poppy.ad.service;

import com.poppy.ad.exception.AdException;
import com.poppy.ad.vo.CreateUserRequest;
import com.poppy.ad.vo.CreateUserResponse;

/**
 * @author poppy
 */
public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
