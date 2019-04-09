import java.awt.*;
import java.awt.event.*;
public class MouseEventDemo extends java.awt.Frame implements 
	MouseListener,
	MouseMotionListener {
  public static void main(String[] args) {
    new MouseEventDemo();
		 
  }
  public MouseEventDemo() {
    super("Mouse Event Demo");
    this.addMouseListener(this);    
	this.addMouseMotionListener(this);
	  setLayout(new GridLayout(2, 1));

    java.awt.Label label;
    label = new Label("LABEL");
    label.setAlignment(Label.CENTER);
    label.setFont(new Font("�L�n������", Font.BOLD, 20));
    label.setForeground(new Color(41,255,255));
    label.setBackground(new Color(255,150,150));
    label.addMouseMotionListener(new MouseMotionListener(){
    	public void mouseMoved(MouseEvent e) {
    		System.out.println("��}�ƹ����䲾�ʷƹ�" + " X: " + e.getX() + " Y: " + e.getY());}
		public void mouseDragged(MouseEvent e) {
    		System.out.println("���U�ƹ�����즲�ƹ�" + " X: " + e.getX() + " Y: " + e.getY());} 
		 
		    });
			
    add(label);
	   
	    java.awt.Button button;
    button = new Button("Button");
    button.setFont(new Font("", Font.BOLD, 20));
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
    		if (e.getSource().equals(button))
    			System.out.println("���s���U�F");
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
  }
  public void mouseClicked(MouseEvent e) {  
    System.out.println("���@�U") ;
  }
  public void mouseEntered(MouseEvent e) {  
    System.out.println("�i�J") ;
  }
  public void mouseExited(MouseEvent e) {  
  System.out.println("���}") ;
  } 
  public void mousePressed(MouseEvent e) {  
    System.out.println("�@������");
  }
  public void mouseReleased(MouseEvent e) {
  System.out.println("��}") ;
  }
  public void mouseDragged(MouseEvent e) {
    System.out.println("���۲���") ;
  }
  public void mouseMoved(MouseEvent e) {
    System.out.println("����") ;
  }
}
