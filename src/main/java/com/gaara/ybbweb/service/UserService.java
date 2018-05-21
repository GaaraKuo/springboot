package com.gaara.ybbweb.service;

import com.gaara.ybbweb.entity.UserEntity;
import com.gaara.ybbweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

@Service
public class UserService{

  @Autowired
  UserRepository userRepository;

  public UserEntity getUserByName(String name) {
    Optional<UserEntity> optionalUserEntity = userRepository.findOne(new Specification<UserEntity>() {
      @Override
      public Predicate toPredicate(Root<UserEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        criteriaQuery.where(criteriaBuilder.equal(root.get("name"), name));
        return null;
      }
    });
    if (optionalUserEntity.equals(Optional.empty())) {
      return null;
    }
    return optionalUserEntity.get();
  }

  public List<UserEntity> findAll() {
    return userRepository.findAll();
  }
}
