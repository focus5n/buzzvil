package com.buzzvil.rewardserver.controller;

import com.buzzvil.rewardserver.model.dto.ad.AdDtoOut;
import com.buzzvil.rewardserver.model.entity.ad.AdEntityIn;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @GetMapping("/get-test")
    public TestOut test(@ModelAttribute TestIn input) {

        /* DTO to Entity */


        /* Service */

        /* Entity to DTO */
        TestOut output = new TestOut();

        return output;
    }
}
