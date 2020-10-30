package service;

import repository.JogadorRepository;
import model.Jogador;

public class JogadorService {

	public Jogador GetJogador(int indice) {
		JogadorRepository repository = new JogadorRepository();
		Jogador Jogador = Jogador.GetJogador(indice);
		return Jogador;
	}
}
