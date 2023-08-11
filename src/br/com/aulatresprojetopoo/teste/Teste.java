package br.com.aulatresprojetopoo.teste;

import br.com.aulatresprojetopoo.model.Aluno;
import br.com.aulatresprojetopoo.model.Funcionario;
import br.com.aulatresprojetopoo.model.Professor;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		aluno.setNome("Alexander");
		aluno.setIdade(28);
		aluno.setRm(201210);

		System.out.println("Nome do Aluno: " + aluno.getNome() + "\n Idade do aluno " + aluno.getIdade()
				+ "\n RM do aluno " + aluno.getRm());
		Professor professor = new Professor();

		professor.setNome("Valter");
		professor.setIdade(30);
		professor.setMateria("Banco de Dados");
		professor.setSalario(2.500);

		System.out.println("\nNome do Professor: " + professor.getNome() + "\n Idade do professor: "
				+ professor.getIdade() + "\n Materia do professor: " + professor.getMateria() + "\n Salario "
				+ professor.getSalario());

		Funcionario funcionario = new Funcionario();

		funcionario.setNome("Joãozinho");
		funcionario.setIdade(20);
		funcionario.setSalario(2000);
		funcionario.setSetor("Manutenção");

		System.out.println("\nNome do Funcionario: " + funcionario.getNome() + "\n Idade do funcionario: "
				+ funcionario.getIdade() + "\n Setor do funcionario: " + funcionario.getSetor() + "\n Salario "
				+ funcionario.getSalario());

	}

}
