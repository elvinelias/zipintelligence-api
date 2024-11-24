package com.zipintelligence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.zipintelligence.model.Coupon;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Coupon", description = "Coupon APIs")
@RepositoryRestResource(path="coupon", collectionResourceRel="coupon")
public interface CouponRepository extends JpaRepository<Coupon, Integer> {

}