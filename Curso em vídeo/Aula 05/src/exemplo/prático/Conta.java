/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo.prático;


public class Conta {
    
        public int numero;
        protected String tipo;
        // cc -> conta corrente
        // cp -> conta poupança
        private String dono;
        private float saldo;
        private boolean status;

        public Conta (){
            this.setStatus (false);
            this.setSaldo (0);
        }
        
        
        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getDono() {
            return dono;
        }

        public void setDono(String dono) {
            this.dono = dono;
        }

        public float getSaldo() {
            return saldo;
        }

        public void setSaldo(float saldo) {
            this.saldo = saldo;
        }

        public boolean getStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }
        
        // metodos da conta
        
        public void abrirConta(String tipo){
            this.setTipo (tipo);
            this.setStatus(true);
            
            System.out.println("Conta aberta");
            
            if (this.getTipo() == "cc"){
                this.setSaldo(50f);
            }
            else if (this.getTipo() == "cp"){
                this.setSaldo(150f);
            }
            
        }
        
        public void fecharConta(){
            if (this.getSaldo() == 0){
                System.out.println ("Conta fechada");
                this.setStatus (false);
            }
            else if (this.getSaldo() < 0){
                System.out.println ("A conta ta em debito");
            }
            else if (this.getSaldo() > 0){
                System.out.println ("A conta ainda tem dinheiro");
            }
        }
    
        public void depositar(float valor){
            if (this.getStatus() == true){
                System.out.println("Deposito realizado na conta de " + this.getDono());
                this.setSaldo (this.getSaldo() + valor);
            }
            else {
                System.out.println ("Conta nao aberta");
            }
        }

        public void sacar(float valor){
            if (this.getStatus() == true){
                    if (this.getSaldo() >= valor){
                        System.out.println("Dinheiro sacado na conta de " + this.getDono());
                        this.setSaldo (this.getSaldo() - valor);
                    }
                    else {
                        System.out.println("Valor de saque maior que o saldo da conta");
                    }
            }
            else {
                System.out.println ("Conta nao aberta");
            }
        }

        public void pagarMensal(){
            float v;
            
            if (this.getStatus() == true)
            {
                    if (this.getTipo() == "cc")
                    {
                        v = 12f;
                        if (this.getSaldo() > v)
                        {
                            System.out.println("Mensalidade paga na conta de " + this.getDono());
                            this.setSaldo (this.getSaldo() - v);
                        }
                        else
                        {
                            System.out.println("Saldo menor que mensalidade");
                        }
                    }


                    if (this.getTipo() == "cp")
                    {
                        v = 20f;
                        if (this.getSaldo() > v)
                        {
                            System.out.println("Mensalidade paga na conta de " + this.getDono());
                            this.setSaldo (this.getSaldo() - v);
                        }
                        else
                        {
                            System.out.println("Saldo menor que mensalidade");
                        }
                    }   
            }
            else {
                System.out.println ("Conta nao aberta");
            }
        }
        
        public void informacoesConta ()
        {
            System.out.println("--------------------------");
            System.out.println("Numero da conta: " + this.getNumero());
            System.out.println("Tipo da conta: " + this.getTipo());
            System.out.println("Saldo da conta: " + this.getSaldo());
            System.out.println("Dono da conta: " + this.getDono());
            System.out.println("Status da conta: " + this.getStatus());
            System.out.println("-------------------------- \n\n\n");
        }
}
