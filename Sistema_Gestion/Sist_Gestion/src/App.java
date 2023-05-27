
//importa libreria para crear la ventana del JFrame;
import javax.swing.*;
//importa libreria para crear objetos en la ventana;
import java.awt.*;
//importa libreria para crear eventos con esos objetos;
import java.awt.event.*;

public class App extends JFrame {
    // Esto crea un texto donde vamos a tener un input, ej. Nombre: (input);
    private static JLabel directionsLabel = new JLabel("Enter your name in the box");
    // Etiqueta para input;
    private static JLabel outputLabel = new JLabel();
    // Creamos campo para el input;
    private static JTextField nameBox = new JTextField(10);
    // Creamos el boton;
    private static JButton nameButton = new JButton("Click me");

    public static void main(String[] args) throws Exception {
        App window = new App();
        window.setSize(500, 500);
        window.setVisible(true);
        window.setTitle("Formulario");
        // aqui asignamos a la variable "window", la cual contiene el JFrame, las
        // variables
        // que vamos a utilizar dentro de la ventana;
        window.setLayout(new FlowLayout());
        window.getContentPane().add(directionsLabel);
        window.getContentPane().add(nameBox);
        window.getContentPane().add(nameButton);
        window.getContentPane().add(outputLabel);

        // add an action listener;
        nameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonClick(e);// funcion que tendra el evento;
            }
        });
        // add Swing objects here:
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }// Termino clase main;

    public static void buttonClick(ActionEvent e) {
        // Codigo que para que el boton responda;
        JOptionPane.showMessageDialog(null, "Button works!", "Hola!", JOptionPane.INFORMATION_MESSAGE);
    }
}
