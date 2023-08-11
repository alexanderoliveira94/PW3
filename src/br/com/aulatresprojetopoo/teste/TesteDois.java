package br.com.aulatresprojetopoo.teste;

import javax.swing.JOptionPane;

import br.com.aulatresprojetopoo.model.Aluno;
import br.com.aulatresprojetopoo.model.Funcionario;
import br.com.aulatresprojetopoo.model.Professor;

public class TesteDois {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno ();
		
		aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
		aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno")));
		aluno.setRm(Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do aluno")));
		
		System.out.println("Nome do Aluno: " + aluno.getNome() + "\n Idade do aluno " + aluno.getIdade()
		+ "\n RM do aluno " + aluno.getRm());
		
		
		Professor professor = new Professor ();
		
		professor.setNome(JOptionPane.showInputDialog("Digite o nome do Professor"));
		professor.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Professor")));
		professor.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Digite o Salario do professor")));
		professor.setMateria(JOptionPane.showInputDialog("Digite o nome da Materia"));
		
		System.out.println("\nNome do Professor: " + professor.getNome() + "\n Idade do professor: "
				+ professor.getIdade() + "\n Materia do professor: " + professor.getMateria() + "\n Salario "
				+ professor.getSalario());
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do Funcionario"));
		funcionario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Funcionario")));
		funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o nome do Funcionario")));
		funcionario.setSetor(JOptionPane.showInputDialog("Digite o nome do setor do Funcionario"));
		
		
		
		

	}
	
	

}
