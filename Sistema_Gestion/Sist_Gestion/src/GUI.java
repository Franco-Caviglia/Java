import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    public static void main(String[] args) {

        JPanel panel = new JPanel();
        // esto forma solo la ventana(frame);
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        JLabel label = new JLabel("User");
        // creamos el texto para el campo de password;
        JLabel labelPass = new JLabel("Password");

        // creamos el texto para el campo de usuario;
        label.setBounds(10, 20, 80, 25);
        // agregamos el texto al panel;
        panel.add(label);

        // creamos el texto para el campo de pass;
        labelPass.setBounds(10, 50, 80, 25);
        // agregamos el texto al panel;
        panel.add(labelPass);

        // creamos el campo de texto;
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        // agregamos el campo al panel;
        panel.add(userText);

        // creamos el campo para password;
        JPasswordField passTextField = new JPasswordField(20);
        passTextField.setBounds(100, 50, 165, 25);
        // lo agregamos al panel;
        panel.add(passTextField);

        // creamos el boton para iniciar sesion;
        JButton buttonSubmit = new JButton("Log in");
        buttonSubmit.setBounds(150, 90, 70, 20);
        buttonSubmit.addActionListener(new GUI());
        ;
        // lo agregamos al panel;
        panel.add(buttonSubmit);

        // label para una vez ingresado;
        JLabel succes = new JLabel("");
        succes.setBounds(10, 110, 300, 25);
        panel.add(succes);

    }// termina clase GUI;

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Succes");
    }
}
