import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App implements ActionListener {
    // Campos que vamos a pedir para calcular
    private static JLabel altura;
    private static JLabel peso;
    private static JLabel nombre;
    private static JLabel calculoHecho;

    // Campos para rellenar con datos;
    private static JTextField alturaMts;
    private static JTextField pesoKg;
    private static JTextField nombreUsuario;
    // Boton;
    private static JButton calcularIMC;

    public static void main(String[] args) {

        JPanel panel = new JPanel(); // va a contener los datos;

        JFrame frame = new JFrame();// va a crear la ventana;

        frame.setSize(500, 500);// da el tamaño de la venta;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// hace que se salga del programa al momento que cerras la
                                                             // ventana;

        frame.setVisible(true);// hace que se vea la ventana
        frame.add(panel);// agrega el panel a la ventana;

        panel.setLayout(null);

        // -------------Seccion inputs----------------------------
        // instanciamos la variable user, junto al nombre del campo;
        nombre = new JLabel("Nombre");
        nombre.setBounds(30, 15, 100, 25);
        panel.add(nombre);
        // instanciamos el campo para llenar el valor del nombre;
        nombreUsuario = new JTextField(25);
        nombreUsuario.setBounds(80, 15, 100, 25);
        panel.add(nombreUsuario);
        // instaciamos la variable altura, junto a el nombre del campo;
        altura = new JLabel("Altura");
        altura.setBounds(30, 45, 100, 25);
        panel.add(altura);
        // instanciamos el campo para llenar el valor de la altura;
        alturaMts = new JTextField(25);
        alturaMts.setBounds(80, 45, 100, 25);
        panel.add(alturaMts);
        // instanciamos la variable peso;
        peso = new JLabel("Peso");
        peso.setBounds(30, 75, 100, 25);
        panel.add(peso);
        // instanciamos el campo para llenar la variable peso;
        pesoKg = new JTextField(25);
        pesoKg.setBounds(80, 75, 100, 25);
        panel.add(pesoKg);

        // Creamos el boton "Calcular";
        calcularIMC = new JButton("Calcular");
        calcularIMC.setBounds(55, 110, 100, 25);
        calcularIMC.addActionListener(new App());
        panel.add(calcularIMC);

        // Crear label con salida del calculo;
        calculoHecho = new JLabel("");
        calculoHecho.setBounds(10, 140, 500, 25);
        panel.add(calculoHecho);
    }// Termino clase main;

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = nombreUsuario.getText();
        String kg = pesoKg.getText();
        String alt = alturaMts.getText();

        float strKg = Float.parseFloat(kg);
        float strAlt = Float.parseFloat(alt);

        calculoHecho.setText(String.format(user + " tu indice de masa corporal deberia ser: %.2f\n",
                indiceMasaCorporal(strKg, strAlt)));
    }

    public float indiceMasaCorporal(float a, float b) {
        // se calcula como el peso dividido el cuadrado de la altura;
        // a -> peso persona;
        // b -> altura persona;
        float total = (float) (a / Math.pow(b, 2));
        return total;
    }
}
