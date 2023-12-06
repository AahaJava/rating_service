package com.ahk.rating.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahk.rating.entities.Rating;
import com.ahk.rating.exception.ResourceNotFoundException;
import com.ahk.rating.repositories.RatingRepository;
import com.ahk.rating.service.RatingService;


@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	RatingRepository repository;
	@Override
	public Rating saveRating(Rating rating) {
		rating.setRatingId(UUID.randomUUID().toString());
		return repository.save(rating);
	}

	@Override
	public List<Rating> getAllRatings() {
		return repository.findAll();
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		
		return repository.findByHotelId(hotelId);
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		return repository.findByUserId(userId);

	}

	
}
