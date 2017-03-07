package com.raja.repository;

import org.springframework.stereotype.Repository;

import com.raja.model.Location;

@Repository
public interface LocationRepository extends abstractRepository<Location, Long> {

}
