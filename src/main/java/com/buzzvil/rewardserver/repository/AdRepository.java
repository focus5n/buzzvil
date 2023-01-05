package com.buzzvil.rewardserver.repository;

import com.buzzvil.rewardserver.model.entity.ad.AdEntityIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdRepository extends JpaRepository<AdEntityIn, Integer> {}
