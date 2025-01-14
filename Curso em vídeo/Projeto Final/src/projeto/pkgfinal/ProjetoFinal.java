package projeto.pkgfinal;

public class ProjetoFinal {

    public static void main(String[] args) {
       
        Video v[] = new Video[3];
        
        /// 3 videos
        
        v[0] = new Video ("Encapsulamento");
        v[1] = new Video ("Heranca");
        v[2] = new Video ("Polimorfismo");
        
        /// 3 pessoas
        
        Gafanhoto g = new Gafanhoto ("Cauan", 18, "M", "viewer1");
        Gafanhoto g2 = new Gafanhoto ("Maria", 18, "M", "viewer2");
        Gafanhoto g3 = new Gafanhoto ("Jose", 18, "M", "viewer3");
        
        /// 3 pessoas assistindo o video "Encapsulamento"
        
        Visualizacao vi = new Visualizacao (g, v[0]);
        Visualizacao vi2 = new Visualizacao (g2, v[0]);
        Visualizacao vi3 = new Visualizacao (g3, v[0]);
        
        // "Encapsulamento" ganhou like e esta sendo reproduzido
        
        v[0].play();
        v[0].like();
        
        // Recebeu a nota 7 (a avalicao final é a media entre notaTotal / PessoasAssistindo)
        
        vi.avaliar(7);
        
        System.out.println(vi.toString());
        
        
    }
    
}
