package com.adrian.sprinbootrestcrud.repositories;

import com.adrian.sprinbootrestcrud.entities.VideoCassette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoCassetteRepository extends JpaRepository<VideoCassette, Long> {
}
