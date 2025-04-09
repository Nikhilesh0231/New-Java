package Security;

import enc.DBS;
import java.awt.FileDialog;
import java.io.File;
import javax.swing.JFrame;

public class EncryptionForm extends javax.swing.JFrame {

    public EncryptionForm() {
        initComponents();
        jButton2.setEnabled(false); // Disable Encrypt button initially
    }

    private void initComponents() {
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        statusDisplay = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Encryption Form");
        setResizable(false);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18));
        jLabel6.setText("Encryption");

        jLabel1.setFont(new java.awt.Font("Century", 1, 12));
        jLabel1.setText("Select Data File");

        jButton1.setFont(new java.awt.Font("Century", 1, 12));
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Century", 1, 12));
        jButton2.setText("Encrypt");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Century", 1, 12));
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century", 1, 12));

        statusDisplay.setColumns(20);
        statusDisplay.setEditable(false);
        statusDisplay.setRows(5);
        jScrollPane1.setViewportView(statusDisplay);

        // Layout using GroupLayout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(30, 30, 30)
                        .addComponent(jButton4))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        FileDialog filedialog = new FileDialog(this, "Select File For Encryption");
        filedialog.setFile("*.*");
        filedialog.setVisible(true);

        String file = filedialog.getFile();
        String directory = filedialog.getDirectory();

        if (file != null && directory != null) {
            jTextField1.setText(directory + file);
            jLabel3.setText(file);
            jButton2.setEnabled(true); // Enable Encrypt button only after file selected
            statusDisplay.append("File selected: " + file + "\n");
        } else {
            statusDisplay.append("File selection cancelled.\n");
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        String filePath = jTextField1.getText();

        try {
            boolean flag = new DBS().DBST(1, filePath, statusDisplay);
            if (flag) {
                statusDisplay.append("\nFile Successfully Encrypted.\n");
            } else {
                statusDisplay.append("\nFile Encryption failed.\n");
            }
        } catch (Exception e) {
            statusDisplay.append("\nError during encryption: " + e.getMessage() + "\n");
            e.printStackTrace();
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose(); // Close the form
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new EncryptionForm().setVisible(true);
        });
    }

    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea statusDisplay;
}
