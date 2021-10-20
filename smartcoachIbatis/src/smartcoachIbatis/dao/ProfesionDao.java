package smartcoachIbatis.dao;

import java.sql.SQLException;
import java.util.List;

import smartcoachIbatis.model.Profesion;

public interface ProfesionDao {
	List<Profesion> getProfesiones() throws SQLException;
	
	Profesion getProfesion(String codProfesion) throws SQLException;
	
	void addProfesion(Profesion profesion) throws SQLException;

	void updateProfesion(Profesion profesion) throws SQLException;
	
	void deleteProfesion(Profesion profesion) throws SQLException;
}
