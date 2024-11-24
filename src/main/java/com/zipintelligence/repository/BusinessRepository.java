package com.zipintelligence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.zipintelligence.model.Business;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Business", description = "Business APIs")
@RepositoryRestResource(path="business", collectionResourceRel="business")
public interface BusinessRepository extends JpaRepository<Business, Integer> {

}