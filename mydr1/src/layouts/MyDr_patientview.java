package layouts;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class MyDr_patientview extends JFrame{

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyDr_patientview window = new MyDr_patientview();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyDr_patientview() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		frame.getContentPane().add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JButton btnLisPotilaskertomus = new JButton("Lis\u00E4\u00E4 potilaskertomus");
		btnLisPotilaskertomus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
						frame.dispose();//h�vitt�� vanhan sivun 
						MyDr_add_visit_note visitNote= new MyDr_add_visit_note(); //tekee olion seuraavaksi avattavasta framesta
						visitNote(true);//asettaa n�kym�n olioon
					
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		frame.getContentPane().add(btnLisPotilaskertomus, BorderLayout.WEST);
	}

}
