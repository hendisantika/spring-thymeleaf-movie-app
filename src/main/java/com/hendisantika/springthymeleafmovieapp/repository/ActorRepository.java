package com.hendisantika.springthymeleafmovieapp.repository;

import com.hendisantika.springthymeleafmovieapp.domain.Actor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-thymeleaf-movie-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/12/19
 * Time: 16.18
 */

@Repository
public interface ActorRepository extends CrudRepository<Actor, Long> {
    List<Actor> findByGenre(String genre);
}