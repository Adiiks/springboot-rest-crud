package com.adrian.sprinbootrestcrud.controllers;

import com.adrian.sprinbootrestcrud.entities.VideoCassette;
import com.adrian.sprinbootrestcrud.services.VideoCassetteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cassettes")
public class VideoCassetteController {

    private final VideoCassetteService cassetteService;

    public VideoCassetteController(VideoCassetteService cassetteService) {
        this.cassetteService = cassetteService;
    }

    @GetMapping("/all")
    public List<VideoCassette> getAll() {
        return cassetteService.findAll();
    }

    @GetMapping
    public VideoCassette getById(@RequestParam long id) {
        return cassetteService.findById(id).get();
    }

    @PostMapping
    public VideoCassette add(@RequestBody VideoCassette videoCassette) {
        return cassetteService.save(videoCassette);
    }

    @PutMapping
    public VideoCassette update(@RequestBody VideoCassette videoCassette) {
        return cassetteService.save(videoCassette);
    }

    @DeleteMapping
    public void deleteById(@RequestParam long id) {
        cassetteService.deleteById(id);
    }
}
