package coolsms_Swing;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SmsFrame extends JFrame{
	public SmsFrame() {
		setTitle("Programing-CheckList");
		setSize(300,200);
		
		GridLayout grid = new GridLayout(3,2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		JPanel jp = new JPanel();
		JButton btn1 = new JButton("전송");
		JTextField phone = new JTextField();
		JTextField msg = new JTextField();
		
		jp.setLayout(grid);
		jp.add(new JLabel(" 전화번호"));
		jp.add(phone);
		jp.add(new JLabel(" 메시지"));
		jp.add(msg);
		jp.add(btn1);
		
		//버튼 이벤트
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingApp.문자전송(phone.getText(),msg.getText());
			}
		});
		c.add(jp);
		
		setVisible(true);
	}
}
