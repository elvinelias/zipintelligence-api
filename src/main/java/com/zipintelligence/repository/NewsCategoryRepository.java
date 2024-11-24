package com.zipintelligence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.zipintelligence.model.NewsCategory;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "NewsCategory", description = "NewsCategory APIs")
@RepositoryRestResource(path="newscategory", collectionResourceRel="newscategory")
public interface NewsCategoryRepository extends JpaRepository<NewsCategory, Integer> {

}