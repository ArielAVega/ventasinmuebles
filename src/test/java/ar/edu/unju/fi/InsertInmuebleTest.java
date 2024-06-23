package ar.edu.unju.fi;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ar.edu.unju.fi.entity.Inmueble;
import ar.edu.unju.fi.enums.TipoInmueble;
import ar.edu.unju.fi.service.InmuebleService;

@SpringBootTest
class InsertInmuebleTest {
	@Autowired
	private InmuebleService inmuebleService;

	@Test
	void insertInmueble() {
		
		try {
			InputStream inputStream = InsertInmuebleTest.class.getResourceAsStream("image01.jpeg");
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
			
			assertNotNull(inmuebleGuardado.getCodigo());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
	}

}
