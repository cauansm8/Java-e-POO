
package aula.pkg12.p.sobreposicao;


public class Canguru extends Mamifero{
    
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }
    
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
    
}
