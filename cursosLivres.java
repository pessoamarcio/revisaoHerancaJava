package revisao;

public class cursosLivres extends cursos{
	
	private int modulos;
	private double cargaHoraria;
	
	
	public cursosLivres(int codigoCurso, String nome, int vaga, double valor, String periodo, boolean matricula, int modulos, double cargaHoraria) {
		super(codigoCurso, nome, vaga, valor, periodo, matricula);
		this.modulos = modulos;
		this.cargaHoraria= cargaHoraria;
	}
	
	public cursosLivres() {}

	public int getModulos() {
		return modulos;
	}

	public void setModulos(int modulos) {
		this.modulos = modulos;
	}

	public double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("\nQuantidade de módulos: " + getModulos() +
							"\nCarga Horária: " + getCargaHoraria());
	}
}
