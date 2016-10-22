import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

class HelloAWTFrame extends Frame /*implements WindowListener*/ {
	HelloAWTFrame() {
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			/*
			@Override
			public void windowIconified(WindowEvent e) {
				System.out.println("Window is minimized");
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				System.out.println("Window is restored");
			}
			*/
		});
	}
	/*
	public void windowOpened(WindowEvent e) { }
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) { }
	public void windowIconified(WindowEvent e) { }
	public void windowDeiconified(WindowEvent e) { }
	public void windowActivated(WindowEvent e) { }
	public void windowDeactivated(WindowEvent e) { }

	/*
	static class MyWindowListener extends WindowAdapter {

		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

		public void windowIconified(WindowEvent e) {
			System.out.println("Window is minimized");
		}

		public void windowDeiconified(WindowEvent e) {
			System.out.println("Window is restored");
		}
	}*/
}

class HelloAWT {
	public static void main(String[] args) {
		HelloAWTFrame awt = new HelloAWTFrame();
	
		awt.setTitle("My First AWT based Window");
		awt.setSize(400, 600);
		awt.setVisible(true);
	}
}
