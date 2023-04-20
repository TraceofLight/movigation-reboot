package com.reboot.movigation.movie.repository;

import com.reboot.movigation.movie.dto.MovieViewDto;
import com.reboot.movigation.movie.entity.MovieEntity;

public interface MovieRepository {
    MovieViewDto getMovieViewDto(MovieEntity movieEntity);
}
