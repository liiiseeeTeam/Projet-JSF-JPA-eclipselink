package com.intiformation.gestioncargaison.dao.interfaces;

import java.util.List;

import com.intiformation.gestioncargaison.model.Marchandise;

public interface IMarchandiseDAO extends IGeneraleDAO<Marchandise>{
	
	public List<Marchandise> getMarchandiseByIdCargaison(Long idCargaison);
	
	public boolean volumeTotal(Marchandise marchandise, double volume);
	
	public boolean poidsTotal(Marchandise marchandise, double poids);
	
	public Marchandise consulterVolume(double volume);
	
	public Marchandise consulterPoids(double poids);
	

}
