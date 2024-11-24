package com.zipintelligence.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.zipintelligence.model.RolePermission;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "RolePermission", description = "Role Permission APIs")
@RepositoryRestResource(path="role_permission", collectionResourceRel="role_permission")
public interface RolePermissionRepository extends JpaRepository<RolePermission, Integer>{

}
