import javax.swing.*;
import java.util.Scanner;


public class Main {
    public static void main(String [] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        String x = JOptionPane.showInputDialog("Dame un dato");
        String y = JOptionPane.showInputDialog("Dame un segundo dato");
        String z = JOptionPane.showInputDialog("Dame un tercer dato");

        double numero1 = Integer.parseInt(x);
        double numero2 = Integer.parseInt(x);
        double numero3 = Integer.parseInt(x);
        double promedio = (numero1 + numero2 + numero3)/3;

        System.out.println("El promedio es: " + promedio);
    }
}