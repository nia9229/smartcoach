package smartcoachIbatis.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import smartcoachIbatis.model.Objetivo;

public class ObjetivoDaoImpl implements ObjetivoDao {

	@Override
	public List<Objetivo> getObjetivos() throws SQLException {
		SqlSession session = ConnectionFactory.getSession().openSession();
		ObjetivoDao dao = session.getMapper(ObjetivoDao.class);
		List<Objetivo> objetivos = new ArrayList<Objetivo>();
		try { 
			objetivos = dao.getObjetivos(); 
		   	session.commit(); 
		} finally { 
		   	session.close(); 
		}
		return objetivos;
	}

	@Override
	public Objetivo getObjetivo(String codObjetivo) throws SQLException {
		 SqlSession session = ConnectionFactory.getSession().openSession();
		 ObjetivoDao dao = session.getMapper(ObjetivoDao.class);
		 Objetivo objetivo = new Objetivo();
		 try { 
			 objetivo = dao.getObjetivo(codObjetivo); 
		   	 session.commit(); 
		 } finally { 
		   	session.close(); 
		 }
		 return objetivo;
	}

	@Override
	public void addObjetivo(Objetivo objetivo) throws SQLException {
		SqlSession session = ConnectionFactory.getSession().openSession();
		ObjetivoDao dao = session.getMapper(ObjetivoDao.class);
		try { 
	 		dao.addObjetivo(objetivo);
	 		session.commit(); 
	 	 } finally { 
	 		session.close(); 
	 	 } 
	}

	@Override
	public void updateObjetivo(Objetivo objetivo) throws SQLException {
		SqlSession session = ConnectionFactory.getSession().openSession();
		ObjetivoDao dao = session.getMapper(ObjetivoDao.class);
		try { 
			dao.updateObjetivo(objetivo); 
		 	session.commit(); 
		} finally { 
		 	session.close(); 
		}
	}

	@Override
	public void deleteObjetivo(Objetivo objetivo) throws SQLException {
		SqlSession session = ConnectionFactory.getSession().openSession();
		ObjetivoDao dao = session.getMapper(ObjetivoDao.class);
		try { 
			dao.deleteObjetivo(objetivo);
	 		session.commit(); 
	 	 } finally { 
	 		session.close(); 
	 	 }
	}

	public Integer nuevoObjetivoPerfil(Objetivo objetivo) throws SQLException {
		 SqlSession session = ConnectionFactory.getSession().openSession();
		  
	     HashMap<String, Object> parametros = new HashMap<String, Object>();
		  
		 parametros.put("codObjetivo", objetivo.getCodObjetivo());
		 parametros.put("nombre", objetivo.getNombre());
		 parametros.put("descripcion", objetivo.getDescripcion());
		 parametros.put("fechaInicio", objetivo.getFechaInicio());
		 parametros.put("fechaPrevistaFin", objetivo.getFechaPrevistaFin());
		 parametros.put("codDeportivo", objetivo.getCodDeportivo());
		 parametros.put("salida", new Integer(-1));
	
		 try {	 
	        session.update("nuevoObjetivoPerfil", parametros);
		    session.commit();
			session.close();
		  } 
		  catch (Exception e) {
		    session.rollback();
			e.printStackTrace();
		  }
		  finally { 
			  session.close(); 
		  }
		  return (Integer) parametros.get("salida");
	}
}
