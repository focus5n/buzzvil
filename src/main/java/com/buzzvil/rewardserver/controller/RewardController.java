package com.buzzvil.rewardserver.controller;

import com.buzzvil.rewardserver.dto.AdDto;
import com.buzzvil.rewardserver.dto.UserDto;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.function.EntityResponse;

import java.io.IOException;

@Slf4j
@RestController
public class RewardController {

    @GetMapping("/request-ad")
    public AdDto ad(@RequestBody UserDto userDto) {

        AdDto output = new AdDto();

        return output;
    }

}
