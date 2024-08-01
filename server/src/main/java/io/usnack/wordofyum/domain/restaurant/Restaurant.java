package io.usnack.wordofyum.domain.restaurant;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.usnack.wordofyum.domain.restaurant.vo.Location;
import io.usnack.wordofyum.domain.review.Review;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Entity
@Table(name = "restaurants")
public class Restaurant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb")
    private Location location;  // JSON 형식의 위치 데이터 (latitude와 longitude 포함)
    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews = new ArrayList<>();
    @Column(updatable = false)
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    public Restaurant(String name, Location location) {
        this.name = name;
        this.location = location;
    }
}
