package com.reboot.movigation.movie.service;

import com.reboot.movigation.movie.dto.MovieViewDto;
import com.reboot.movigation.movie.repository.MovieJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieJpaRepository movieJpaRepository;


}
