package com.buzzvil.rewardserver.entity;

import com.buzzvil.rewardserver.common.CommonBuilder;
import com.buzzvil.rewardserver.dto.AdDto;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "AD_CAMPAIGNS")
@SequenceGenerator(
        name = "ADS_SEQ_GEN",
        sequenceName = "ADS_SEQ",
        allocationSize = 1
)
public class AdEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ADS_SEQ_GEN"
    )
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "IMAGE_URL")
    private String imageUrl;

    @Column(name = "LANDING_URL")
    private String landingUrl;

    @Column(name = "WEIGHT")
    private int weight;

    @Column(name = "TARGET_COUNTRY")
    private String targetCountry;

    @Column(name = "TARGET_GENDER")
    private String targetGender;

    @Column(name = "REWARD")
    private int reward;

    /* Constructor */
    public AdEntity() {}

    /* Builder */
    private AdEntity(AdBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.imageUrl = builder.imageUrl;
        this.landingUrl = builder.landingUrl;
        this.weight = builder.weight;
        this.targetCountry = builder.targetCountry;
        this.targetGender = builder.targetGender;
        this.reward = builder.reward;
    }

    /**
     * AdEntity Builder
     */
    public static class AdBuilder implements CommonBuilder<AdEntity> {
        private final Integer id;
        private final String name;
        private final String imageUrl;
        private final String landingUrl;
        private final int weight;
        private final String targetCountry;
        private final String targetGender;
        private final int reward;

        /* Constructor */
        public AdBuilder(AdDto adDto) {
            this.id = adDto.getId();
            this.name = adDto.getName();
            this.imageUrl = adDto.getImageUrl();
            this.landingUrl = adDto.getLandingUrl();
            this.weight = adDto.getWeight();
            this.targetCountry = adDto.getTargetCountry();
            this.targetGender = adDto.getTargetGender();
            this.reward = adDto.getReward();
        }

        /* Build */
        @Override
        public AdEntity build() {
            return new AdEntity(this);
        }
    }
}
