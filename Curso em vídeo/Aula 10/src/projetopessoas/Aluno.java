
package projetopessoas;
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public Aluno (String nome, int idade, String sexo){
        super (nome, idade, sexo);
    }
    
    public void cancMatr(){
        System.out.println("Matricula cancelada");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
