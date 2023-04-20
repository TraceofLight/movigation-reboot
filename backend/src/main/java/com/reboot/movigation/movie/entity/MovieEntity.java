package com.reboot.movigation.movie.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class MovieEntity {

    @Id
    @Column(name = "tmdb_movie_id")
    private Long tmdbMovieId;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "poster_path")
    private String posterPath;

    @Column(name = "vote_average")
    private Float voteAverage;

    @Column(name = "overview")
    private String overview;

    @Builder
    public MovieEntity(Long tmdbMovieId, String movieName, String posterPath, Float voteAverage, String overview) {
        this.tmdbMovieId = tmdbMovieId;
        this.movieName = movieName;
        this.posterPath = posterPath;
        this.voteAverage = voteAverage;
        this.overview = overview;
    }

}
