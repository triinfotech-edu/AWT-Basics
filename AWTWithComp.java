import java.awt.Frame;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

class MyWindow extends Frame {
	private Label[] label;	

	MyWindow() {
		label = new Label[100];

		setLayout(new FlowLayout(FlowLayout.CENTER));

		for (int i = 0; i < label.length; i++) {
			if (i % 3 == 0)
				label[i] = new Label("ਅਜੇ");
			else
				label[i] = new Label("ਸ਼ਾਵਾ");

			label[i].setForeground(Color.blue);
			label[i].setFont(new Font("New Times Roman", Font.BOLD, 24));
			add(label[i]);
		}

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

class AWTWithComp {
	public static void main(String[] args) {
		MyWindow myWindow = new MyWindow();

		myWindow.setSize(300, 300);
		myWindow.setVisible(true);
	}
}