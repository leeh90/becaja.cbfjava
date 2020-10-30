package service;

import model.Posicao;
import repository.PosicaoRepository;

public class  PosicaoService{

	public Posicao GetPosicao(int indice) {
		PosicaoRepository repository = new PosicaoRepository();
		Posicao Posicao = Posicao.GetPosicao(indice);
		return Posicao;
	}
}