/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

/**
 *
 * @author Cauan
 */
public class Caneta {
        public String cor;
        public String modelo;
        private float ponta;
        protected int carga;
        private boolean tampada;
         
        public void status()
        {
            System.out.println("Uma caneta " + this.cor);
            System.out.println ("Modelo: " + this.modelo);
            System.out.println("Ponta: " + this.ponta);
            System.out.println("Carga: " + this.carga);
            System.out.println("Esta tampada? "+ this.tampada);
        }
        
        
        public void rabiscar()
        {
            if (this.tampada == true)
            {
                System.out.println ("ERRO: Caneta tampada");
            }
            
            else
            {
                System.out.println ("Rabiscado");
            }
        }
        
        public void tampar()
        {
            this.tampada = true;
        }
        
        public void destampar()
        {
            this.tampada = false;
        }
        
        public void definir_ponta(float valor)
        {
            this.ponta = valor;
        }
        
}
