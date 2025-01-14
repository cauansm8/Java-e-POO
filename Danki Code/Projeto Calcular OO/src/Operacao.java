
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cauan
 */
public class Operacao {
    private double nm1, nm2, resultado;

    public void setNm1(double nm1) {
        this.nm1 = nm1;
    }

    public void setNm2(double nm2) {
        this.nm2 = nm2;
    }

    public void Calcular (int escolha)
    {
            switch (escolha)
            {
            case 1:
            resultado = nm1 + nm2;   
            break;

            case 2:
            resultado = nm1 - nm2;
            break;

            case 3:
            resultado = nm1 * nm2;
            break;

            case 4:
            if (nm2 != 0)
            {
                resultado = nm1 / nm2;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Não é possível dividir por zero");
            }
            break;

            default:
                JOptionPane.showMessageDialog(null, "Nenhuma operação foi escolhida!!");
            break;
            }
            
     }
    
    public double getResultado() {
        return resultado;
    }
    
    
    
    
}
