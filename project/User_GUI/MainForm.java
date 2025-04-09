package User_GUI;

import javax.swing.*;
import Security.*;
import Server.*;
import Stegnography.DembedForm;
import Stegnography.EmbedForm;

public class MainForm extends javax.swing.JFrame {
    ServerThread st;
    EncryptionForm ef;
    DecryptionForm df;
    DembedForm debf;
    EmbedForm ebf;
    ReceiverClient rc;

    public MainForm() {
        initComponents();
        st = new ServerThread();
        Thread t = new Thread(st);
        t.start();
    }

    private void initComponents() {
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Secure Data Transmission Through Network");
        setResizable(false);

        jMenu1.setText("Options");
        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
                java.awt.event.KeyEvent.VK_X,
                java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem9.setText("Exit");
        jMenuItem9.addActionListener(evt -> jMenuItem9ActionPerformed(evt));
        jMenu1.add(jMenuItem9);
        jMenu1.add(jSeparator1);
        jMenuBar1.add(jMenu1);

        jMenu3.setText("Security");
        jMenuItem3.setText("Encrypt");
        jMenuItem3.addActionListener(evt -> jMenuItem3ActionPerformed(evt));
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Decrypt");
        jMenuItem4.addActionListener(evt -> jMenuItem4ActionPerformed(evt));
        jMenu3.add(jMenuItem4);
        jMenu3.add(jSeparator2);
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Steg Utility");
        jMenuItem5.setText("Embed");
        jMenuItem5.addActionListener(evt -> jMenuItem5ActionPerformed(evt));
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Dembed");
        jMenuItem6.addActionListener(evt -> jMenuItem6ActionPerformed(evt));
        jMenu4.add(jMenuItem6);
        jMenu4.add(jSeparator3);
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Send File");
        jMenuItem10.setText("Send File");
        jMenuItem10.addActionListener(evt -> jMenuItem10ActionPerformed(evt));
        jMenu5.add(jMenuItem10);
        jMenuBar1.add(jMenu5);

        jMenu2.setText("Help");
        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
                java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem8.setText("About This App");
        jMenuItem8.addActionListener(evt -> jMenuItem8ActionPerformed(evt));
        jMenu2.add(jMenuItem8);
        jMenu2.add(jSeparator4);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(748, 350);
        setLocationRelativeTo(null);
    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        ef = new EncryptionForm();
        ef.setBounds(120, 120, 472, 477);
        ef.setVisible(true);
    }

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
        df = new DecryptionForm();
        df.setBounds(120, 120, 472, 477);
        df.setVisible(true);
    }

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
        ebf = new EmbedForm();
        ebf.setBounds(120, 120, 472, 384);
        ebf.setVisible(true);
    }

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
        debf = new DembedForm();
        debf.setBounds(120, 120, 472, 299);
        debf.setVisible(true);
    }

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {
        String output = "Secure Data Transmission\nUsing Encryption and Steganography";
        JOptionPane.showMessageDialog(null, output, "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {
        rc = new ReceiverClient();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            MainForm mf = new MainForm();
            mf.setVisible(true);
        });
    }

    private javax.swing.JMenu jMenu1, jMenu2, jMenu3, jMenu4, jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3, jMenuItem4, jMenuItem5, jMenuItem6, jMenuItem8, jMenuItem9, jMenuItem10;
    private javax.swing.JSeparator jSeparator1, jSeparator2, jSeparator3, jSeparator4;
}
