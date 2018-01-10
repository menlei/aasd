package com.example.demo.core;

import com.example.demo.bean.Userinfo;
import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2018/1/9.
 */
public interface UserInfoRepository extends CrudRepository<Userinfo,Long>{
    public Userinfo findByUsername(String username);
}
