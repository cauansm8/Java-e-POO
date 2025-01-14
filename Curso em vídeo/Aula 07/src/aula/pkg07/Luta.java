
package aula.pkg07;

import java.util.Random;

public class Luta {
        private Lutador desafiado;
        private Lutador desafiante;
        private int rounds;
        private boolean aprovada;

        public Lutador getDesafiado() {
            return desafiado;
        }

        public void setDesafiado(Lutador desafiado) {
            this.desafiado = desafiado;
        }

        public Lutador getDesafiante() {
            return desafiante;
        }

        public void setDesafiante(Lutador desafiante) {
            this.desafiante = desafiante;
        }

        public int getRounds() {
            return rounds;
        }

        public void setRounds(int rounds) {
            this.rounds = rounds;
        }

        public boolean getAprovada() {
            return aprovada;
        }

        public void setAprovada(boolean aprovada) {
            this.aprovada = aprovada;
        }
        
        
        
        public void marcarLuta(Lutador l1, Lutador l2){
            if (l1.getCategoria() == l2.getCategoria()){
                    if (l1 != l2){
                        this.setAprovada (true);
                        this.setDesafiado (l1);
                        this.setDesafiante (l2);
                        System.out.println("LUTA APROVADA!!!!");
                        
                    }
                    else {
                        this.setAprovada (false);
                        this.setDesafiado (null);
                        this.setDesafiante (null);
                        System.out.println("Lutadores iguais nao podem lutar -> luta nao realizada");
                    }
            }
            else {
                this.setAprovada (false);
                this.setDesafiado (null);
                this.setDesafiante (null);
                System.out.println("As categorias dos lutadores sao diferentes!! -> luta nao realizada");
            }
        }
        
        public void lutar(){
                if (this.getAprovada()){
                    this.desafiado.apresentar();
                        this.desafiante.apresentar();
                            
                            Random x = new Random();    
                            int vencedor = x.nextInt (3);       //// determina um numero entre 0, 1 ou 2
                            
                            switch (vencedor)
                            {
                                case 0: /// empate
                                System.out.println("Empate!!!");
                                this.desafiado.empatarLuta();
                                this.desafiante.empatarLuta();
                                break;
                                
                                case 1: /// ganhou o desafiado
                                System.out.println("Desafiado ganhou!!! ->  " + this.desafiado.getNome());
                                this.desafiado.ganharLuta();
                                this.desafiante.perderLuta();
                                break;
                                
                                case 2: /// ganhou o desafiante
                                System.out.println("Desafiante ganhou!!! -> " + this.desafiante.getNome());
                                this.desafiado.perderLuta();
                                this.desafiante.ganharLuta();
                                break;
                            }
                }
                else {
                    System.out.println("Luta nao pode acontecer");
                }
        }
        
}
