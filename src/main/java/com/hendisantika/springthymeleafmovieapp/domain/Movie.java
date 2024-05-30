package com.hendisantika.springthymeleafmovieapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-thymeleaf-movie-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/12/19
 * Time: 16.17
 */
@Entity
@NoArgsConstructor
@Data
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String productionHouse;
    private String releaseYear;

    @ManyToMany
    private List<Actor> actors;

    public Movie(String title, String productionHouse, String releaseYear, List<Actor> actors) {
        super();
        this.title = title;
        this.productionHouse = productionHouse;
        this.releaseYear = releaseYear;
        this.actors = actors;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getProductionHouse() {
        return productionHouse;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public boolean hasActed(Actor actor) {
        Objects.nonNull(actor);
        for (Actor containActor : getActors()) {
            if (containActor.getId() == actor.getId()) {
                return true;
            }
        }
        return false;
    }
}
