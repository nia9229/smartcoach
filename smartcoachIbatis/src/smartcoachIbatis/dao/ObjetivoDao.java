package smartcoachIbatis.dao;

import java.sql.SQLException;
import java.util.List;

import smartcoachIbatis.model.Objetivo;

public interface ObjetivoDao {
	List<Objetivo> getObjetivos() throws SQLException;
	
	Objetivo getObjetivo(String codObjetivo) throws SQLException;
	
	void addObjetivo(Objetivo objetivo) throws SQLException;

	void updateObjetivo(Objetivo objetivo) throws SQLException;
	
	void deleteObjetivo(Objetivo objetivo) throws SQLException;
	
	Integer nuevoObjetivoPerfil(Objetivo objetivo) throws SQLException;
}
