package smartcoachIbatis.principal;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.List;

import smartcoachIbatis.dao.ObjetivoDaoImpl;
import smartcoachIbatis.dao.PerfilDeportivoDaoImpl;
import smartcoachIbatis.model.Objetivo;
import smartcoachIbatis.model.PerfilDeportivo;

public class Principal {
	/**
	* @param args
	* @throws SQLException 
	*/
	public static void main(String[] args) throws SQLException {
	// TODO Auto-generated method stub
						
		try {
			// Uso de la BD cursos
			PerfilDeportivoDaoImpl perfilDeportivoDao = new PerfilDeportivoDaoImpl();	
			ObjetivoDaoImpl objetivoDaoImpl = new ObjetivoDaoImpl();
			
			// Se obtiene el perfil deportivo D0000
			PerfilDeportivo perfilDeportivo0 = perfilDeportivoDao.getPerfilDeportivo("D0000");
			
			System.out.printf("PerfilDeportivo recuperado: %s \n",perfilDeportivo0.toString());
			
			// Muestro la lista de los perfiles deportivos 
			List<PerfilDeportivo> perfilesDeportivos = perfilDeportivoDao.getPerfilesDeportivos();
			if (!(perfilesDeportivos.isEmpty())) {
				for (int i = 0; i < perfilesDeportivos.size(); i++){
					System.out.printf("Imprimo cada curso: %s\n", perfilesDeportivos.get(i).toString());
				}
			}
			
			// Inserto un nuevo perfil deportivo
			PerfilDeportivo perfilDeportivo2 = new PerfilDeportivo();
			perfilDeportivo2.setCodDeportivo("T0002");
			perfilDeportivo2.setExperiencia("PRINCIPIANTE");
			perfilDeportivo2.setHoraIniTrabajo(LocalTime.of(8, 00));
			perfilDeportivo2.setHoraFinTrabajo(LocalTime.of(17, 00));
			perfilDeportivo2.setPatologias("");
			perfilDeportivo2.setCodProfesion("PR000");
			perfilDeportivoDao.addPerfilDeportivo(perfilDeportivo2);
			System.out.printf("El código del perfil insertado es el siguiente: %d\n", perfilDeportivo2.getCodDeportivo());
			
			// Busco el perfil insertado y actualizo su experiencia
			perfilDeportivo0 = perfilDeportivoDao.getPerfilDeportivo("D0000");
			System.out.printf("Perfil recuperado: %s ,ID: %d", perfilDeportivo0.getCodDeportivo());
			perfilDeportivo0.setExperiencia("INTERMEDIO");
			perfilDeportivoDao.updatePerfilDeportivo(perfilDeportivo0);
			
			// Borro el perfil actualizado
			perfilDeportivoDao.deletePerfilDeportivo(perfilDeportivo0);
			
		    // Se crea un nuevo objetivo empleando el procedimiento almacenado
			Objetivo objetivo = new Objetivo();
			objetivo.setCodObjetivo("O0005");
			objetivo.setNombre("Salud");
			objetivo.setDescripcion("");
			objetivo.setFechaInicio(new SimpleDateFormat("yyyy-MM-dd").parse("2021-05-28"));
			objetivo.setFechaPrevistaFin(new SimpleDateFormat("yyyy-MM-dd").parse("2021-09-28"));
			objetivo.setCodDeportivo("T0000");
			System.out.printf("Salida de procedure: %d\n",objetivoDaoImpl.nuevoObjetivoPerfil(objetivo));

			// Se comprueba si se ha creado
		    objetivo = objetivoDaoImpl.getObjetivo("O0005");
		    System.out.printf("Entidad creada: %s \n", objetivo.toString());			
		}
		catch (Exception e){
					System.out.println("TestResource process read source fail"); 
					System.out.println(e.getMessage()); 
		}
	}
}

