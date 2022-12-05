package apllication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import source.Funcionario;

public class Controle_De_Funcionarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos funcionarios serão registrados? ");
		int n = sc.nextInt();
		
		List<Funcionario> listaFuncionario = new ArrayList<>();
		
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Funcionario # " + (i+1));
			
			System.out.print ("id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Nome: ");
			String nome = sc.next();
			
			
			System.out.println("Salario: ");
			double salario = sc.nextDouble();
			
			 listaFuncionario.add(new Funcionario(id,nome,salario));
		}
		
		System.out.println("Informe o ID do funcionario que para incrementar o salario: ");
		int id = sc.nextInt();
		sc.nextLine();
		

		
		Funcionario listaNova = listaFuncionario.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (listaNova == null) {
			System.out.println("Id não encontrado");
			
		}
		else {
			
			System.out.println("Informe o percentual");
			double percentual = sc.nextDouble();
			listaNova.alteraSalario(percentual);
			
		}
		
		System.out.println(listaFuncionario);
		
		sc.close();

	}

}
