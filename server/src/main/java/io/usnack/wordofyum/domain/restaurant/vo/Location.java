package io.usnack.wordofyum.domain.restaurant.vo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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
