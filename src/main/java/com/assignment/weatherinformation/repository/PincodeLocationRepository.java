package com.assignment.weatherinformation.repository;

import com.example.weatherInfo.entity.PincodeLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PincodeLocationRepository extends JpaRepository<PincodeLocation,Integer> {

}
