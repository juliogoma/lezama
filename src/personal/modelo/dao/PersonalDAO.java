package personal.modelo.dao;

import java.util.ArrayList;

import org.hibernate.HibernateException;

import personal.modelo.Personal;

public interface PersonalDAO {
	public void openSession();
	public boolean guardar(Personal personal);
	public Personal eliminar(int id);
	public Personal buscarid(int id);
	public Personal buscarpersonal(String nombre);
	public ArrayList<Personal> listar();
	public void manejaExcepcion(HibernateException he);

}
