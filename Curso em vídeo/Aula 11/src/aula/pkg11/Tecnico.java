
package aula.pkg11;

public class Tecnico extends Aluno{
    
    protected String registroProfissional;
    
    
    public Tecnico (String nome, int idade, String sexo){
        super (nome, idade, sexo);
    }
    
    public void praticar(){
        System.out.println("Praticando");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
}
