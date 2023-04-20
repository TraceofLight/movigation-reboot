package com.reboot.movigation.movie.service;

import com.reboot.movigation.movie.dto.MovieViewDto;

public interface MovieService {

    MovieViewDto readMoviesByTmdbMovieId(Long tmdbMovieId);

}
