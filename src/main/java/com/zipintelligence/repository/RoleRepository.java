package com.zipintelligence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.zipintelligence.model.Role;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Role", description = "Role APIs")
@RepositoryRestResource(path="role", collectionResourceRel="role")
public interface RoleRepository extends JpaRepository<Role, Integer> {

}