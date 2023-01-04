package com.buzzvil.rewardserver.repository;

import com.buzzvil.rewardserver.entity.AdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdRepository extends JpaRepository<AdEntity, Integer> {}
