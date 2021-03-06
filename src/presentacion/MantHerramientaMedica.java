package presentacion;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import negocio.bo.HerramientaMedicaBo;
import negocio.clases.HerramientaMedica;
import utilities.SwingUtilities;

/**
 *
 * @author Enzo Quartino Zamora
 * <github.com/enzocr || email: enzoquartino@gmail.com>
 */
@SuppressWarnings("serial")
public class MantHerramientaMedica extends javax.swing.JFrame {

    private HerramientaMedicaBo bo;
    private DefaultTableModel modelHerramienta;

    /**
     * Creates new form MantProfesor
     */
    public MantHerramientaMedica() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.bo = new HerramientaMedicaBo();
        this.modelHerramienta = new DefaultTableModel();
        fillTable();
    }

    private void fillTable() {

        this.modelHerramienta = new DefaultTableModel() {
            private static final long serialVersionUID = 1L;

            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        getTableHerramienta().getTableHeader().setReorderingAllowed(false);

        getModelHerramienta().setColumnCount(0);

        getModelHerramienta().addColumn("Código");
        getModelHerramienta().addColumn("Descripción");
        getModelHerramienta().addColumn("Cant total");
        getModelHerramienta().addColumn("Cant prestada");

        List<HerramientaMedica> list = getBo().getAll();

        if (list != null) {
            getModelHerramienta().setNumRows(list.size());

            for (int i = 0; i < list.size(); i++) {
                HerramientaMedica hm = list.get(i);
                getModelHerramienta().setValueAt(hm.getCodigo(), i, 0);//i=fila 0=columna
                getModelHerramienta().setValueAt(hm.getDescripcion(), i, 1);
                getModelHerramienta().setValueAt(hm.getCantTotal(), i, 2);
                getModelHerramienta().setValueAt(hm.getCantidadPrestado(), i, 3);
            }
        }

        getTableHerramienta().setModel(getModelHerramienta());

    }

    private void fillTable(List<HerramientaMedica> list) {
        this.modelHerramienta = new DefaultTableModel() {
            private static final long serialVersionUID = 1L;

            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        getTableHerramienta().getTableHeader().setReorderingAllowed(false);

        getModelHerramienta().setColumnCount(0);

        getModelHerramienta().addColumn("Código");
        getModelHerramienta().addColumn("Descripción");
        getModelHerramienta().addColumn("Cant total");
        getModelHerramienta().addColumn("Cant prestada");

        if (list != null) {
            getModelHerramienta().setNumRows(list.size());

            for (int i = 0; i < list.size(); i++) {
                HerramientaMedica hm = list.get(i);
                getModelHerramienta().setValueAt(hm.getCodigo(), i, 0);//i=fila 0=columna
                getModelHerramienta().setValueAt(hm.getDescripcion(), i, 1);
                getModelHerramienta().setValueAt(hm.getCantTotal(), i, 2);
                getModelHerramienta().setValueAt(hm.getCantidadPrestado(), i, 3);
            }
        }

        getTableHerramienta().setModel(getModelHerramienta());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        cleanButton = new javax.swing.JButton();
        getByCodeButton = new javax.swing.JButton();
        getByDescButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHerramienta = new javax.swing.JTable();
        descripcionTextField = new javax.swing.JTextField();
        insertButton = new javax.swing.JButton();
        spCantTotal = new javax.swing.JSpinner();
        spCantPrestada = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        volverButton = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("Mantenimiento de herramientas médicas");

        jLabel2.setText("Código:");

        codigoTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codigoTextFieldMouseClicked(evt);
            }
        });
        codigoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Cantidad total:");

        jLabel5.setText("Descripcion:");

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

        getByCodeButton.setText("Consultar por código");
        getByCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getByCodeButtonActionPerformed(evt);
            }
        });

        getByDescButton.setText("Consultar por descripción");
        getByDescButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getByDescButtonActionPerformed(evt);
            }
        });

        tableHerramienta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableHerramienta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHerramientaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableHerramienta);

        descripcionTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descripcionTextFieldMouseClicked(evt);
            }
        });
        descripcionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionTextFieldActionPerformed(evt);
            }
        });

        insertButton.setText("Agregar");
        insertButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertButtonMouseClicked(evt);
            }
        });
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        spCantTotal.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spCantTotal.setEditor(new javax.swing.JSpinner.NumberEditor(spCantTotal, ""));
        spCantTotal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spCantTotalStateChanged(evt);
            }
        });

        spCantPrestada.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel9.setText("Cantidad prestadal:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(insertButton)
                                .addGap(119, 119, 119)
                                .addComponent(updateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addComponent(cleanButton)
                                .addGap(107, 107, 107)
                                .addComponent(deleteButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(codigoTextField)
                                    .addComponent(spCantTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spCantPrestada)
                                    .addComponent(descripcionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                                .addGap(21, 21, 21))
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(getByCodeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(getByDescButton)))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volverButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spCantTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(spCantPrestada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cleanButton)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(insertButton))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getByDescButton)
                    .addComponent(getByCodeButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTextFieldActionPerformed

    }//GEN-LAST:event_codigoTextFieldActionPerformed

    private boolean validateData() {

        int cantTotal = (Integer) spCantTotal.getValue();
        int cantPrestada = (Integer) spCantPrestada.getValue();
        if (cantPrestada > cantTotal) {
            SwingUtilities.showJOptionPane("Cantidad prestada NO puede ser mayor a cantidad total.");
            return false;
        }

        if (!SwingUtilities.includesValidChar(1, this.codigoTextField.getText())) {
            SwingUtilities.showJOptionPane("Digite código de la herramienta");
            this.codigoTextField.setBorder(SwingUtilities.colorBorder(1));
            return false;
        }
        if (!SwingUtilities.includesValidChar(2, this.descripcionTextField.getText())) {
            SwingUtilities.showJOptionPane("Digite descripcion de la herramienta");
            this.descripcionTextField.setBorder(SwingUtilities.colorBorder(1));
            return false;
        }

        return true;
    }
    private void cleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanButtonActionPerformed
        cleanTextFields();
    }//GEN-LAST:event_cleanButtonActionPerformed


    private void tableHerramientaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHerramientaMouseClicked
        this.spCantTotal.setEnabled(true);
        this.spCantPrestada.setEnabled(true);
        if (evt.getClickCount() == 2) {
            int row = tableHerramienta.getSelectedRow();
            codigoTextField.setText(getTableHerramienta().getValueAt(row, 0).toString());
            descripcionTextField.setText(getTableHerramienta().getValueAt(row, 1).toString());
            spCantTotal.setValue(Integer.parseInt(getTableHerramienta().getValueAt(row, 2).toString()));
            spCantPrestada.setValue(Integer.parseInt(getTableHerramienta().getValueAt(row, 3).toString()));
            this.codigoTextField.setEnabled(false);
            this.spCantTotal.setEnabled(true);
            this.spCantPrestada.setEnabled(true);
        }
    }//GEN-LAST:event_tableHerramientaMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (validateData()) {

            HerramientaMedica hm = new HerramientaMedica(
                    Integer.parseInt(this.codigoTextField.getText()),
                    this.descripcionTextField.getText(),
                    (Integer) spCantTotal.getValue(),
                    (Integer) spCantPrestada.getValue());

            int res = getBo().update(hm);

            SwingUtilities.updateSwitch(res);

        }
        cleanTextFields();

    }//GEN-LAST:event_updateButtonActionPerformed


    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (codigoTextField.getText().isEmpty()) {
            SwingUtilities.showJOptionPane("Seleccionar herramientas a eliminar");
        } else {
            try {
                int codigo = Integer.parseInt(codigoTextField.getText());
                HerramientaMedica hm = new HerramientaMedica();
                hm.setCodigo(codigo);
                int res = getBo().delete(hm);
                SwingUtilities.deleteSwitch(res);
                cleanTextFields();

            } catch (NumberFormatException nfe) {
                SwingUtilities.showJOptionPane("Ingresar código a eliminar (SOLO NUMEROS)");
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed


    private void getByCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getByCodeButtonActionPerformed

        if (SwingUtilities.includesValidChar(1, this.codigoTextField.getText())) {
            int codigo = Integer.parseInt(this.codigoTextField.getText());
            HerramientaMedica hm = getBo().getByCode(codigo);
            List<HerramientaMedica> list = new ArrayList<>();
            list.add(hm);
            if (list.get(0).getDescripcion() == null) {
                SwingUtilities.showJOptionPane("No hay registros");
                cleanTextFields();
            } else {
                fillTable(list);
            }
        } else {
            SwingUtilities.showJOptionPane("Ingresar código a buscar");
        }

    }//GEN-LAST:event_getByCodeButtonActionPerformed

    private void getByDescButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getByDescButtonActionPerformed
        if (SwingUtilities.includesValidChar(2, this.descripcionTextField.getText())) {
            List<HerramientaMedica> list = getBo().getByDesc(this.descripcionTextField.getText());
            if (list.isEmpty()) {
                SwingUtilities.showJOptionPane("No hay registros");
                cleanTextFields();
            } else {
                fillTable(list);
            }
        } else {
            SwingUtilities.showJOptionPane("Ingresar descripción a buscar");
        }


    }//GEN-LAST:event_getByDescButtonActionPerformed

    private void codigoTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoTextFieldMouseClicked
        this.codigoTextField.setBorder(SwingUtilities.colorBorder(2));
    }//GEN-LAST:event_codigoTextFieldMouseClicked

    private void descripcionTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descripcionTextFieldMouseClicked
        this.descripcionTextField.setBorder(SwingUtilities.colorBorder(2));
    }//GEN-LAST:event_descripcionTextFieldMouseClicked

    private void insertButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonMouseClicked
        if (validateData()) {

            int cantTotal = (Integer) spCantTotal.getValue();
            int cantPrestada = (Integer) spCantPrestada.getValue();

            int codigo = Integer.parseInt(this.codigoTextField.getText());
            HerramientaMedica hm = getBo().getByCode(codigo);
            List<HerramientaMedica> list = new ArrayList<>();
            list.add(hm);
            if (list.get(0).getDescripcion() != null) {
                SwingUtilities.showJOptionPane("Ya existe una herramienta médica con este código");
            } else {
                hm = new HerramientaMedica(
                        Integer.parseInt(this.codigoTextField.getText()),
                        this.descripcionTextField.getText(),
                        cantTotal,
                        cantPrestada);

                int res = getBo().insert(hm);
                SwingUtilities.registerSwitch(res);
                cleanTextFields();
            }

        }
    }//GEN-LAST:event_insertButtonMouseClicked

    private void descripcionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionTextFieldActionPerformed

    private void spCantTotalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spCantTotalStateChanged
        this.spCantTotal.setEnabled(true); // TODO add your handling code here:
    }//GEN-LAST:event_spCantTotalStateChanged

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertButtonActionPerformed

    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButtonActionPerformed
        MenuPrincipal mant = new MenuPrincipal();
        mant.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverButtonActionPerformed

    private void cleanTextFields() {

        this.codigoTextField.setEnabled(true);

        this.codigoTextField.setText("");
        this.descripcionTextField.setText("");

        fillTable();
    }

    public JTable getTableHerramienta() {
        return tableHerramienta;
    }

    public void setTableDoctor(JTable tableHerramienta) {
        this.tableHerramienta = tableHerramienta;
    }

    public DefaultTableModel getModelHerramienta() {
        return modelHerramienta;
    }

    public void setModelHerramienta(DefaultTableModel modelHerramienta) {
        this.modelHerramienta = modelHerramienta;
    }

    public HerramientaMedicaBo getBo() {
        return bo;
    }

    public void setBo(HerramientaMedicaBo bo) {
        this.bo = bo;
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
            java.util.logging.Logger.getLogger(MantHerramientaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantHerramientaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantHerramientaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantHerramientaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MantHerramientaMedica().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cleanButton;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField descripcionTextField;
    private javax.swing.JButton getByCodeButton;
    private javax.swing.JButton getByDescButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner spCantPrestada;
    private javax.swing.JSpinner spCantTotal;
    private javax.swing.JTable tableHerramienta;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables

}
