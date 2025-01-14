package exercicios.práticos;
public class ExerciciosPráticos {

    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro [3]; 
        
        p[0] = new Pessoa ("Cauan", 18, "Masc");
        p[1] = new Pessoa ("Maria", 25, "Fem");
        
        l[0] = new Livro ("Aprendendo Java", "Jose", 300, p[0]);
        l[1] = new Livro ("POO", "Pedro", 500, p[1]);
        l[2] = new Livro ("Java", "Ze", 800, p[0]);
        
        
        l[0].abrir();
        l[0].folhear(56);
        
        l[0].detalhes();
        l[1].detalhes();
        
    }
    
}
