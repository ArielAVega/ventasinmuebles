package ar.edu.unju.fi;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ar.edu.unju.fi.entity.Inmueble;
import ar.edu.unju.fi.enums.TipoInmueble;
import ar.edu.unju.fi.service.InmuebleService;

@SpringBootTest
class ListlInmueblesTest {
	@Autowired
	private InmuebleService inmuebleService;

	@Test
	void insertInmueble() {
		
		List<Inmueble> listInmuebles = inmuebleService.getAll();
		
		if(listInmuebles.size()<=1) {
			try {
				InputStream inputStream = ListlInmueblesTest.class.getResourceAsStream("image02.jpeg");
				byte[] imagenBytes = inputStream.readAllBytes();
				Inmueble inmueble = Inmueble.builder()
						.cantBaños(1)
						.cantHabitaciones(3)
						.descripcion("Casa ubicada en el centro de Jujuy")
						.precio(1700000000.0)
						.tipoInmueble(TipoInmueble.CASA)
						.imagen(imagenBytes)
						.build();
				Inmueble inmuebleGuardado = inmuebleService.insert(inmueble);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		List<Inmueble> listInmuebles1 = inmuebleService.getAll();
		
		assertTrue(listInmuebles.size()<listInmuebles1.size());
		
		
		
		
		
				
	}

}
