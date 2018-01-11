package model.persistence;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;

import model.entity.Aluno;

public class AlunoDAO extends ConnectionDAO {

	private Connection conn;

	public AlunoDAO() {
		try {
			conn = getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Erro ao abrir a conexão:" + e.getMessage());
		}
	}

	public void cadastrar(Aluno a) throws SQLException {
		PreparedStatement stmt = null;

		try {
			String sql = "insert into aluno values (null, ?, ?, ?)";
			stmt = conn.prepareStatement(sql);

			stmt.setString(1, a.getNome());
			stmt.setString(2, a.getEmail());
			stmt.setString(3, a.getTelefone());
			stmt.setDate(4, Date.valueOf(a.getDtNascimento()));

			stmt.execute();

		} finally {
			if (conn != null)
				conn.close();
			if (stmt != null)
				stmt.close();
		}
	}

	public void atualizar(Aluno a) throws SQLException {
		PreparedStatement stmt = null;
		try {
			String sql = "update aluno set nome = ?, email = ?, tel = ?, dtNasc = ? where id = ?";

			stmt = conn.prepareStatement(sql);

			stmt.setString(1, a.getNome());
			stmt.setString(2, a.getEmail());
			stmt.setString(3, a.getTelefone());
			stmt.setDate(4, Date.valueOf(a.getDtNascimento()));
			stmt.setLong(5, a.getId());

			stmt.executeUpdate();

		} finally {
			if (conn != null)
				conn.close();
			if (stmt != null)
				stmt.close();
		}
	}

	
	public Aluno buscarUnitaria(Aluno a) throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String condicional = "id = ?";
			if (a.getId() == null)
				condicional = "email = ?";

			String sql = "select * from aluno where " + condicional;
			stmt = conn.prepareStatement(sql);

			if (a.getId() != null)
				stmt.setLong(1, a.getId());
			else
				stmt.setString(1, a.getEmail());

			rs = stmt.executeQuery();
			Aluno aluno = null;
			if (rs.next())
				aluno = criaAluno(rs);
			return aluno;

		} finally {
			if (conn != null)
				conn.close();
			if (stmt != null)
				stmt.close();
			if (rs != null)
				rs.close();
		}

	}
	
	private Aluno criaAluno(ResultSet rs) throws SQLException {
		Aluno a = new Aluno();
		a.setId(rs.getLong(1));
		a.setNome(rs.getString(2));
		a.setEmail(rs.getString(3));
		a.setTelefone(rs.getString(4));
		a.setDtNascimento(rs.getDate(5).toLocalDate());
	
		return a;
	}
	
	public List<Aluno> buscarColecao(Aluno a) throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Aluno> alunos = new ArrayList<Aluno>();
		try {
			String condicional = "";
			
			if (a.getNome() != null)
				condicional = "where nome %?%";

			String sql = "select * from aluno " + condicional;
			
			stmt = conn.prepareStatement(sql);

			if (a.getNome() != null)
				stmt.setString(1, a.getNome());

			rs = stmt.executeQuery();
			
			if(rs.next())
				alunos.add(criaAluno(rs));
			
			return alunos;
			
	
		} finally {
			if (conn != null)
				conn.close();
			if (stmt != null)
				stmt.close();
			if (rs != null)
				rs.close();
		}

	}
	
	public void excluir(Aluno a) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			String sql = "delete from aluno where id = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setLong(1, a.getId());
			
			stmt.execute();
		} finally {
			if (conn != null)
				conn.close();
			if (stmt != null)
				stmt.close();
	}
	
	}
}
