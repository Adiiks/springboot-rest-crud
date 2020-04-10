package com.adrian.sprinbootrestcrud.services;

import com.adrian.sprinbootrestcrud.entities.VideoCassette;
import com.adrian.sprinbootrestcrud.repositories.VideoCassetteRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class VideoCassetteService {

    private final VideoCassetteRepository videoCassetteRepository;

    public VideoCassetteService(VideoCassetteRepository videoCassetteRepository) {
        this.videoCassetteRepository = videoCassetteRepository;
    }

    public List<VideoCassette> findAll() {
        return videoCassetteRepository.findAll();
    }

    public Optional<VideoCassette> findById(long id) {
        return videoCassetteRepository.findById(id);
    }

    public VideoCassette save(VideoCassette videoCassette) {
        return videoCassetteRepository.save(videoCassette);
    }

    public void deleteById(long id) {
        videoCassetteRepository.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDb() {
        videoCassetteRepository.save(new VideoCassette("Szybcy i wściekli", LocalDate.of(2002, 10, 8)));
        videoCassetteRepository.save(new VideoCassette("Zjawa", LocalDate.of(2017, 1, 24)));
    }
}
