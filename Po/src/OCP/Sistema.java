package OCP;

import java.util.List;
import java.util.ArrayList;

public class Sistema {
	public static void main(String[] args) {
		
		Funcionario roberto = new Vendedor(5,200,"Roberto");
		Funcionario robson = new Assistente( 5000, "Robson");
		Funcionario keilane = new Gerente(3900 ,"Keilane");
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(roberto);
		funcionarios.add(robson);
		funcionarios.add(keilane);
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println("\nFuncionario: "+funcionario.getNome()+" - Salario: "+funcionario.calcula());
		}
	}
}
