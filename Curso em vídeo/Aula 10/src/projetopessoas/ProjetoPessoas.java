
package projetopessoas;


public class ProjetoPessoas {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa ("Cauan", 18, "M");
        Aluno p2 = new Aluno ("Maria", 25, "F");
        Professor p3 = new Professor ("Gustavo", 32, "M");
        Funcionario p4 = new Funcionario("Ana", 42, "F");
        
        p2.setCurso("Java");
        p3.setSalario (2500.75f);
        p4.setSetor ("Estoque");
        
        p1.infos();
        p2.infos();
        p3.infos();
        p4.infos();
        
        
    }
    
}
