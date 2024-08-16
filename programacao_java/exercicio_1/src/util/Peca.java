package util;

public class Peca {
	private int peca_id;
	private int peca_qtd;
	private double peca_valor;
	private double peca_soma;

	public Peca(int peca_id, int peca_qtd, double peca_valor) {
		this.peca_id = peca_id;
		this.peca_qtd = peca_qtd;
		this.peca_valor = peca_valor;
	}

	public int getPeca_id() {
		return peca_id;
	}

	public void setPeca_id(int peca_id) {
		this.peca_id = peca_id;
	}

	public int getPeca_qtd() {
		return peca_qtd;
	}

	public void setPeca_qtd(int peca_qtd) {
		this.peca_qtd = peca_qtd;
	}
	
	public double getPeca_valor() {
		return peca_valor;
	}

	public void setPeca_valor(double peca_valor) {
		this.peca_valor = peca_valor;
	}
}