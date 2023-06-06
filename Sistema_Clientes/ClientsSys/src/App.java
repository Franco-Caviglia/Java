import javax.swing.JPanel;

import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;

//creacion de variables, textFields y botones;


public class App{
    //Buttons;
    private static JButton addButton;
    private static JButton delButton;

    //Label;
    private static JLabel nameJLabel;
    private static JLabel lastNameJLabel;
    private static JLabel phoneJLabel;
    private static JLabel emaiJLabel;
    
    //TxtField;
    private static JTextField nameJTextField;
    private static JTextField lastNamJTextField;
    private static JTextField phoneJTextField;
    private static JTextField emailJTextField;


    //List;
    private static DefaultListModel<String> lista = new DefaultListModel<String>();
    //Codigo;
    public static void main(String[] args) throws Exception {
        
        JPanel panel = new JPanel();//crea panel que contendra los botones, textFields y labels;
        JFrame frame = new JFrame();//crea frame que contendra el panel;

        frame.setSize(800, 800);//medidas ventana;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Sale del programa cuando cerramos la ventana;

        frame.setVisible(true);//Hace visible la ventana;
        frame.add(panel);//agregamos el panel a la ventana;

        panel.setLayout(null);


        //Labels; 
        //-----------------Name Sec---------------------------------
        //Nombre Label;
        nameJLabel = new JLabel("Nombre");
        nameJLabel.setBounds(40,20, 80, 20);
        panel.add(nameJLabel);
        //Nombre textField;
        nameJTextField = new JTextField();
        nameJTextField.setBounds(105, 20, 80, 20);
        panel.add(nameJTextField);
        //-----------------Name Sec---------------------------------

        //-----------------LastName Sec-----------------------------
        //Apellido Label;
        lastNameJLabel = new JLabel("Apellido");
        lastNameJLabel.setBounds(40, 50, 80, 20);
        panel.add(lastNameJLabel);
        //Apellido txtField;
        lastNamJTextField = new JTextField();
        lastNamJTextField.setBounds(105, 50, 80, 20);
        panel.add(lastNamJTextField);
        //-----------------LastName Sec-----------------------------

        //-----------------Email sec--------------------------------
        //email label;
        emaiJLabel = new JLabel("Email");
        emaiJLabel.setBounds(40, 80, 80, 20);
        panel.add(emaiJLabel);
        //email txtField;
        emailJTextField = new JTextField();
        emailJTextField.setBounds(105, 80, 80, 20);
        panel.add(emailJTextField);
        //-----------------Email Sec--------------------------------

        //-----------------Telefono Sec-----------------------------
        phoneJLabel = new JLabel("Telefono");
        phoneJLabel.setBounds(40, 110, 80, 20);
        panel.add(phoneJLabel);
        //telefono txtField;
        phoneJTextField = new JTextField();
        phoneJTextField.setBounds(105, 110, 80, 20);
        panel.add(phoneJTextField);
        //-----------------Telefono Sec-----------------------------
        
        
        //List;
        JList<String> listaJList = new JList<String>(lista);
        listaJList.setBounds(210, 20, 500, 100);
        panel.add(listaJList);
        //Buttons;

        //-----------------addButton Sec-----------------------------
        addButton = new JButton("Agregar");
        addButton.setBounds(65, 140, 80, 20);
        //Funcion del boton add;
        addButton.addActionListener(e -> {
            String info = nameJTextField.getText() + " " + lastNamJTextField.getText() + " " + emailJTextField.getText() + " " + phoneJTextField.getText(); //Valor que queremos guardar;
            lista.addElement(info); //metodo para guardarlo;
            nameJTextField.setText("");//Borramos la info que contiene el contenedor para que no se repita;
            lastNamJTextField.setText("");
            emailJTextField.setText("");
            phoneJTextField.setText("");
        });
        panel.add(addButton);

        //-----------------delButton Sec-----------------------------
        delButton = new JButton("Eliminar");
        delButton.setBounds(210, 130, 80, 20);
        delButton.addActionListener(e -> {
            int indice = listaJList.getSelectedIndex();
            lista.remove(indice);
        });

        panel.add(delButton);
    }
}
