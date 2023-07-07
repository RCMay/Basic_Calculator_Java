package model;

public class Operaciones {
    double num1, num2, result;
    char operador;

    public Operaciones(){
        num1 = num2 = result = 0;
        operador = '.';
    }
     
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double getNum2() {
        return num2;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public char getOperador() {
        return operador;
    }

    public boolean numeroValido(String numero){
        if(numero.length()>20){
            return false;
        }else{
            return true;
        }
        
    }

    public double sumar(){
        this.result = this.num1 + this.num2;
        return this.result;
    }

    public double restar(){
        this.result = this.num1 - this.num2;
        return this.result;
    }

    public double multiplicar(){
        this.result = this.num1 * this.num2;
        return this.result;
    }

    public double dividir(){
        this.result = this.num1 / this.num2;
        return this.result;      
    }

    public double exponente(){
        this.result = Math.pow(this.num1, this.num2);
        return this.result;
    }

}
