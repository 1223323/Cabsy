package com.jash.service;

import com.jash.exception.DriverException;
import com.jash.exception.RideException;
import com.jash.modal.Driver;
import com.jash.modal.Ride;
import com.jash.modal.User;
import com.jash.request.RideRequest;

public interface RideService {
	
	
	public Ride requestRide(RideRequest rideRequest, User user) throws DriverException;
	
	public Ride createRideRequest(User user, Driver nearesDriver,
			double picupLatitude,double pickupLongitude,
			double destinationLatitude,double destinationLongitude,
			String pickupArea,String destinationArea);
	
	public void acceptRide(Integer rideId) throws RideException;
	
	public void declineRide(Integer rideId, Integer driverId) throws RideException;
	
	public void startRide(Integer rideId,int opt) throws RideException;
	
	public void completeRide(Integer rideId) throws RideException;
	
	public void cancleRide(Integer rideId) throws RideException;
	
	public Ride findRideById(Integer rideId) throws RideException;

}
