package com.intiformation.gestioncargaison.dao.implémentation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;

import com.intiformation.gestioncargaison.dao.interfaces.IMarchandiseDAO;
import com.intiformation.gestioncargaison.model.Marchandise;

public class MarchandiseDAO implements IMarchandiseDAO{

	@Override
	public void ajouter(Marchandise entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifier(Marchandise entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimer(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Marchandise getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Marchandise> getAll() {
		EntityManager em = Persistence.createEntityManagerFactory("06_projet").createEntityManager();
		
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		
		return null;
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Marchandise> getMarchandiseByIdCargaison(Long idCargaison) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Marchandise consulterVolume(double volume) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Marchandise consulterPoids(double poids) {
		// TODO Auto-generated method stub
		return null;
	}

}
