package service;

import repository.PartidaRepository;
import model.Partida;

public class PartidaService{

	public Partida GetPartida(int indice) {
		PartidaRepository repository = new PartidaRepository();
		Partida Partida = Partida.GetPartida(indice);
		return Partida;
	}
}
