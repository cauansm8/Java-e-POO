package projetopessoas;
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public Professor (String nome, int idade, String sexo){
        super (nome, idade, sexo);
    }
    
    public void receberAumento (float valor){
        setSalario (getSalario() + valor);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
