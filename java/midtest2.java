import java.awt.*;
import java.awt.event.*;

public class midtest2 extends java.awt.Frame {

  public static void main(String args[]){
    new midtest2();
  }
  
  public midtest2() {
    super("midtest2");
    
    FlowLayout flowlayout = new FlowLayout(FlowLayout.CENTER); 
    flowlayout.setHgap(20);
    flowlayout.setVgap(20);
    setLayout(flowlayout); 
    
    Button btn1 = new Button("�e�i");
    Button btn2 = new Button("����");
    Button btn3 = new Button("�k��");
    Button btn4 = new Button("��h");
    Button btn5 = new Button("�Ȱ�");
	add(btn1);
    add(btn2);
    add(btn3);
    add(btn4);
    add(btn5);

    this.setSize(200, 150);
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
