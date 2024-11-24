package com.zipintelligence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.zipintelligence.model.NewsItem;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "NewsItem", description = "NewsItem APIs")
@RepositoryRestResource(path="newsitem", collectionResourceRel="newsitem")
public interface NewsItemRepository extends JpaRepository<NewsItem, Integer> {

}