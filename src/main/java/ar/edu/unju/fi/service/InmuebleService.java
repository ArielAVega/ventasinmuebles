package ar.edu.unju.fi.service;

import java.util.List;

import ar.edu.unju.fi.entity.Inmueble;

public interface InmuebleService {
	Inmueble insert(Inmueble inmueble);
	List<Inmueble> getAll();

}
