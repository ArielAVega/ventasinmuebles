package ar.edu.unju.fi.entity;

import ar.edu.unju.fi.enums.TipoInmueble;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "inmuebles")
public class Inmueble {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "inm_codigo")
	private Integer codigo;
	@Column(name = "inm_descripcion",nullable = false)
	private String descripcion;
	@Column(name = "inm_precio",nullable = false, length = 200)
	private Double precio;
	@Column(name = "inm_cant_hab",nullable = false)
	private Integer cantHabitaciones;
	@Column(name = "inm_cant_banios",nullable = false)
	private Integer cantBaños;
	@Enumerated(EnumType.STRING)
	@Column(name = "inm_tipo",nullable = false)
	private TipoInmueble tipoInmueble;
	@Lob
	@Column(name = "inm_imagen",nullable = false, columnDefinition = "LONGBLOB")
	private byte[] imagen;
}
