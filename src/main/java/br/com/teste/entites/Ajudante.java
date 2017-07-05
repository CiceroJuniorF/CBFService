package br.com.teste.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ajudante {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_anjudante")
	private Integer idAjudante;
	
	@OneToOne
	private Freguesia freguesia;
}
