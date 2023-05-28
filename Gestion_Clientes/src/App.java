import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

public class App implements ActionListener {
    // -------------Seccion declarar variables y campos----------------------------
    // Creamos los textos que vamos a usar para pedir la info;
    private static JLabel nombreLabel;
    private static JButton agregarButton;

    // Creamos la lista;
    private static JList listaUsuarios;
    // Creamos campos para llenar los datos;
    private static JTextField usuarioTextField;

    private static DefaultListModel<String> lista = new DefaultListModel<String>();

    public static void main(String[] args) {

        JPanel panel = new JPanel();// va a contener los datos;
        JFrame frame = new JFrame();// va a crear la ventana;

        // -------------Seccion ventana----------------------------
        frame.setSize(500, 500);// tamaño ventana;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);// Hace visible la ventana;
        frame.add(panel);// agrega el panel con la info a la ventana;

        panel.setLayout(null);

        // -------------Seccion lista----------------------------
        JList<String> listaUsuarios = new JList<String>(lista);
        listaUsuarios.setBounds(135, 100, 200, 300);
        panel.add(listaUsuarios);

        // -------------Seccion inputs----------------------------
        // instanciamos la variable user, junto al nombre del campo;
        nombreLabel = new JLabel("Nombre");
        nombreLabel.setBounds(150, 15, 100, 25);
        panel.add(nombreLabel);
        // instanciamos el campo para ingresar el valor del user;
        usuarioTextField = new JTextField(25);
        usuarioTextField.setBounds(200, 15, 100, 25);// asignamos parametros para el tamaño del campo
        panel.add(usuarioTextField);// agregamos el campo al panel;

        // -------------Seccion boton----------------------------
        agregarButton = new JButton("Guardar");
        agregarButton.setBounds(175, 50, 100, 25);
        agregarButton.addActionListener(new App());
        panel.add(agregarButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String usuario = usuarioTextField.getText();
        lista.addElement(usuario);
    }

}
