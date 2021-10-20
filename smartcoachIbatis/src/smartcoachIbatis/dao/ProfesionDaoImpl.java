package smartcoachIbatis.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import smartcoachIbatis.model.Profesion;

public class ProfesionDaoImpl implements ProfesionDao {

	@Override
	public List<Profesion> getProfesiones() throws SQLException {
		SqlSession session = ConnectionFactory.getSession().openSession();
		ProfesionDao dao = session.getMapper(ProfesionDao.class);
		List<Profesion> profesiones = new ArrayList<Profesion>();
		try {
			profesiones = dao.getProfesiones();
			session.commit();
		} catch (Exception e) {
			session.close(); 
		}
		return profesiones;
	}

	@Override
	public Profesion getProfesion(String codProfesion) throws SQLException {
		SqlSession session = ConnectionFactory.getSession().openSession();
		ProfesionDao dao = session.getMapper(ProfesionDao.class);
		Profesion profesion = new Profesion();
		try {
			profesion = dao.getProfesion(codProfesion);
			session.commit();
		} catch (Exception e) {
			session.close();
		}
		return profesion;
	}

	@Override
	public void addProfesion(Profesion profesion) throws SQLException {
		SqlSession session = ConnectionFactory.getSession().openSession();
		ProfesionDao dao = session.getMapper(ProfesionDao.class);
		try {
			dao.addProfesion(profesion);
			session.commit();
		} catch (Exception e) {
			session.close();
		}
	}

	@Override
	public void updateProfesion(Profesion profesion) throws SQLException {
		SqlSession session = ConnectionFactory.getSession().openSession();
		ProfesionDao dao = session.getMapper(ProfesionDao.class);
		try {
			dao.updateProfesion(profesion);
			session.commit();
		} catch (Exception e) {
			session.close();
		}
	}

	@Override
	public void deleteProfesion(Profesion profesion) throws SQLException {
		SqlSession session = ConnectionFactory.getSession().openSession();
		ProfesionDao dao = session.getMapper(ProfesionDao.class);
		try {
			dao.deleteProfesion(profesion);
			session.commit();
		} catch (Exception e) {
			session.close();
		}
	}
}
