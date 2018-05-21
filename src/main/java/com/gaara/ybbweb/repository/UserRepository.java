package com.gaara.ybbweb.repository;

import com.gaara.ybbweb.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface UserRepository extends
    JpaRepository<UserEntity, String>,
    JpaSpecificationExecutor<UserEntity>,
    Serializable {
}
