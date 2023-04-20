package com.reboot.movigation.movie.repository;

import com.reboot.movigation.movie.dto.MovieViewDto;
import com.reboot.movigation.movie.entity.MovieEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MovieRepositoryImpl {

    private final MovieJpaRepository movieJpaRepository;

    @Override
    public MovieViewDto getMovieViewDto(MovieEntity movieEntity) {

    }

}
