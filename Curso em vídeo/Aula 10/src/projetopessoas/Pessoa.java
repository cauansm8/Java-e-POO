
package projetopessoas;
public class Pessoa {
    private String nome;
    private int idade; 
    private String sexo;
    
    public Pessoa (String nome, int idade, String sexo){
        this.setNome (nome);
        this.setIdade (idade);
        this.setSexo (sexo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void fazerAniv (){
        this.setIdade (this.getIdade() + 1);
    }
    
    
    public void infos(){
        System.out.println("--------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: "+ this.getSexo());
        System.out.println("--------------------");
    }
}
