package com.tejaswini.restfuldocker.repository;

import com.tejaswini.restfuldocker.modals.Driver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Long> {
}
