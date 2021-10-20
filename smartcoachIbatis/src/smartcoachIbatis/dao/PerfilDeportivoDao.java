package smartcoachIbatis.dao;

import java.sql.SQLException;
import java.util.List;

import smartcoachIbatis.model.PerfilDeportivo;

public interface PerfilDeportivoDao {
	List<PerfilDeportivo> getPerfilesDeportivos() throws SQLException;
	
	PerfilDeportivo getPerfilDeportivo(String codPerfilDeportivo) throws SQLException;
	
	void addPerfilDeportivo(PerfilDeportivo perfilDeportivo) throws SQLException;

	void updatePerfilDeportivo(PerfilDeportivo perfilDeportivo) throws SQLException;
	
	void deletePerfilDeportivo(PerfilDeportivo perfilDeportivo) throws SQLException;
}
