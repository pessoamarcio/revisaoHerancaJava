package revisao;

public class especializacao extends cursos{
	
	private String requisito;
	
	public especializacao(int codigoCurso, String nome, int vaga, double valor, String periodo, boolean matricula, String requisito) {
		super(codigoCurso, nome, vaga, valor, periodo, matricula);
		this.requisito = requisito;
		
	}

	public String getRequisito() {
		return requisito;
	}

	public void setRequisito(String requisito) {
		this.requisito = requisito;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("\nPré-requisito para o curso: " + getRequisito());
	}
	
}
