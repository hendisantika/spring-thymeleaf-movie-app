package com.hendisantika.springthymeleafmovieapp.controller;

import com.hendisantika.springthymeleafmovieapp.repository.ActorRepository;
import com.hendisantika.springthymeleafmovieapp.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-thymeleaf-movie-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/12/19
 * Time: 16.20
 */
@Controller
public class MoviesController {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ActorRepository actorRepository;
}
