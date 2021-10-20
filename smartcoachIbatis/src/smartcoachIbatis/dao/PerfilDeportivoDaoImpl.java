package smartcoachIbatis.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import smartcoachIbatis.model.PerfilDeportivo;

public class PerfilDeportivoDaoImpl implements PerfilDeportivoDao {

	@Override
	public List<PerfilDeportivo> getPerfilesDeportivos() throws SQLException {
		SqlSession session = ConnectionFactory.getSession().openSession();
		PerfilDeportivoDao dao = session.getMapper(PerfilDeportivoDao.class);
		List<PerfilDeportivo> perfilesDeportivos = new ArrayList<PerfilDeportivo>();
		try { 
			perfilesDeportivos = dao.getPerfilesDeportivos(); 
		   	session.commit(); 
		} finally { 
		   	session.close(); 
		}
		return perfilesDeportivos;
	}

	@Override
	public PerfilDeportivo getPerfilDeportivo(String codPerfilDeportivo) throws SQLException {
		SqlSession session = ConnectionFactory.getSession().openSession();
		PerfilDeportivoDao dao = session.getMapper(PerfilDeportivoDao.class);
		PerfilDeportivo perfilDeportivo = new PerfilDeportivo();
		try { 
			perfilDeportivo = dao.getPerfilDeportivo(codPerfilDeportivo);
		   	session.commit(); 
		} finally { 
			session.close(); 
		 }
		 return perfilDeportivo;
	}

	@Override
	public void addPerfilDeportivo(PerfilDeportivo perfilDeportivo) throws SQLException {
		SqlSession session = ConnectionFactory.getSession().openSession();
		PerfilDeportivoDao dao = session.getMapper(PerfilDeportivoDao.class);
		try {
			dao.addPerfilDeportivo(perfilDeportivo);
			session.commit();
		} finally {
			session.close();
		}
		
	}

	@Override
	public void updatePerfilDeportivo(PerfilDeportivo perfilDeportivo) throws SQLException {
		SqlSession session = ConnectionFactory.getSession().openSession();
		PerfilDeportivoDao dao = session.getMapper(PerfilDeportivoDao.class);
		try {
			dao.updatePerfilDeportivo(perfilDeportivo);
			session.commit();
		} finally {
			session.close();
		}
		
	}

	@Override
	public void deletePerfilDeportivo(PerfilDeportivo perfilDeportivo) throws SQLException {
		SqlSession session = ConnectionFactory.getSession().openSession();
		PerfilDeportivoDao dao = session.getMapper(PerfilDeportivoDao.class);
		try {
			dao.deletePerfilDeportivo(perfilDeportivo);
			session.commit();
		} finally {
			session.close();
		}
	}
}
