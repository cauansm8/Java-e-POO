package aula.pkg07;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cauan
 */
public class Lutador {
        
    // atributos
        private String nome;
        private String nacionalidade;
        private int idade;
        private float altura;
        private float peso;
        private String categoria;
        private int vitoria;
        private int derrota;
        private int empate;
        
        
    // metodos 

        public Lutador(String no, String na, int id, float al, float ps, int vi, int de, int em){
            this.setNome(no);
            this.setNacionalidade(na);
            this.setIdade(id);
            this.setAltura(al);
            this.setPeso(ps);
            this.setVitoria (vi);
            this.setDerrota (de);
            this.setEmpate (em);
        }
        
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNacionalidade() {
            return nacionalidade;
        }

        public void setNacionalidade(String nacionalidade) {
            this.nacionalidade = nacionalidade;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public float getAltura() {
            return altura;
        }

        public void setAltura(float altura) {
            this.altura = altura;
        }

        public float getPeso() {
            return peso;
        }

        public void setPeso(float peso) {
            this.peso = peso;
            this.setCategoria();
        }

        public String getCategoria() {
            return categoria;
        }

        private void setCategoria() {
            if (this.getPeso() < 52.2f){
                this.categoria = "Inválido";
            }
                else if (this.getPeso() <= 70.3f){
                    this.categoria = "Leve";
                }
                    else if (this.getPeso() <= 83.9f){
                        this.categoria = "Médio";
                    }
                        else if (this.getPeso() <= 120.2f){
                            this.categoria = "Pesado";
                        }
                            else {
                                this.categoria = "Inválido";
                            }
        }

        public int getVitoria() {
            return vitoria;
        }

        public void setVitoria(int vitoria) {
            this.vitoria = vitoria;
        }

        public int getDerrota() {
            return derrota;
        }

        public void setDerrota(int derrota) {
            this.derrota = derrota;
        }

        public int getEmpate() {
            return empate;
        }

        public void setEmpate(int empate) {
            this.empate = empate;
        }
        
    // metodos da luta
        
        public void apresentar(){
            System.out.println("-----------------------------");
            System.out.println("Apresentamos o lutador " + this.getNome());
            System.out.println("Origem: " + this.getNacionalidade());
            System.out.println(this.getIdade() + " anos");
            System.out.println(this.getAltura() + " m de altura");
            System.out.println(this.getPeso() + " Kg");
            System.out.println("Ganhou: " + this.getVitoria());
            System.out.println("Perdeu: " + this.getDerrota());
            System.out.println("Empatou: " + this.getEmpate());
            System.out.println("-----------------------------");
            
        }
        
        public void status (){
            System.out.println(this.getNome() + " é um peso " + this.getCategoria());
            System.out.println(this.getVitoria() + " vitorias, ");
            System.out.println(this.getDerrota() + " derrotas, ");
            System.out.println(this.getEmpate() + " empates \n");
            
        }
        
        public void ganharLuta(){
            this.setVitoria (this.getVitoria() + 1);
        }
    
        public void perderLuta(){
            this.setDerrota (this.getDerrota() + 1);
        }
        
        public void empatarLuta(){
            this.setEmpate (this.getEmpate() + 1);
        }
}       
        
