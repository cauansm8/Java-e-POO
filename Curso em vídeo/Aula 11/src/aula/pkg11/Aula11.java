
package aula.pkg11;
public class Aula11 {

    public static void main(String[] args) {
    
        Tecnico t = new Tecnico ("Joao", 19, "M");
        
        t.setRegistroProfissional("bobao");
        t.praticar();
        
        System.out.println(t.toString());
        System.out.println(t.getRegistroProfissional());
    }
    
}
