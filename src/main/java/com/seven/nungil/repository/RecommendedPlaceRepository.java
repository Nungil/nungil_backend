package com.seven.nungil.repository;

import com.seven.nungil.domain.RecommendedPlace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendedPlaceRepository extends JpaRepository<RecommendedPlace, Long>, RecommendedPlaceCustom {
}
