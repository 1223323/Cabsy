package com.jash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jash.modal.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
