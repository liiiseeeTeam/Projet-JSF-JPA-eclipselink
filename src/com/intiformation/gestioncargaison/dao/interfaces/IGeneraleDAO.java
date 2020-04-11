package com.intiformation.gestioncargaison.dao.interfaces;

import java.util.List;

public interface IGeneraleDAO<T> {
	
	public void ajouter(T entity);

	public void modifier(T entity);

	public void supprimer(Long id);

	public T getById(Long id);

	public List<T> getAll();
	
	public Long count();

}
