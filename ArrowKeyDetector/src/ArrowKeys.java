import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class ArrowKeys {

	public ArrowKeys() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setFocusable(true);
		
		JPanel panel = new JPanel();
		JLabel Up = new JLabel();
		JLabel Down = new JLabel();
		JLabel Left = new JLabel();
		JLabel Right = new JLabel();
		
		panel.add(Up);
		panel.add(Down);
		panel.add(Left);
		panel.add(Right);
		
		Up.setText("Up: W");
		Down.setText("Down: S");
		Left.setText("Left: A");
		Right.setText("Right: D");
		
		frame.addKeyListener(new KeyListener() {

			int upcount = 0;
			int downcount = 0;
			int leftcount = 0;
			int rightcount = 0;
			
			@Override
			public void keyPressed(KeyEvent e) {
				int KeyCode = e.getKeyCode();
				switch(KeyCode) {
					case KeyEvent.VK_W:
						Up.setText("Up: " + Integer.toString(upcount++));
						break;
					case KeyEvent.VK_S:
						Down.setText("Down: " + Integer.toString(downcount++));
						break;
					case KeyEvent.VK_A:
						Left.setText("Left: " + Integer.toString(leftcount++));
						break;
					case KeyEvent.VK_D:
						Right.setText("Right: " + Integer.toString(rightcount++));
						break;			
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		frame.add(panel);
	}
	
	public static void main(String[] args) {
		new ArrowKeys();
		
	}
}
