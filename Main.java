package VtuberDemo;
import javax.swing.*;
import java.awt.event.*;

class MyJFrame extends JFrame
{
    private JPanel contentPane;
    String [] imgName = new String[]{"delta","魔乃","星接彗星","加萊耶冬雪","夜見"};
    JButton btnPrev,btnNext;
    JLabel lblName,lblImg,lblShow;
    int n = 0;

    MyJFrame()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,230,310);
        contentPane= new JPanel();
        contentPane.setLayout(null);

        lblImg= new JLabel();
        lblImg.setIcon(new ImageIcon("F:\\text\\"+imgName[n]+".JPG"));
        lblImg.setBounds(20,20,180,135);
        contentPane.add (lblName);

        lblName = new JLabel(imgName[n]);
        lblName.setBounds(20,170,180,135);
        contentPane.add(lblName);

        String show = "第"+(n+1)+"張,共"+imgName.length+"張";
        lblShow = new JLabel(show);
        lblShow.setBounds(20,200,180,25);

        btnPrev = new JButton("上一張");
        btnPrev.setBounds(20,230,80,25);
        contentPane.add(btnPrev);
        btnPrev.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n--;
                if(n<0)
                {
                    n= imgName.length-1;
                }
                lblImg.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\textpicture\\"+imgName[n]+".JPG"));
                lblName.setText(imgName[n]);
                lblShow.setText("第"+(n+1)+"張,共"+imgName.length+"張");

            }
        });

        btnPrev = new JButton("下一張");
        btnPrev.setBounds(20,230,80,25);
        contentPane.add(btnPrev);
        btnPrev.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                if(n>=imgName.length)
                {
                    n= 0;
                }
                lblImg.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\textpicture\\"+imgName[n]+".JPG"));
                lblName.setText(imgName[n]);
                lblShow.setText("第"+(n+1)+"張,共"+imgName.length+"張");

            }
        });
        setVisible(true);
    }
}

public class Main {

    public static void main(String[] args) {
        MyJFrame f = new MyJFrame();
    }
}
