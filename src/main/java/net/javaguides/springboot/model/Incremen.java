package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "incremen")
public class Incremen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id_incremen;
	@Column(name ="nombre")
	private String nombre;
	
	public Incremen() {
		super();
	}
	
	public Incremen(long id_incremen,String nombre) {
		super ();
		this.id_incremen = id_incremen;
		this.nombre = nombre;
	}
	public long getId_incremen() {
		return id_incremen;
	}
	public void setId_incremen(long id_incremen) {
		this.id_incremen = id_incremen;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
