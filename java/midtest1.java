import java.awt.*;
import java.awt.event.*;

public class midtest1 extends java.awt.Frame	{
	public static void main(String[] args) {
		new midtest1();
	}
	public midtest1()	{
	    super("midtest1");
		
	    BorderLayout borderlayout = new BorderLayout();
	    setLayout(borderlayout);
	    
	    Button button1 = new Button("?");
	    Button button2 = new Button("?");
	    Button button3 = new Button("?");
	    Button button4 = new Button("?");
	    add(button1, BorderLayout.EAST);
	    add(button2, BorderLayout.SOUTH);
	    add(button3, BorderLayout.WEST);
	    add(button4, BorderLayout.NORTH);
	    
	    this.setSize(200,200);
	    
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    Dimension frameSize = this.getSize();
	    if (frameSize.height > screenSize.height)
	        frameSize.height = screenSize.height;
	    if (frameSize.width > screenSize.width)
	        frameSize.width = screenSize.width;
	    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
	    this.setVisible(true);
	    this.addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent e) {
	          System.exit(0);
	        }
	    });
	}
}
