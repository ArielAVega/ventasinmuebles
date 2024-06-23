package ar.edu.unju.fi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.entity.Inmueble;

@Repository
public interface InmuebleRepository extends JpaRepository<Inmueble, Integer>{

}
