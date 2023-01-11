package revisao;

public class cursos {
	private int codigoCurso;
	private String nome;
	private int vaga;
	private double valor;
	private String periodo;
	private boolean matricula;
	/**
	 * @param codigoCurso
	 * @param nome
	 * @param vaga
	 * @param valor
	 * @param periodo
	 * @param matricula
	 */
	public cursos(int codigoCurso, String nome, int vaga, double valor, String periodo, boolean matricula) {
		//super();
		this.codigoCurso = codigoCurso;
		this.nome = nome;
		this.vaga = vaga;
		this.valor = valor;
		this.periodo = periodo;
		this.matricula = matricula;
	}
	
	public cursos() {}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVaga() {
		return vaga;
	}

	public void setVaga(int vaga) {
		this.vaga = vaga;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	//isMatricula por ser booleano
	public boolean isMatricula() {
		return matricula;
	}

	public void setMatricula(boolean matricula) {
		this.matricula = matricula;
	}
	
	public void visualizar(){
		System.out.println("Código curso: " + getCodigoCurso() +
		"\nNome do curso: " + getNome() + 
		"\nQuantidade de vagas: " + getVaga() +
		"\nPeriodo do cruso: " + getPeriodo() +
		"\nValor do curso: " + getValor() +
		"\nEstá aceitando matriculas? " + isMatricula());
	}
}
