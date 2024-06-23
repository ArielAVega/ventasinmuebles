package ar.edu.unju.fi.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.entity.Inmueble;
import ar.edu.unju.fi.repository.InmuebleRepository;
import ar.edu.unju.fi.service.InmuebleService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class InmuebleServiceImp implements InmuebleService{
	private InmuebleRepository inmuebleRepository;

	@Override
	public Inmueble insert(Inmueble inmueble) {
		return inmuebleRepository.save(inmueble);
	}

	@Override
	public List<Inmueble> getAll() {
		return inmuebleRepository.findAll();
	}

}
