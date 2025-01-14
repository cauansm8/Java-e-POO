/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;


public class Caneta {
        private String modelo;
        private float ponta;
        private boolean tampada;
        
        public Caneta (float p, String m)
        {
            this.tampar();
            this.setPonta(p);
            this.setModelo(m);
        }

        public boolean getTampada() {
            return this.tampada;
        }

        public void setTampada(boolean tampada) {
            this.tampada = tampada;
        }
        
        public void setModelo (String m)
        {
            this.modelo = m;
        }
        
        public void setPonta (float p)
        {
            this.ponta = p;
        }
        
        public String getModelo ()
        {
            return this.modelo;
        }
        
        public float getPonta ()
        {
            return this.ponta;
        }
        
        
        public void tampar()
        {
            this.tampada = true;
        }
        
        public void destampar()
        {
            this.tampada = false;
        }

}
