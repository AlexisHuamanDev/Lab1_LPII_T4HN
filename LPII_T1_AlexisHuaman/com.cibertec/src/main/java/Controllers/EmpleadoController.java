package Controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Empleado;

public class EmpleadoController {
	
	//Creacion de usuario
	public String createEmpleado(String apellidos,String nombres, int edad, String sexo,double salario ) {
		
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
	
		Session session;
		session = sessionFactory.openSession();
		
		try {
			Empleado empleado;
			empleado = new Empleado(apellidos,nombres,edad,sexo,salario);
			
			session.beginTransaction();
			session.save(empleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return "Empleado creado";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			return "Error al crear usuario";
	}
	
	public String deleteEmpleado(int idEmpleado) {

		
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session;
		session = sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class, idEmpleado);
			session.delete(empleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return "Empleado eliminado con exito";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Error al eliminar el empleado";
	}

	public String updateEmpleado(int idEmpleado, double salario) {
		
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session;
		session = sessionFactory.openSession();
		
		try {
			
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class,idEmpleado);
			empleado.setSalario(salario);
			session.update(empleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return "Empleado actualizado correctamente";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "Error al actualizar el empleado";
	}

	public String getEmpleado(int idEmpleado) {
		
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session;
		session = sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class, idEmpleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
			return empleado.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "El empleado no existe";
	}
}
