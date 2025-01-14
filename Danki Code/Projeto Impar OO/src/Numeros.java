
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cauan
 */
public class Numeros {
     
    private int numero;
    
    // o get nn precisa, pois nn será necessário mostrar o número
    public int getNumero() {
        return numero;
    }
    
    // o set precisa, pois precisa de um parametro para pegar o número
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    
    public void descobrirNm () // método sem retorno
    {
        if (this.numero % 2 == 0)
        {
            JOptionPane.showMessageDialog(null, "Número par");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Número impar");
        }
    }
    
    
    public String mensagemRetorno () // método com retorno
    {
        String mensagem;
        
        
        if (this.numero % 2 == 0)
        {
            mensagem = "O número é par";
        }
        else
        {
            mensagem = "O número é impar";
        }
        
        return mensagem;
    }
    
    
}
