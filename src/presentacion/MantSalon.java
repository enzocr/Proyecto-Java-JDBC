package presentacion;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import negocio.bo.DoctorBo;
import negocio.bo.SalonBo;
import negocio.clases.Doctor;
import negocio.clases.Salon;
import utilities.SwingUtilities;

/**
 *
 * @author Enzo Quartino Zamora
 * <github.com/enzocr || email: enzoquartino@gmail.com>
 */
@SuppressWarnings("serial")
public class MantSalon extends javax.swing.JFrame {

    private SalonBo bo;
    private DoctorBo dbo;
    private DefaultTableModel modelSalon;

    /**
     * Creates new form MantProfesor
     */
    public MantSalon() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.bo = new SalonBo();
        this.dbo = new DoctorBo();
        this.modelSalon = new DefaultTableModel();
        fillDoctors();
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        salonTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        cleanButton = new javax.swing.JButton();
        getByAreaButton = new javax.swing.JButton();
        getByNumButton = new javax.swing.JButton();
        camasTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        insertButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        doctorComboBox = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSalon = new javax.swing.JTable();
        areaTextField = new javax.swing.JTextField();
        volverButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("Mantenimiento de salones");

        jLabel2.setText("# Salón");

        salonTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salonTextFieldMouseClicked(evt);
            }
        });
        salonTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salonTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Área:");

        deleteButton.setForeground(new java.awt.Color(204, 51, 0));
        deleteButton.setText("Eliminar");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Modificar");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        cleanButton.setText("Limpiar");
        cleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanButtonActionPerformed(evt);
            }
        });

        getByAreaButton.setText("Consultar por área");
        getByAreaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getByAreaButtonActionPerformed(evt);
            }
        });

        getByNumButton.setText("Consultar por # salón");
        getByNumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getByNumButtonActionPerformed(evt);
            }
        });

        camasTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                camasTextFieldMouseClicked(evt);
            }
        });
        camasTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camasTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("# Camas");

        insertButton.setText("Agregar");
        insertButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertButtonMouseClicked(evt);
            }
        });

        jLabel3.setText("Doctor:");

        tableSalon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableSalon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSalonMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableSalon);

        volverButton.setForeground(new java.awt.Color(255, 0, 0));
        volverButton.setText("Volver");
        volverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(349, Short.MAX_VALUE)
                .addComponent(cleanButton)
                .addGap(168, 168, 168))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insertButton)
                        .addGap(76, 76, 76)
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton))
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getByNumButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(camasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getByAreaButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(areaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5))
                            .addComponent(volverButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(volverButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(salonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(areaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cleanButton)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(insertButton))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getByAreaButton)
                    .addComponent(getByNumButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salonTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salonTextFieldActionPerformed

    }//GEN-LAST:event_salonTextFieldActionPerformed

    private void fillTable() {
        fillDoctors();
        this.modelSalon = new DefaultTableModel() {
            private static final long serialVersionUID = 1L;

            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        getTableExamen().getTableHeader().setReorderingAllowed(false);

        getModelSalon().setColumnCount(0);

        getModelSalon().addColumn("# Salón");
        getModelSalon().addColumn("Cant camas");
        getModelSalon().addColumn("Área");
        getModelSalon().addColumn("Cédula doctor");
        getModelSalon().addColumn("Nombre doctor");

        List<Salon> list = getBo().getAll();

        if (list != null) {
            getModelSalon().setNumRows(list.size());

            for (int i = 0; i < list.size(); i++) {

                Salon s = list.get(i);
                getModelSalon().setValueAt(s.getNumSalon(), i, 0);//i=fila 0=columna
                getModelSalon().setValueAt(s.getCantCamas(), i, 1);
                getModelSalon().setValueAt(s.getArea(), i, 2);
                getModelSalon().setValueAt(s.getDoctor().getCedula(), i, 3);
                getModelSalon().setValueAt(s.getDoctor().getNombre(), i, 4);
            }
        }

        getTableExamen().setModel(getModelSalon());
    }

    private void fillTable(List<Salon> list) {

        this.modelSalon = new DefaultTableModel() {
            private static final long serialVersionUID = 1L;

            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        getTableExamen().getTableHeader().setReorderingAllowed(false);
        getModelSalon().setColumnCount(0);

        getModelSalon().addColumn("# Salón");
        getModelSalon().addColumn("Cant camas");
        getModelSalon().addColumn("Área");
        getModelSalon().addColumn("Cédula doctor");
        getModelSalon().addColumn("Nombre doctor");

        if (list != null) {
            getModelSalon().setNumRows(list.size());

            for (int i = 0; i < list.size(); i++) {

                Salon s = list.get(i);
                getModelSalon().setValueAt(s.getNumSalon(), i, 0);//i=fila 0=columna
                getModelSalon().setValueAt(s.getCantCamas(), i, 1);
                getModelSalon().setValueAt(s.getArea(), i, 2);
                getModelSalon().setValueAt(s.getDoctor().getCedula(), i, 3);
                getModelSalon().setValueAt(s.getDoctor().getNombre(), i, 4);
            }
        }

        this.tableSalon.setModel(getModelSalon());
    }

    private void fillDoctors() {
        this.doctorComboBox.removeAllItems();
        List<Doctor> list = getDbo().getAll();
        this.doctorComboBox.addItem("---Seleccione doctor---");
        for (Doctor d : list) {
            this.doctorComboBox.addItem(d.toString());
        }
    }

    private void fillDoctors(int cedulaDoctor) {
        List<Doctor> list = getDbo().getAll();
        this.doctorComboBox.addItem("---Seleccione doctor---");
        for (Doctor d : list) {
            if (d.getCedula() != cedulaDoctor) {
                this.doctorComboBox.addItem(d.toString());
            }
        }
    }

    private boolean validateData() {

        if (!SwingUtilities.includesValidChar(1, this.salonTextField.getText())) {
            SwingUtilities.showJOptionPane("Digite # del salón");
            this.salonTextField.setBorder(SwingUtilities.colorBorder(1));
            return false;
        }
        if (!SwingUtilities.includesValidChar(1, this.camasTextField.getText())) {
            SwingUtilities.showJOptionPane("Digite # de camas del salón");
            this.camasTextField.setBorder(SwingUtilities.colorBorder(1));
            return false;
        }
        if (!SwingUtilities.includesValidChar(2, this.areaTextField.getText())) {
            SwingUtilities.showJOptionPane("Digite área del salón");
            this.areaTextField.setBorder(SwingUtilities.colorBorder(1));
            return false;
        }

        return true;
    }
    private void cleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanButtonActionPerformed
        cleanTextFields();
    }//GEN-LAST:event_cleanButtonActionPerformed


    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (validateData()) {

            String doctor = this.doctorComboBox.getSelectedItem().toString();
            String[] infoDoc = doctor.trim().split(",");

            if (doctor.equals("---Seleccione doctor---")) {
                SwingUtilities.showJOptionPane("Seleccione nuevo doctor");
            } else {

                Doctor d = getDbo().getById(Integer.parseInt(infoDoc[0]));
                Salon s = new Salon(
                        Integer.parseInt(this.salonTextField.getText()),
                        Integer.parseInt(this.camasTextField.getText()),
                        this.areaTextField.getText(),
                        d
                );

                int res = getBo().update(s);

                SwingUtilities.updateSwitch(res);

                cleanTextFields();
            }

        }

    }//GEN-LAST:event_updateButtonActionPerformed


    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (salonTextField.getText().isEmpty()) {
            SwingUtilities.showJOptionPane("Seleccionar salón a eliminar");
        } else {
            try {
                int numSalon = Integer.parseInt(salonTextField.getText());
                Salon s = new Salon();
                s.setNumSalon(numSalon);
                int res = getBo().delete(s);
                SwingUtilities.deleteSwitch(res);
                cleanTextFields();

            } catch (NumberFormatException nfe) {
                SwingUtilities.showJOptionPane("Ingresar salón a eliminar (SOLO NUMEROS)");
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed


    private void getByAreaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getByAreaButtonActionPerformed

        if (SwingUtilities.includesValidChar(2, this.areaTextField.getText())) {
            Salon s = getBo().getByArea(this.areaTextField.getText());
            if (s == null) {
                SwingUtilities.showJOptionPane("No hay registros");
                cleanTextFields();
            } else {
                List<Salon> list = new ArrayList<>();
                list.add(s);
                fillTable(list);
            }
        }


    }//GEN-LAST:event_getByAreaButtonActionPerformed

    private void getByNumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getByNumButtonActionPerformed

        if (SwingUtilities.includesValidChar(1, this.salonTextField.getText())) {
            Salon s = getBo().getByNum(Integer.parseInt(this.salonTextField.getText()));
            if (s == null) {
                SwingUtilities.showJOptionPane("No hay registros");
                cleanTextFields();
            } else {
                List<Salon> list = new ArrayList<>();
                list.add(s);
                fillTable(list);
            }
        }


    }//GEN-LAST:event_getByNumButtonActionPerformed

    private void salonTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salonTextFieldMouseClicked
        this.salonTextField.setBorder(SwingUtilities.colorBorder(2));
    }//GEN-LAST:event_salonTextFieldMouseClicked

    private void camasTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_camasTextFieldMouseClicked
        this.camasTextField.setBorder(SwingUtilities.colorBorder(2));
    }//GEN-LAST:event_camasTextFieldMouseClicked

    private void insertButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonMouseClicked
        if (validateData()) {

            String doctor = this.doctorComboBox.getSelectedItem().toString();
            if (!doctor.equals("---Seleccione doctor---")) {
                String[] infoDoc = doctor.trim().split(",");
                Doctor d = getDbo().getById(Integer.parseInt(infoDoc[0]));

                Salon s = getBo().getByNum(Integer.parseInt(this.salonTextField.getText()));
                if (s != null) {
                    SwingUtilities.showJOptionPane("Ya existe un salón con este #");

                } else {

                    s = new Salon(
                            Integer.parseInt(this.salonTextField.getText()),
                            Integer.parseInt(this.camasTextField.getText()),
                            this.areaTextField.getText(),
                            d
                    );

                    int res = getBo().insert(s);

                    SwingUtilities.registerSwitch(res);
                    cleanTextFields();
                }

            } else {
                SwingUtilities.showJOptionPane("Rellenar espacios vacíos");
            }

        }
    }//GEN-LAST:event_insertButtonMouseClicked

    private void camasTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camasTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camasTextFieldActionPerformed

    private void tableSalonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSalonMouseClicked

        if (evt.getClickCount() == 2) {
            this.doctorComboBox.removeAllItems();

            int row = tableSalon.getSelectedRow();
            this.salonTextField.setText(getTableExamen().getValueAt(row, 0).toString());
            this.camasTextField.setText(getTableExamen().getValueAt(row, 1).toString());
            this.areaTextField.setText(getTableExamen().getValueAt(row, 2).toString());
            Doctor d = getDbo().getById((Integer) getTableExamen().getValueAt(row, 3));
            this.doctorComboBox.addItem(d.toString());

            this.salonTextField.setEnabled(false);

            fillDoctors((int) getTableExamen().getValueAt(tableSalon.getSelectedRow(), 3));
        }


    }//GEN-LAST:event_tableSalonMouseClicked

    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButtonActionPerformed
        MenuPrincipal mant = new MenuPrincipal();
        mant.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverButtonActionPerformed

    private void cleanTextFields() {

        this.salonTextField.setEnabled(true);
        this.doctorComboBox.setEnabled(true);
        this.salonTextField.setText("");
        this.camasTextField.setText("");
        this.areaTextField.setText("");

        fillTable();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MantSalon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantSalon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantSalon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantSalon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MantSalon().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaTextField;
    private javax.swing.JTextField camasTextField;
    private javax.swing.JButton cleanButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> doctorComboBox;
    private javax.swing.JButton getByAreaButton;
    private javax.swing.JButton getByNumButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField salonTextField;
    private javax.swing.JTable tableSalon;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables
  public DefaultTableModel getModelSalon() {
        return modelSalon;
    }

    public void setModelSalon(DefaultTableModel modelSalon) {
        this.modelSalon = modelSalon;
    }

    public SalonBo getBo() {
        return bo;
    }

    public void setBo(SalonBo bo) {
        this.bo = bo;
    }

    public JTable getTableExamen() {
        return tableSalon;
    }

    public DoctorBo getDbo() {
        return dbo;
    }

    public void setDbo(DoctorBo dbo) {
        this.dbo = dbo;
    }

}
