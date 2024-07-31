package com.anjoogjj.wordofyum.domain.restaurant;

import com.anjoogjj.wordofyum.domain.restaurant.vo.Location;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Restaurant {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private Location location;
}
