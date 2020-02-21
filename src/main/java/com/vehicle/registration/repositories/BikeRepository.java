package com.vehicle.registration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.registration.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
