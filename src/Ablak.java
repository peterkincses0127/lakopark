import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Ablak extends  JFrame{
    private JPanel mainPanel, panelErtekeles;
    private JButton btnBal,btnJobb, btnMent;
    private JLabel lblKep;
    private HappyLiving happyLiving;
    private int meret;
    private ImageIcon[] pontok;
    private int index;

    public Ablak() throws IOException {
        init();
        happyLiving = new HappyLiving("lakoparkok.txt");
        index = 0;
        megjelenit();
    }

    private void megjelenit() {
        Lakopark lakopark = happyLiving.getLakoparkok().get(index);
        this.setTitle(lakopark.getNev()+" lakópark");

    }

    private void init() throws IOException {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(720,360);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        mainPanel = (JPanel) (this.getContentPane());

        btnBal = new JButton();
        btnJobb = new JButton();
        lblKep  = new JLabel();
        panelErtekeles = new JPanel();
        btnBal.setBounds(10,70,30,30);
        btnJobb.setBounds(150,70,30,30);
        lblKep.setBounds(45,10,100,150);
        panelErtekeles.setBounds(200,10,450,250);
        meret = 50;
        Image image = ImageIO.read(new File("Kepek/balnyil.jpg"));
        image = image.getScaledInstance(30,30,Image.SCALE_SMOOTH);
        btnBal.setIcon(new ImageIcon(image));

        image = ImageIO.read(new File("Kepek/jobbnyil.jpg"));
        image = image.getScaledInstance(30,30,Image.SCALE_SMOOTH);
        btnJobb.setIcon(new ImageIcon(image));


        btnBal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnBalClick();
            }


        });

        btnJobb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnJobbClick();
            }
        });


        mainPanel.add(btnBal);
        mainPanel.add(btnJobb);

        
    }

    private void btnBalClick() {

    }
    private void btnJobbClick() {

    }


}
