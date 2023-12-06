package com.ahk.rating.service;

import java.util.List;

import com.ahk.rating.entities.Rating;

public interface RatingService {
	Rating saveRating(Rating rating);
	List<Rating> getAllRatings();
	List<Rating> getRatingByUserId(String userId);
	List<Rating> getRatingByHotelId(String hotelId);
}
