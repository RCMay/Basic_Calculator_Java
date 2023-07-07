package controller;

import java.awt.event.*;
import model.Operaciones;
import ui.CalculadorGUI;

public class CalculadoraController  implements ActionListener{
    private CalculadorGUI vista;
    private Operaciones modelo;

    public CalculadoraController(CalculadorGUI vista, Operaciones modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.plusButton.addActionListener(this);
        this.vista.subButton.addActionListener(this);
        this.vista.mulButton.addActionListener(this);
        this.vista.divButton.addActionListener(this);
        this.vista.exButton.addActionListener(this);
        this.vista.equButton.addActionListener(this);
    }

    public void iniciar(){
        vista.setTitle("Calculadora Simple");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.plusButton) {
            if (modelo.numeroValido(vista.txt.getText())) {
                modelo.setNum1(Double.parseDouble(vista.txt.getText()));
                modelo.setOperador('+');
                vista.txt.setText("");
            }else{
                vista.txt.setText("Error de desbordamiento se excede de 20 digitos");
            }
            
        }
        if (e.getSource() == vista.subButton) {
            if (modelo.numeroValido(vista.txt.getText())) {
                modelo.setNum1(Double.parseDouble(vista.txt.getText()));
                modelo.setOperador('-');
                vista.txt.setText("");   
            }else{
                vista.txt.setText("Error de desbordamiento se excede de 20 digitos");
            }
        }
        if (e.getSource() == vista.mulButton) {
            if (modelo.numeroValido(vista.txt.getText())) {
                modelo.setNum1(Double.parseDouble(vista.txt.getText()));
                modelo.setOperador('*');
                vista.txt.setText("");
            }else{
                vista.txt.setText("Error de desbordamiento se excede de 20 digitos");
            }
        }
        if (e.getSource() == vista.divButton) {
            if (modelo.numeroValido(vista.txt.getText())) {
                modelo.setNum1(Double.parseDouble(vista.txt.getText()));
                modelo.setOperador('/');
                vista.txt.setText("");   
            }else{
                vista.txt.setText("Error de desbordamiento se excede de 20 digitos");
            }
        }
        if (e.getSource() == vista.exButton) {
            if (modelo.numeroValido(vista.txt.getText())) {
                modelo.setNum1(Double.parseDouble(vista.txt.getText()));
                modelo.setOperador('^');
                vista.txt.setText("");
            }else{
                vista.txt.setText("Error de desbordamiento se excede de 20 digitos");
            }
        }
        if (e.getSource() == vista.equButton) {

            modelo.setNum2(Double.parseDouble(vista.txt.getText()));
            
            switch(modelo.getOperador()){
                case '+':
                    modelo.setResult(modelo.sumar());
                    break;
                case '-':
                    modelo.setResult(modelo.restar());
                    break;
                case '*':
                    modelo.setResult(modelo.multiplicar());
                    break;
                case '/':
                    modelo.setResult(modelo.dividir());
                    break;
                case '^':
                    modelo.setResult(modelo.exponente());
                    break;
            }
            if (modelo.numeroValido(String.valueOf(modelo.getResult()))) {
                vista.txt.setText(String.valueOf(modelo.getResult()));
                modelo.setNum1(modelo.getResult());
            }else{
                vista.txt.setText("Error de desbordamiento se excede de 20 digitos");
            }
            
        }
    }
    
}
