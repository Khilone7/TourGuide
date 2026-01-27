package com.openclassrooms.tourguide.service.record;

public record ClosestAttraction(String name, double attractionLatitude, double attractionLongitude,
                                double userLatitude, double userLongitude,
                                double distanceInMiles, int rewardPoints) {
}