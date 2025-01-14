
package aula.pkg13.p.sobrecarga;

public class Mamifero extends Animal{
    protected String corPele;

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }
    
    
}
