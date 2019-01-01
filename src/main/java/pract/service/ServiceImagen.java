package pract.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pract.model.Imagen;

@Repository
public interface ServiceImagen extends JpaRepository<Imagen, Long> {
}
