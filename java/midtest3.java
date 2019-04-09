import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class midtest3 extends java.awt.Frame {
  public static void main(String args[]){
    new midtest3();}
  public midtest3() {
    super("midtest3");
    setLayout(new GridLayout(2, 1));

    java.awt.Label label;
    label = new Label("LABEL");
    label.setAlignment(Label.CENTER);
    label.setFont(new Font("·L³n¥¿¶ÂÅé", Font.BOLD, 20));
    label.setForeground(new Color(41,255,255));
    label.setBackground(new Color(255,150,150));
    label.addMouseMotionListener(new MouseMotionListener(){
    	public void mouseMoved(MouseEvent e) {
    		System.out.println("©ñ¶}·Æ¹««öÁä²¾°Ê·Æ¹«" + " X: " + e.getX() + " Y: " + e.getY());}
		public void mouseDragged(MouseEvent e) {
    		System.out.println("«ö¤U·Æ¹««öÁä©ì¦²·Æ¹«" + " X: " + e.getX() + " Y: " + e.getY());} 
		 
		    });
			
    add(label);
    
    java.awt.Button button;
    button = new Button("Button");
    button.setFont(new Font("", Font.BOLD, 20));
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
    		if (e.getSource().equals(button))
    			System.out.println("«ö¶s«ö¤U¤F");
    	  }
	});
    add(button);

    this.setSize(200, 200);
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
