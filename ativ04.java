import javax.swing.*;

public class ativ04 {

    public static void main(String args[]) {
        int n1, n2;
        double pot, quo;
        String msg = "";
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        
        quo = (double) n1/n2;
        pot = (int) Math.pow(n1, n2);
        
        msg = msg + "Quociente dos dois número: " + quo + "\n";
        msg = msg + "Potencia de " + n1 + " por " + n2 + " = " + pot;
        
        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
        
    }
}
