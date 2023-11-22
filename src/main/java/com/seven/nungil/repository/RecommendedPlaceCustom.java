package com.seven.nungil.repository;

import com.seven.nungil.domain.RecommendedPlace;
import com.seven.nungil.domain.User;

import java.util.List;

public interface RecommendedPlaceCustom {
    List<RecommendedPlace> findRecommendedPlacesByUser(User user);
}
