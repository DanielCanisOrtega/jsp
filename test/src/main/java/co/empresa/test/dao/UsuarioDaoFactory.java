package co.empresa.test.dao;

public class UsuarioDaoFactory {
	public static UsuarioDao getUsuarioDao(String type) {
		switch(type) {
		case "mysql":
			return new UsuarioDaoMySQL();
		case "postgresql":
			return new UsuarioDaoPostgreSQL();
		default:
			return new UsuarioDaoMySQL();
			
		}
	}

}
