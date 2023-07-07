import controller.CalculadoraController;
import model.Operaciones;
import ui.CalculadorGUI;

public class Main {
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        CalculadorGUI calculadora =  new CalculadorGUI();

        CalculadoraController controller = new CalculadoraController(calculadora, operaciones);
        controller.iniciar();
        calculadora.setVisible(true);

    }
}