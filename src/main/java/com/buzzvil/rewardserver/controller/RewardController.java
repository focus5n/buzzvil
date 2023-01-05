package com.buzzvil.rewardserver.controller;

import com.buzzvil.rewardserver.model.dto.AdDtoIn;
import com.buzzvil.rewardserver.model.dto.AdDtoOut;
import com.buzzvil.rewardserver.model.entity.AdEntityIn;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class RewardController {

    @GetMapping("/request-ad")
    public AdDtoOut ad(@ModelAttribute AdDtoIn input) {

        /* DTO to Entity */
        AdEntityIn entityIn = new AdEntityIn.AdBuilder(input).build();
        System.out.println(entityIn);

        /* Service */

        /* Entity to DTO */
        AdDtoOut output = new AdDtoOut();

        return output;
    }

}
