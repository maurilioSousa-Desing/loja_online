package br.com.api.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.backend.modelo.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{

}
