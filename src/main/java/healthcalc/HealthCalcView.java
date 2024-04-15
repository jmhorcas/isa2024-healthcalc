package healthcalc;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;

public class HealthCalcView {
    private JFrame frame;
    private JTextField pesoTB;
    private JTextField alturaTB;
    private JTextField edadTB;
    private JTextField generoTB;
    private JTextField resultadoTB;
    private JButton calcularPesoIdealBtn;
    private JButton calcularBMRBtn;
    private JButton borrarBtn;

    public HealthCalcView() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("HealthCalc");
        frame.setBounds(100, 100, 568, 356);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Peso");
        lblNewLabel.setBounds(33, 49, 32, 14);
        frame.getContentPane().add(lblNewLabel);
        
        JLabel lblPeso = new JLabel("Peso");
        lblPeso.setBounds(33, 49, 32, 14);
        frame.getContentPane().add(lblPeso);

        pesoTB = new JTextField();
        pesoTB.setBounds(112, 46, 96, 20);
        frame.getContentPane().add(pesoTB);
        pesoTB.setColumns(10);

        JLabel lblAltura = new JLabel("Altura");
        lblAltura.setBounds(33, 79, 69, 14); 
        frame.getContentPane().add(lblAltura);

        alturaTB = new JTextField();
        alturaTB.setBounds(112, 76, 96, 20); 
        frame.getContentPane().add(alturaTB);
        alturaTB.setColumns(10);

        JLabel lblEdad = new JLabel("Edad");
        lblEdad.setBounds(33, 109, 32, 14); 
        frame.getContentPane().add(lblEdad);

        edadTB = new JTextField();
        edadTB.setBounds(112, 106, 96, 20); 
        frame.getContentPane().add(edadTB);
        edadTB.setColumns(10);

        JLabel lblGenero = new JLabel("Género");
        lblGenero.setBounds(33, 139, 61, 14); 
        frame.getContentPane().add(lblGenero);

        generoTB = new JTextField();
        generoTB.setBounds(112, 136, 96, 20); 
        frame.getContentPane().add(generoTB);
        generoTB.setColumns(10);
        
        JLabel lblResultado = new JLabel("Resultado");
        lblResultado.setBounds(33, 210, 61, 14); 
        frame.getContentPane().add(lblResultado);

        resultadoTB = new JTextField();
        resultadoTB.setBounds(112, 210, 200, 20); 
        frame.getContentPane().add(resultadoTB);
        resultadoTB.setColumns(10);

        calcularPesoIdealBtn = new JButton("Calcular Peso Ideal");
        calcularPesoIdealBtn.setFont(new Font("Tahoma", Font.BOLD, 10));
        calcularPesoIdealBtn.setBounds(33, 170, 138, 32);
        frame.getContentPane().add(calcularPesoIdealBtn);
        
        calcularBMRBtn = new JButton("Calcular BMR");
        calcularBMRBtn.setFont(new Font("Tahoma", Font.BOLD, 10));
        calcularBMRBtn.setBounds(181, 170, 104, 32);
        frame.getContentPane().add(calcularBMRBtn);
        
        borrarBtn = new JButton("Borrar");
        borrarBtn.setBounds(295, 170, 110, 29);
        frame.getContentPane().add(borrarBtn);
        
    }

    public JTextField getPesoTB() {
        return pesoTB;
    }

    public JTextField getAlturaTB() {
        return alturaTB;
    }

    public JTextField getEdadTB() {
        return edadTB;
    }

    public JTextField getGeneroTB() {
        return generoTB;
    }

    public JTextField getResultadoTB() {
        return resultadoTB;
    }

    public JButton getCalcularPesoIdealBtn() {
        return calcularPesoIdealBtn;
    }

    public JButton getCalcularBMRBtn() {
        return calcularBMRBtn;
    }

    public JButton getBorrarBtn() {
        return borrarBtn;
    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}