package io.usnack.wordofyum.domain.restaurant;

import io.hypersistence.utils.hibernate.type.array.ListArrayType;
import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.usnack.wordofyum.domain.restaurant.vo.Location;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Restaurant {
    @Id @GeneratedValue
    private Long id;
    private String name;
    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb")
    private Location location;
}
