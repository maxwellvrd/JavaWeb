package model.implement;

import java.sql.SQLException;
import java.util.ArrayList;

import model.entity.Aluno;
import model.persistence.AlunoDAO;

public class AlunoDAOImp {

	private AlunoDAO dao = null;

	public AlunoDAOImp() {
		dao = new AlunoDAO();
	}

	public Boolean cadastrar(Aluno a) {
		try {
			dao.cadastrar(a);
		} catch (SQLException e) {
			e.printStackTrace();
			return Boolean.FALSE;
		}

		return Boolean.TRUE;
	}

	public Boolean editar(Aluno a) {
		try {
			dao.atualizar(a);
		} catch (SQLException e) {
			e.printStackTrace();
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	public Boolean excluir(Aluno a) {
		try {
			dao.excluir(a);
		} catch (SQLException e) {
			e.printStackTrace();
			return Boolean.FALSE;
		}

		return Boolean.TRUE;
	}
	
	public Aluno buscar(Aluno a) {
		try {
			return dao.buscarUnitaria(a);
		} catch (SQLException e){
			e.printStackTrace();
		}
		return new Aluno();
	}

	public List<Aluno> listar(Aluno a){
		try {  
			return dao.buscarColecao(a);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new ArrayList<Aluno>();
	}
}
