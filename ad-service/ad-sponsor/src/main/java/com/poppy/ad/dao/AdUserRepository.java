package com.poppy.ad.dao;

import com.poppy.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author poppy
 */
public interface AdUserRepository extends JpaRepository<AdUser, Long> {

    /**
     * <h2>根据用户名查找用户记录</h2>
     * */
    AdUser findByUsername(String username);
}