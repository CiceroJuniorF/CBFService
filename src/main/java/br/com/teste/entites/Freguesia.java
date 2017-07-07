package br.com.teste.entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="freguesia_entity")
@NamedQuery(name="Freguesia.findAll", query="SELECT f FROM Freguesia f")

public class Freguesia {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_freguesia")
	private Integer idFreguesia;
	
	@Column(name="nome_identifica",nullable=false)	
	private String nomeIndetifica;
	
	
	@OneToOne
	private Funcionario funcionario;
	
	
	@OneToMany(mappedBy = "freguesia", targetEntity = Cliente.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Cliente> clientes;
	

	
	public int getIdFreguesia() {
		return idFreguesia;
	}
	public void setIdFreguesia(int idFreguesia) {
		this.idFreguesia = idFreguesia;
	}
	public String getNomeIndetifica() {
		return nomeIndetifica;
	}
	public void setNomeIndetifica(String nomeIndetifica) {
		this.nomeIndetifica = nomeIndetifica;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
	
	
	
	
	
	
	
	
	

}
