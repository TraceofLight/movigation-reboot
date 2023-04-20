package com.reboot.movigation.movie.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieViewDto {

    private Long tmdbMovieId;
    private String movieName;
    private String posterPath;
    private Float voteAverage;
    private String overview;

    @Builder
    public MovieViewDto(Long tmdbMovieId, String movieName, String posterPath, Float voteAverage, String overview) {
        this.tmdbMovieId = tmdbMovieId;
        this.movieName = movieName;
        this.posterPath = posterPath;
        this.voteAverage = voteAverage;
        this.overview = overview;
    }

}
