package com.zipintelligence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.zipintelligence.model.User;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "User", description = "User APIs")
@RepositoryRestResource(path="user", collectionResourceRel="user")
public interface UserRepository extends JpaRepository<User, Integer> {

}