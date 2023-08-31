package Gerard_Fernandez_fe_gc_c5_ta30_calculadora;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Gerard_Fernandez_fe_gc_c5_ta30_calculadora extends JFrame {

	private JPanel contentPane;
	private String conjuntoOp="";
	private Calculadora calcular = new Calculadora();

	/**
	 * Create the frame.
	 */
	public Gerard_Fernandez_fe_gc_c5_ta30_calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField pantalla = new JTextField();
		pantalla.setEditable(false);
		pantalla.setBounds(25, 37, 428, 38);
		contentPane.add(pantalla);

        
        JButton sumarBtn = new JButton("+");
        sumarBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		conjuntoOp+=" "+sumarBtn.getText()+" ";
        		pantalla.setText(conjuntoOp);
        	}
        });
        sumarBtn.setBounds(343, 157, 89, 23);
        contentPane.add(sumarBtn);
        
        JButton restarBtn = new JButton("-");
        restarBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		conjuntoOp+=" "+restarBtn.getText()+" ";
        		pantalla.setText(conjuntoOp);
        	}
        });
        restarBtn.setBounds(343, 191, 89, 23);
        contentPane.add(restarBtn);
        
        JButton multiplcarBtn = new JButton("*");
        multiplcarBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		conjuntoOp+=" "+multiplcarBtn.getText()+" ";
        		pantalla.setText(conjuntoOp);
        	}
        });
        multiplcarBtn.setBounds(343, 225, 89, 23);
        contentPane.add(multiplcarBtn);
        
        JButton divisionBtn = new JButton("/");
        divisionBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		conjuntoOp+=" "+divisionBtn.getText()+" ";
        		pantalla.setText(conjuntoOp);
        	}
        });
        divisionBtn.setBounds(343, 259, 89, 23);
        contentPane.add(divisionBtn);
        
        JButton btnNewButton = new JButton("=");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		pantalla.setText(calcular.calcular(conjuntoOp));
        		
        	}
        });
        btnNewButton.setBounds(343, 293, 89, 23);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("<-");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(conjuntoOp.length()>0){
	        		conjuntoOp=conjuntoOp.substring(0, conjuntoOp.length()-1);
	        		pantalla.setText(conjuntoOp);
        		}
        	}
        });
        btnNewButton_1.setBounds(343, 123, 89, 23);
        contentPane.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("C");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		conjuntoOp="";
        		pantalla.setText(conjuntoOp);
        	}
        });
        btnNewButton_2.setBounds(244, 123, 89, 23);
        contentPane.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("CE");
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		conjuntoOp="";
        		pantalla.setText(conjuntoOp);
        	}
        });
        btnNewButton_3.setBounds(145, 123, 89, 23);
        contentPane.add(btnNewButton_3);
        
        JButton btnNewButton_4 = new JButton("%");
        btnNewButton_4.setBounds(46, 123, 89, 23);
        contentPane.add(btnNewButton_4);
        
        JButton btnNewButton_5 = new JButton("2 √x");
        btnNewButton_5.setBounds(244, 157, 89, 23);
        contentPane.add(btnNewButton_5);
        
        //Elevacion/Potencia al cubo
        JButton btnNewButton_6 = new JButton("x²");
        btnNewButton_6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(conjuntoOp.split(" ").length==1){
        			conjuntoOp=calcular.potenciaCubo(conjuntoOp);
        			pantalla.setText(conjuntoOp);
        		}
        		
        	}
        });
        btnNewButton_6.setBounds(145, 157, 89, 23);
        contentPane.add(btnNewButton_6);
        
        JButton btnNewButton_7 = new JButton("1/x");
        btnNewButton_7.setBounds(46, 157, 89, 23);
        contentPane.add(btnNewButton_7);
        
        //BOTON 9
        JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		conjuntoOp+=btn9.getText();
        		pantalla.setText(conjuntoOp);
        	}
        });
        btn9.setBounds(244, 191, 89, 23);
        contentPane.add(btn9);
        
        //BOTON 8
        JButton btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		conjuntoOp+=btn8.getText();
        		pantalla.setText(conjuntoOp);
        	}
        });
        btn8.setBounds(145, 191, 89, 23);
        contentPane.add(btn8);
        
        //BOTON 7
        JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		conjuntoOp+=btn7.getText();
        		pantalla.setText(conjuntoOp);
        	}
        });
        btn7.setBounds(46, 191, 89, 23);
        contentPane.add(btn7);
        
        //BOTON 6
        JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		conjuntoOp+=btn6.getText();
        		pantalla.setText(conjuntoOp);
        	}
        });
        btn6.setBounds(244, 225, 89, 23);
        contentPane.add(btn6);
        
        //BOTON 5
        JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		conjuntoOp+=btn5.getText();
        		pantalla.setText(conjuntoOp);
        	}
        });
        btn5.setBounds(145, 225, 89, 23);
        contentPane.add(btn5);
        
        //BOTON 4
        JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		conjuntoOp+=btn4.getText();
        		pantalla.setText(conjuntoOp);
        	}
        });
        btn4.setBounds(46, 225, 89, 23);
        contentPane.add(btn4);
        
        //BOTON 3
        JButton btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		conjuntoOp+=btn3.getText();
        		pantalla.setText(conjuntoOp);
        	}
        });
        btn3.setBounds(244, 259, 89, 23);
        contentPane.add(btn3);
        
        //BOTON 2
        JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		conjuntoOp+=btn2.getText();
        		pantalla.setText(conjuntoOp);
        	}
        });
        btn2.setBounds(145, 259, 89, 23);
        contentPane.add(btn2);
        
        //BOTON 1
        JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		conjuntoOp+=btn1.getText();
        		pantalla.setText(conjuntoOp);
        	}
        });
        btn1.setBounds(46, 259, 89, 23);
        contentPane.add(btn1);
        
        JButton btnNewButton_17 = new JButton(",");
        btnNewButton_17.setBounds(244, 293, 89, 23);
        contentPane.add(btnNewButton_17);
        
        //BOTON 0
        JButton btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		conjuntoOp+=btn0.getText();
        		pantalla.setText(conjuntoOp);
        	}
        });
        btn0.setBounds(145, 293, 89, 23);
        contentPane.add(btn0);
        
        JButton btnNewButton_19 = new JButton("±");
        btnNewButton_19.setBounds(46, 293, 89, 23);
        contentPane.add(btnNewButton_19);

        /*
        sumButton.addActionListener(new ActionListener() {
        	Calculadora calculate=new Calculadora();
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	resultField.setText(calculate.calculateAndSetResult(textField1.getText(), textField2.getText(), "+"));
            }
        });

        subtractButton.addActionListener(new ActionListener() {
        	Calculadora calculate=new Calculadora();
            @Override
            public void actionPerformed(ActionEvent e) {
            	resultField.setText(calculate.calculateAndSetResult(textField1.getText(), textField2.getText(), "-"));
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
        	Calculadora calculate=new Calculadora();
            @Override
            public void actionPerformed(ActionEvent e) {
            	resultField.setText(calculate.calculateAndSetResult(textField1.getText(), textField2.getText(), "*"));
            }
        });

        divideButton.addActionListener(new ActionListener() {
        	Calculadora calculate=new Calculadora();
            @Override
            public void actionPerformed(ActionEvent e) {
            	resultField.setText(calculate.calculateAndSetResult(textField1.getText(), textField2.getText(), "/"));
            }
        });*/

	}
}