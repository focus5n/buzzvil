package com.buzzvil.rewardserver.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class AdDtoIn {

    // 광고 고유식별자
    private Integer id;

    // 광고 이름
    private String name;
    
    // 광고 이미지 주소
    private String imageUrl;
    
    // 광고 클릭 시, 유저가 최종적으로 도착해야 할 광고주 페이지
    private String landingUrl;
    
    // 광고 송출 가중치
    private int weight;
    
    // 광고 송출 가능 국가
    private String targetCountry;
    
    // 광고 타겟 성별
    private String targetGender;
    
    // 광고 클릭 보상
    private int reward;
}
