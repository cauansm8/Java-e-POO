
package aula.pkg11;


public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno (String nome, int idade, String sexo){
        super (nome, idade, sexo);
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
    
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno " + this.nome);
    }
    
    
    
}
