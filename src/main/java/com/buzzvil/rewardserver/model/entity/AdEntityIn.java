package com.buzzvil.rewardserver.model.entity;

import com.buzzvil.rewardserver.common.CommonBuilder;
import com.buzzvil.rewardserver.model.dto.AdDtoIn;
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
public class AdEntityIn {

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
    public AdEntityIn() {}

    /* Builder */
    private AdEntityIn(AdBuilder builder) {
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
    public static class AdBuilder implements CommonBuilder<AdEntityIn> {
        private final Integer id;
        private final String name;
        private final String imageUrl;
        private final String landingUrl;
        private final int weight;
        private final String targetCountry;
        private final String targetGender;
        private final int reward;

        /* Constructor */
        public AdBuilder(AdDtoIn adDtoIn) {
            this.id = adDtoIn.getId();
            this.name = adDtoIn.getName();
            this.imageUrl = adDtoIn.getImageUrl();
            this.landingUrl = adDtoIn.getLandingUrl();
            this.weight = adDtoIn.getWeight();
            this.targetCountry = adDtoIn.getTargetCountry();
            this.targetGender = adDtoIn.getTargetGender();
            this.reward = adDtoIn.getReward();
        }

        /* Build */
        @Override
        public AdEntityIn build() {
            return new AdEntityIn(this);
        }
    }
}
