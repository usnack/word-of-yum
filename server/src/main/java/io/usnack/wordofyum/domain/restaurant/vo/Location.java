package io.usnack.wordofyum.domain.restaurant.vo;

import lombok.*;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Location {
    private double x;
    private double y;
    private String roadAddress;
    private String englishAddress;

    public Location(double x, double y, String roadAddress) {
        this.x = x;
        this.y = y;
        this.roadAddress = roadAddress;
    }
}
