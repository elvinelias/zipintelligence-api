package com.zipintelligence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.zipintelligence.model.Ad;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Ad", description = "Ad APIs")
@RepositoryRestResource(path="ad", collectionResourceRel="ad")
public interface AdRepository extends JpaRepository<Ad, Integer> {

}