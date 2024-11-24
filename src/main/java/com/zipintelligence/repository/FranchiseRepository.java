package com.zipintelligence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.zipintelligence.model.Franchise;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Franchise", description = "Franchise APIs")
@RepositoryRestResource(path="franchise", collectionResourceRel="franchise")
public interface FranchiseRepository extends JpaRepository<Franchise, Integer> {

}