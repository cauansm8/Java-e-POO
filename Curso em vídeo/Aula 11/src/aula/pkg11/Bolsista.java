
package aula.pkg11;


public final class Bolsista extends Aluno{
    
    protected int bolsa;

    public Bolsista (String nome, int idade, String sexo){
        super (nome, idade, sexo);
    }
    
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno " + this.nome + " que eh bolsista!!");
    }
    
}
