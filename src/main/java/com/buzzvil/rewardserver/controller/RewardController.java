package com.buzzvil.rewardserver.controller;

import com.buzzvil.rewardserver.dto.AdDto;
import com.buzzvil.rewardserver.entity.AdEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class RewardController {

    @GetMapping("/request-ad")
    public AdDto ad(@ModelAttribute AdDto adDto) {

        /* DTO to Entity */
        AdEntity entity = new AdEntity.AdBuilder(adDto).build();
        System.out.println(entity);

        /* Service */

        /* Entity to DTO */

        return null;
    }

}
