package revisao;

public class testeCurso{

	public static void main(String[] args) {
		cursosLivres curso1 = new cursosLivres(1,
				"Java",
				25,
				650,
				"Integral",
				true,
				3,
				300);
	
		especializacao cursos2 = new especializacao(1,
				"Java Avançado",
				20,
				800,
				"Integral",
				true,
				"Java");
		
		curso1.visualizar();
		System.out.println("---------------------------------");
		cursos2.visualizar();
	}
}
