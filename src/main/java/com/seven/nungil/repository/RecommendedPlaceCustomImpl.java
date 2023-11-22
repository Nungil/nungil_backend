package com.seven.nungil.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.seven.nungil.domain.QRecommendedPlace;
import com.seven.nungil.domain.QUser;
import com.seven.nungil.domain.RecommendedPlace;
import com.seven.nungil.domain.User;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class RecommendedPlaceCustomImpl implements RecommendedPlaceCustom{
    private final JPAQueryFactory queryFactory;
    @Override
    public List<RecommendedPlace> findRecommendedPlacesByUser(User user){
        QRecommendedPlace qPlace = QRecommendedPlace.recommendedPlace;
        QUser qUser = QUser.user;
        return queryFactory
                .select(qPlace)
                .from(qPlace)
                .where(qPlace.user.eq(user))
                .fetch();
    }
}
