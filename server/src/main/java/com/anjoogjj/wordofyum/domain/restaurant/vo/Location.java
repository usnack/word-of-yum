package com.anjoogjj.wordofyum.domain.restaurant.vo;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Location {
    private double x;
    private double y;
    private String roadAddress;
    private String englishAddress;
}
