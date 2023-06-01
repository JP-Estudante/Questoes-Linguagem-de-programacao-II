package FixacaoProva.Fix1;

public class Main {

    public static void main(String[] args) {
        // Crie um objeto Aluno e um objeto Disciplina
        Aluno aluno = new Aluno("João", "Engenharia de Computação", 20);
        Disciplina disciplina = new Disciplina("Programação Java", 60);

        // Exiba os atributos do aluno utilizando os métodos getter
        System.out.println("Nome do Aluno: " + aluno.getNome());
        System.out.println("Idade do Aluno: " + aluno.getIdade());
        System.out.println("Curso do Aluno: " + aluno.getCurso());

        // Exiba os atributos da disciplina utilizando os métodos getter
        System.out.println("Nome da Disciplina: " + disciplina.getNome());
        System.out.println("Carga Horária da Disciplina: " + disciplina.getCargaHoraria());

        // Modifique os atributos do aluno utilizando os métodos setter
        aluno.setNome("Maria");
        aluno.setIdade(22);
        aluno.setCurso("Ciências da Computação");

        // Modifique os atributos da disciplina utilizando os métodos setter
        disciplina.setNome("Banco de Dados");
        disciplina.setCargaHoraria(80);

        // Exiba os atributos atualizados do aluno utilizando os métodos getter
        System.out.println("Nome do Aluno: " + aluno.getNome());
        System.out.println("Idade do Aluno: " + aluno.getIdade());
        System.out.println("Curso do Aluno: " + aluno.getCurso());

        // Exiba os atributos atualizados da disciplina utilizando os métodos getter
        System.out.println("Nome da Disciplina: " + disciplina.getNome());
        System.out.println("Carga Horária da Disciplina: " + disciplina.getCargaHoraria());
    }
}

