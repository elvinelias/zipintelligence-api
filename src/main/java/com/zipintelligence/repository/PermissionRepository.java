package com.zipintelligence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.zipintelligence.model.Permission;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Permission", description = "Permission APIs")
@RepositoryRestResource(path="permission", collectionResourceRel="permission")
public interface PermissionRepository extends JpaRepository<Permission, Integer> {

}