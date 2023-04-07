package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

	private int cargaHoraria;
	
	private String atributos;

	@Override
	public double calcularXp() {
		
		return XP_PADRAO * cargaHoraria;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getAtributos() {
		return atributos;
	}

	public void setAtributos(String atributos) {
		this.atributos = atributos;
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + super.getTitulo() + ", descricao=" + super.getDescricao() + ", cargaHoraria=" + cargaHoraria
				+ ", atributos=" + atributos + "]";
	}
	
	
	
}
