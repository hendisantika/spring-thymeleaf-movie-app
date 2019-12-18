package com.hendisantika.springthymeleafmovieapp.controller;

import com.hendisantika.springthymeleafmovieapp.domain.Movie;
import com.hendisantika.springthymeleafmovieapp.repository.ActorRepository;
import com.hendisantika.springthymeleafmovieapp.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/movie/{id}")
    public String movie(@PathVariable Long id, Model model) {
        model.addAttribute("movie", movieRepository.findById(id).get());
        model.addAttribute("actors", actorRepository.findAll());
        return "movie";
    }

    @GetMapping("/movies")
    public String getAllMovies(Model model) {
        model.addAttribute("movies", movieRepository.findAll());
        return "movies";
    }

    @PostMapping("/movies")
    public String addMovie(@RequestParam String title, @RequestParam String productionHouse, @RequestParam String releaseYear, Model model) {
        Movie newMovie = new Movie();
        newMovie.setTitle(title);
        newMovie.setProductionHouse(productionHouse);
        newMovie.setReleaseYear(releaseYear);

        movieRepository.save(newMovie);
        model.addAttribute("movie", newMovie);
        model.addAttribute("actors", actorRepository.findAll());
        return "redirect:/movie/" + newMovie.getId();
    }
}

