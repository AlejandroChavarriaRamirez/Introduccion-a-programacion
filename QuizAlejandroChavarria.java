/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class QuizAlejandroChavarria {
    public static void main(String[] args){
        String nombre = JOptionPane.showInputDialog("Nombre del articulo: ");
        nombre = nombre.trim();
        nombre = nombre.toUpperCase();
        String codigo = JOptionPane.showInputDialog("Codigo de categoria: ");
        codigo = codigo.toUpperCase();
        codigo = codigo.trim();
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el "
                + "valor CIF del paquete: "));
        
        Double iva = valor * 0.13; ;
        valor += iva; //Valor mas el Iva
        
        JOptionPane.showMessageDialog(null, "Nombre formateado: " + nombre);
        JOptionPane.showMessageDialog(null, "$" + iva + " Monto de IVA");
        
        
        if("TEC".equals(codigo)) {
            
            Double Tec = valor * 0.05; //Suma de impuesto TEC
            valor += Tec;
            JOptionPane.showMessageDialog(null, "$" + Tec + "Monto Arancel por ser TEC");
        }
        
        if("ROP".equals(codigo)) {
            Double Rop = valor * 0.15; //Suma de impuesto ROP
            valor += Rop;
            JOptionPane.showMessageDialog(null, "$" + Rop + " Monto Arancel por ser ROP");
        }
        
        if("HOG".equals(codigo)) {
            Double Hog = valor * 0.10; //Suma de impuesto HOG
            valor += Hog;
            JOptionPane.showMessageDialog(null, "$" + Hog + " Monto Arancel por ser HOG" );
        }
        
        if (!"TEC".equals(codigo) && !"ROP".equals(codigo) && !"HOG".equals(codigo)){
            Double Cualquier = valor * 0.25; /* Suma de impuesto de 
            cualquier otro */
            valor += Cualquier;
            JOptionPane.showMessageDialog(null, "$" + Cualquier + " Monto Arancel por ser cualquiero otro" );
        }
        
        if (valor > 500){
            valor += 20; // Suma de cobro adicional por manejo especial
            JOptionPane.showMessageDialog(null, "Valor mayor a 500 = $20. Monto Alamancen" );
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Valor menor a 500 = $0. Monto Alamancen" );
        }
        
        JOptionPane.showMessageDialog(null, "Total a pagar: $" + valor);
        
    }
}
