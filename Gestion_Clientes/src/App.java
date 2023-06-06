import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App implements ActionListener {
    // -------------Seccion declarar variables y campos----------------------------
    // Creamos los textos que vamos a usar para pedir la info;
    private static JLabel nombreLabel;
    private static JButton agregarButton;
    public static JLabel usuariosListados;
    private static JButton eliminarButton;

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
        usuariosListados = new JLabel("Listado");
        usuariosListados.setBounds(135, 70, 100, 25);
        panel.add(usuariosListados);
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
        

        // -------------Seccion boton agregar----------------------------
        agregarButton = new JButton("Guardar");
        agregarButton.setBounds(175, 50, 100, 25);
        agregarButton.addActionListener(new App());
        panel.add(agregarButton);

        // -------------Seccion boton eliminar----------------------------
        eliminarButton = new JButton("Eliminar");
        eliminarButton.setBounds(65, 50, 100, 25);
        eliminarButton.addActionListener(new App());
        panel.add(eliminarButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == agregarButton){
        String usuario = usuarioTextField.getText();
        lista.addElement(usuario);
        }

        if(e.getSource() == eliminarButton){
            String ind = usuarioTextField.getText();
            lista.removeElement(ind);
        }
    }

}
