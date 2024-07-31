package io.usnack.wordofyum.domain.restaurant.vo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    private double x;
    private double y;
    private String roadAddress;
    private String englishAddress;
}
