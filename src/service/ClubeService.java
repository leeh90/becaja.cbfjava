package service;

import model.Clube;
import repository.ClubeRepository;

public class ClubeService {

	public Clube GetClube(int indice) {
		ClubeRepository repository = new ClubeRepository();
		Clube Clube = Clube.GetClube(indice);
		return Clube;
	}
}
