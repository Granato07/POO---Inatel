package br.inatel.poo;

import br.inatel.poo.turmas.Aluno;
import br.inatel.poo.turmas.Turma;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();

        Aluno a1 = new Aluno("Ana", "001", new double[]{8.0, 9.0, 7.5});
        Aluno a2 = new Aluno("Bruno", "002", new double[]{6.0, 7.0, 5.5});
        Aluno a3 = new Aluno("Carlos", "003", new double[]{9.5, 10.0, 9.0});

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);
        turma.adicionarAluno(a3);

        turma.listarAlunos();

        Aluno melhor = turma.buscarMelhorAluno();
        System.out.println("\nMelhor aluno: " + melhor.getNome() + " | Média: " + melhor.calculaMedia());
    }
}