package br.com.cbf.webservice;

import java.util.List;

import javax.ws.rs.core.Response;

import br.com.cbf.dto.AjudanteDTO;
import br.com.cbf.dto.ConsultadorDTO;
import br.com.cbf.dto.MasterDTO;
import br.com.cbf.dto.VendedorDTO;
import br.com.cbf.entites.Ajudante;
import br.com.cbf.entites.Consultador;
import br.com.cbf.entites.Master;
import br.com.cbf.entites.Vendedor;

public interface MasterWebService {
	// --------------------------------------------MASTER---------------------------------------------------------------//
	// -----------------------------------------------------------------------------------------------------------------//
	// -----------------------------------------------------------------------------------------------------------------//
	// -----------------------------------------------------------------------------------------------------------------//
	Response cadastrarOuAtualizarMaster(Master master);

	Response deletarMaster(Integer id);

	List<Master> listarTodosMasterDetalhado();

	List<MasterDTO> listarTodosMasterSimples();

	Response buscaMasterPorIdSimples(Integer id);

	Response buscaMasterPorIdDetalhado(Integer id);
	// -----------------------------------------------------------------------------------------------------------------//

	// ------------------------------------------VENDEDOR---------------------------------------------------------------//
	// -----------------------------------------------------------------------------------------------------------------//
	// -----------------------------------------------------------------------------------------------------------------//
	// -----------------------------------------------------------------------------------------------------------------//

	Response cadastrarOuAtualizarVendedor(Vendedor funcionario);

	List<Vendedor> listarTodosVendedoresDetalhado();

	List<VendedorDTO> listarTodosVendedoresSimples();

	Response buscaVendedorPorIdDetalhado(Integer id);

	Response buscaVendedorPorIdSimples(Integer id);

	Response deletarVendedor(Integer id);
	// -----------------------------------------------------------------------------------------------------------------//

	// ------------------------------------------AJUDANTE---------------------------------------------------------------//
	// -----------------------------------------------------------------------------------------------------------------//
	// -----------------------------------------------------------------------------------------------------------------//
	// -----------------------------------------------------------------------------------------------------------------//

	Response cadastrarOuAtualizarAjudante(Ajudante funcionario);

	List<Ajudante> listarTodosAjudantesDetalhado();

	List<AjudanteDTO> listarTodosAjudantesSimples();

	Response buscaAjudantePorIdDetalhado(Integer id);

	Response buscaAjudantePorIdSimples(Integer id);

	Response deletarAjudante(Integer id);
	// -----------------------------------------------------------------------------------------------------------------//
	
	// ------------------------------------------Consultador------------------------------------------------------------//
	// -----------------------------------------------------------------------------------------------------------------//
	// -----------------------------------------------------------------------------------------------------------------//
	// -----------------------------------------------------------------------------------------------------------------//

	Response cadastrarOuAtualizarConsultador(Consultador funcionario);

	List<Consultador> listarTodosConsultadorsDetalhado();

	List<ConsultadorDTO> listarTodosConsultadorsSimples();

	Response buscaConsultadorPorIdDetalhado(Integer id);

	Response buscaConsultadorPorIdSimples(Integer id);

	Response deletarConsultador(Integer id);
	// -----------------------------------------------------------------------------------------------------------------//
}