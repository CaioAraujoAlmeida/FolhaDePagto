
public class Empresa {

	public static void main(String[] args) {
	
		Funcionarios cadastro[];

		cadastro = new Funcionarios[10];
		cadastro[0] = new Funcionarios(1, "CHAVES", "Estagiario", 1000);
		cadastro[1] = new Funcionarios(2, "NHONHO", "Estagiario", 2000);
		cadastro[2] = new Funcionarios(3, "FLORINDA", "Estagiario", 3000);
		cadastro[3] = new Funcionarios(4, "SEU BARRIGA", "Estagiario", 4000);
		cadastro[4] = new Funcionarios(5, "KIKO", "GERENTE", 5000);
		cadastro[5] = new Funcionarios(6, "GIRAFALES", "PROFESSOR", 6000);
		cadastro[6] = new Funcionarios(7, "BRUXA 71", "ANALISTA SR", 7000);
		cadastro[7] = new Funcionarios(8, "CHIQUINHA", "AALISTA JR", 8000);
		cadastro[8] = new Funcionarios(9, "GODINES", "GERENTE", 9000);
		cadastro[9] = new Funcionarios(10, "CHAPOLIM", "ANALISTA", 10000);
		
		for (int pos=0; pos < 5; pos++){
			Funcionarios f = lista[pos];
			double salarioLiquido = lista[pos].getSalario() - lista[pos].calcularImposto();
			System.out.printf("++  %d  %-30s  R$  %7.2f   R$ %7.2f  ++ \n",
					lista[pos].getNumRegistro(),
					lista[pos].getNumNome(),
					lista[pos].getNumSalario(),
					lista[pos].calcularImposto(),
					salarioLiquido);
		}
		
	}
}
		
		
		
		
		