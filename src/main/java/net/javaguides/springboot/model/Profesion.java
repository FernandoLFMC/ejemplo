package net.javaguides.springboot.model;  

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profesion")
public class Profesion {
	

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name ="nombre")
	private String nombre;
	@Column(name = "porcentaje")
	private float porcentaje;
	@Column(name = "date")
	private Date date;

	public Profesion () {
		super();
	}

	public Profesion(long id,String nombre, float porcentaje, Date date ) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.porcentaje = porcentaje;
		this.date = date;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}