package com.assignment.weatherinformation.repository;

import com.example.weatherInfo.entity.WeatherInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface WeatherInfoRepository extends JpaRepository<WeatherInfo,Long>{
   Optional<WeatherInfo> findByPincodeAndDate(Integer pincode,LocalDate date);
}
