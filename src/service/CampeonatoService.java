package service;

import model.Campeonato;
import repository.CampeonatoRepository;

public class CampeonatoService {

	public Campeonato GetCampeonato(int indice) {
		CampeonatoRepository repository = new CampeonatoRepository();
		Campeonato Campeonato = Campeonato.GetCampeonato(indice);
		return Campeonato;
	}
}
