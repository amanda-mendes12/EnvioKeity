package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Pais {
	private int id;
	private String nome;
	private long populacao;
	private double area;
	
	public Pais() {}
	
	public Pais(int id)  {
		this.id = id;
	}
	
	public Pais(int id, String nome, long populacao, double area) {
		this.id = id;
		this.nome = nome;
		this.populacao = populacao;
		this.area = area;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public long getPopulacao() {
		return populacao;
	}

	public double getArea() {
		return area;
	}

	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public String paisComMaisHabitantes() {
		return "pais";
	}
	
	public String paisComMenorArea() {
		return "pais";
	}
	
	//Conexao banco de dados
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	// Obtendo conexao com o banco de dados
	public Connection obtemConexao() throws SQLException {
		return DriverManager
				.getConnection("jdbc:mysql://localhost:3306/testeunitario?useTimezone=true&serverTimezone=America/Sao_Paulo&user=root&password=");
	}

	@Override
	public String toString() {
		return 	"Nome: " + getNome() +
				"   Populacao: " + getPopulacao() +
				"   Ã�rea: " + getArea();
		
	}
	
	/**@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (populacao.equals(null)) {
			if (other.populacao != null)
				return false;
		} else if (!populacao.equals(other.populacao))
			return false;
		if (id != other.id)
			return false;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		return true;
	}**/
}
