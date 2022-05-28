package com.managing.manageProjectApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.managing.manageProjectApi.model.Feature;

public interface FeatureRepository extends CrudRepository<Feature,Integer> {

}
