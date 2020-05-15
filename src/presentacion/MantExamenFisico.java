package presentacion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import negocio.bo.DoctorBo;
import negocio.bo.ExamenFisicoBo;
import negocio.bo.PacienteBo;
import negocio.clases.Doctor;
import negocio.clases.ExamenFisico;
import negocio.clases.Paciente;
import utilities.SwingUtilities;

/**
 *
 * @author Enzo Quartino Zamora
 * <github.com/enzocr || email: enzoquartino@gmail.com>
 */
@SuppressWarnings("serial")
public class MantExamenFisico extends javax.swing.JFrame {

    private ExamenFisicoBo bo;
    private DoctorBo dbo;
    private PacienteBo pbo;
    private DefaultTableModel modelExamen;

    /**
     * Creates new form MantProfesor
     */
    public MantExamenFisico() {
        initComponents();

        this.bo = new ExamenFisicoBo();
        this.pbo = new PacienteBo();
        this.dbo = new DoctorBo();
        this.modelExamen = new DefaultTableModel();
        fillDoctors();
        fillPatients();
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
        codigoTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        temperaturaTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        cleanButton = new javax.swing.JButton();
        getByPatientIdButton = new javax.swing.JButton();
        getByCodeButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        alturaTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        enfermedadTextField = new javax.swing.JTextField();
        pesoTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        insertButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        doctorComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        pacienteComboBox = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableExamen = new javax.swing.JTable();
        presionArterialTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("Mantenimiento de examenes");

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

        jLabel4.setText("Temperatura:");

        temperaturaTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                temperaturaTextFieldMouseClicked(evt);
            }
        });

        jLabel5.setText("Presion alterial:");

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

        getByPatientIdButton.setText("Consultar por # asegurado");
        getByPatientIdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getByPatientIdButtonActionPerformed(evt);
            }
        });

        getByCodeButton.setText("Consultar por código");
        getByCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getByCodeButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Altura (m):");

        alturaTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alturaTextFieldMouseClicked(evt);
            }
        });
        alturaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Enfermedad:");

        enfermedadTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enfermedadTextFieldMouseClicked(evt);
            }
        });
        enfermedadTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enfermedadTextFieldActionPerformed(evt);
            }
        });

        pesoTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesoTextFieldMouseClicked(evt);
            }
        });
        pesoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Peso (kg):");

        insertButton.setText("Agregar");
        insertButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertButtonMouseClicked(evt);
            }
        });

        jLabel3.setText("Doctor:");

        jLabel10.setText("Paciente:");

        tableExamen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableExamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableExamenMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableExamen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(alturaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(30, 30, 30)
                                                .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(pesoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(166, 166, 166))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(presionArterialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pacienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(22, 22, 22)
                                        .addComponent(enfermedadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(temperaturaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(getByCodeButton)
                                    .addComponent(insertButton))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(getByPatientIdButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(updateButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cleanButton)
                                        .addGap(107, 107, 107)
                                        .addComponent(deleteButton))))
                            .addComponent(jScrollPane3))
                        .addGap(39, 39, 39))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(221, 221, 221))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(presionArterialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(temperaturaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(alturaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(enfermedadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(pacienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cleanButton)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(insertButton))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getByPatientIdButton)
                    .addComponent(getByCodeButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTextFieldActionPerformed

    }//GEN-LAST:event_codigoTextFieldActionPerformed

    private void fillTable() {
        fillDoctors();
        fillPatients();
        this.modelExamen = new DefaultTableModel() {
            private static final long serialVersionUID = 1L;

            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        getTableExamen().getTableHeader().setReorderingAllowed(false);

        getModelExamen().setColumnCount(0);

        getModelExamen().addColumn("Código");
        getModelExamen().addColumn("# Asegurado");
        getModelExamen().addColumn("Nombre asegurado");
        getModelExamen().addColumn("Peso");
        getModelExamen().addColumn("Altura");
        getModelExamen().addColumn("Presión");
        getModelExamen().addColumn("Temperatura");
        getModelExamen().addColumn("Enfermedad");
        getModelExamen().addColumn("Cédula doctor");
        getModelExamen().addColumn("Nombre doctor");

        List<ExamenFisico> list = getBo().getAll();

        if (list != null) {
            getModelExamen().setNumRows(list.size());

            for (int i = 0; i < list.size(); i++) {

                ExamenFisico exf = list.get(i);
                getModelExamen().setValueAt(exf.getCodigo(), i, 0);//i=fila 0=columna
                getModelExamen().setValueAt(exf.getPaciente().getNumAsegurado(), i, 1);
                getModelExamen().setValueAt(exf.getPaciente().getNombre(), i, 2);
                getModelExamen().setValueAt(exf.getPeso(), i, 3);
                getModelExamen().setValueAt(exf.getAltura(), i, 4);
                getModelExamen().setValueAt(exf.getPresionArterial(), i, 5);
                getModelExamen().setValueAt(exf.getTemperatura(), i, 6);
                getModelExamen().setValueAt(exf.getEnfermedad(), i, 7);
                getModelExamen().setValueAt(exf.getDoctor().getCedula(), i, 8);
                getModelExamen().setValueAt(exf.getDoctor().getNombre(), i, 9);
            }
        }

        getTableExamen().setModel(getModelExamen());
    }

    private void fillTable(List<ExamenFisico> list) {

        this.modelExamen = new DefaultTableModel() {
            private static final long serialVersionUID = 1L;

            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        getTableExamen().getTableHeader().setReorderingAllowed(false);
        getModelExamen().setColumnCount(0);

        getModelExamen().addColumn("Código");
        getModelExamen().addColumn("# Asegurado");
        getModelExamen().addColumn("Nombre asegurado");
        getModelExamen().addColumn("Peso");
        getModelExamen().addColumn("Altura");
        getModelExamen().addColumn("Presión");
        getModelExamen().addColumn("Temperatura");
        getModelExamen().addColumn("Enfermedad");
        getModelExamen().addColumn("Cédula doctor");
        getModelExamen().addColumn("Nombre doctor");

        if (list != null) {
            getModelExamen().setNumRows(list.size());

            for (int i = 0; i < list.size(); i++) {
                ExamenFisico exf = list.get(i);
                getModelExamen().setValueAt(exf.getCodigo(), i, 0);//i=fila 0=columna
                getModelExamen().setValueAt(exf.getPaciente().getNumAsegurado(), i, 1);
                getModelExamen().setValueAt(exf.getPaciente().getNombre(), i, 2);
                getModelExamen().setValueAt(exf.getPeso(), i, 3);
                getModelExamen().setValueAt(exf.getAltura(), i, 4);
                getModelExamen().setValueAt(exf.getPresionArterial(), i, 5);
                getModelExamen().setValueAt(exf.getTemperatura(), i, 6);
                getModelExamen().setValueAt(exf.getEnfermedad(), i, 7);
                getModelExamen().setValueAt(exf.getDoctor().getCedula(), i, 8);
                getModelExamen().setValueAt(exf.getDoctor().getNombre(), i, 9);
            }
        }

        this.tableExamen.setModel(getModelExamen());
    }

    private void fillDoctors() {
        this.doctorComboBox.removeAllItems();
        List<Doctor> list = getDbo().getAll();
        this.doctorComboBox.addItem("---Seleccione doctor---");
        for (Doctor d : list) {
            this.doctorComboBox.addItem(d.getCedula() + "-" + d.getNombre());
        }
    }

    private void fillPatients() {
        this.pacienteComboBox.removeAllItems();
        List<Paciente> list = getPbo().getAll();
        this.pacienteComboBox.addItem("---Seleccione paciente---");
        for (Paciente p : list) {
            this.pacienteComboBox.addItem(p.getNumAsegurado() + "-" + p.getNombre());
        }
    }

    private boolean validateData() {

        if (!SwingUtilities.includesValidChar(1, this.codigoTextField.getText())) {
            SwingUtilities.showJOptionPane("Digite código del exámen");
            this.codigoTextField.setBorder(SwingUtilities.colorBorder(1));
            return false;
        }
        if (!SwingUtilities.includesValidChar(2, this.enfermedadTextField.getText())) {
            SwingUtilities.showJOptionPane("Digite enfermedad del paciente");
            this.enfermedadTextField.setBorder(SwingUtilities.colorBorder(1));
            return false;
        }
        if (!SwingUtilities.includesValidChar(1, this.presionArterialTextField.getText())) {
            SwingUtilities.showJOptionPane("Digite presion alterial del paciente");
            this.presionArterialTextField.setBorder(SwingUtilities.colorBorder(1));
            return false;
        }
        if (!SwingUtilities.includesValidChar(1, this.pesoTextField.getText())) {
            SwingUtilities.showJOptionPane("Digite peso del paciente");
            this.pesoTextField.setBorder(SwingUtilities.colorBorder(1));
            return false;
        }
        if (!SwingUtilities.includesValidChar(3, this.temperaturaTextField.getText())) {
            SwingUtilities.showJOptionPane("Digite temperatura del paciente");
            this.temperaturaTextField.setBorder(SwingUtilities.colorBorder(1));
            return false;
        }
        if (!SwingUtilities.includesValidChar(3, this.alturaTextField.getText())) {
            SwingUtilities.showJOptionPane("Digite altura del paciente");
            this.alturaTextField.setBorder(SwingUtilities.colorBorder(1));
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
            String[] infoDoc = doctor.trim().split("-");
            Doctor d = getDbo().getById(Integer.parseInt(infoDoc[0]));

            String paciente = this.pacienteComboBox.getSelectedItem().toString();
            String[] infoPac = paciente.trim().split("-");
            Paciente p = getPbo().getById(Integer.parseInt(infoPac[0]));

            ExamenFisico exf = new ExamenFisico(
                    Integer.parseInt(this.codigoTextField.getText()),
                    p,
                    Integer.parseInt(this.pesoTextField.getText()),
                    Double.parseDouble(this.alturaTextField.getText()),
                    Integer.parseInt(this.presionArterialTextField.getText()),
                    Double.parseDouble(this.temperaturaTextField.getText()),
                    this.enfermedadTextField.getText(),
                    d
            );
            int res = getBo().update(exf);

            SwingUtilities.updateSwitch(res);

        }
        cleanTextFields();

    }//GEN-LAST:event_updateButtonActionPerformed


    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (codigoTextField.getText().isEmpty()) {
            SwingUtilities.showJOptionPane("Seleccionar examen a eliminar");
        } else {
            try {
                int codigo = Integer.parseInt(codigoTextField.getText());
                ExamenFisico ex = new ExamenFisico();
                ex.setCodigo(codigo);
                int res = getBo().delete(ex);
                SwingUtilities.deleteSwitch(res);
                cleanTextFields();

            } catch (NumberFormatException nfe) {
                SwingUtilities.showJOptionPane("Ingresar cédula a eliminar (SOLO NUMEROS)");
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed


    private void getByPatientIdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getByPatientIdButtonActionPerformed

        String paciente = this.pacienteComboBox.getSelectedItem().toString();
        String[] infoPac = paciente.trim().split("-");

        if (!this.pacienteComboBox.getSelectedItem().equals("---Seleccione paciente---")) {
            int numAsegurado = Integer.parseInt(infoPac[0]);
            ExamenFisico exf = getBo().getByPatientId(numAsegurado);
            if (exf == null) {
                SwingUtilities.showJOptionPane("No hay examen(es) del paciente buscado");
                cleanTextFields();
            } else {
                List<ExamenFisico> list = new ArrayList<>();
                list.add(exf);
                fillTable(list);
            }

        } else {
            SwingUtilities.showJOptionPane("Seleccionar paciente a buscar");
        }

    }//GEN-LAST:event_getByPatientIdButtonActionPerformed

    private void getByCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getByCodeButtonActionPerformed

        if (SwingUtilities.includesValidChar(1, this.codigoTextField.getText())) {
            ExamenFisico exf = getBo().getByCode(Integer.parseInt(this.codigoTextField.getText()));
            if (exf == null) {
                SwingUtilities.showJOptionPane("No existe el examen buscado");
                cleanTextFields();
            } else {
                List<ExamenFisico> list = new ArrayList<>();
                list.add(exf);
                fillTable(list);
            }
        }


    }//GEN-LAST:event_getByCodeButtonActionPerformed

    private void alturaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaTextFieldActionPerformed
        this.alturaTextField.setBorder(SwingUtilities.colorBorder(2));
    }//GEN-LAST:event_alturaTextFieldActionPerformed

    private void enfermedadTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enfermedadTextFieldActionPerformed

    }//GEN-LAST:event_enfermedadTextFieldActionPerformed

    private void codigoTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoTextFieldMouseClicked
        this.codigoTextField.setBorder(SwingUtilities.colorBorder(2));
    }//GEN-LAST:event_codigoTextFieldMouseClicked

    private void alturaTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alturaTextFieldMouseClicked
        this.alturaTextField.setBorder(SwingUtilities.colorBorder(2));
    }//GEN-LAST:event_alturaTextFieldMouseClicked

    private void temperaturaTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temperaturaTextFieldMouseClicked
        this.temperaturaTextField.setBorder(SwingUtilities.colorBorder(2));
    }//GEN-LAST:event_temperaturaTextFieldMouseClicked

    private void enfermedadTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enfermedadTextFieldMouseClicked
        this.enfermedadTextField.setBorder(SwingUtilities.colorBorder(2));
    }//GEN-LAST:event_enfermedadTextFieldMouseClicked

    private void pesoTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesoTextFieldMouseClicked
        this.pesoTextField.setBorder(SwingUtilities.colorBorder(2));
    }//GEN-LAST:event_pesoTextFieldMouseClicked

    private void insertButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonMouseClicked
        if (validateData()) {

            String doctor = this.doctorComboBox.getSelectedItem().toString();
            String paciente = this.pacienteComboBox.getSelectedItem().toString();
            if (!doctor.equals("---Seleccione doctor---") && !paciente.equals("---Seleccione paciente---")) {
                String[] infoDoc = doctor.trim().split("-");
                Doctor d = getDbo().getById(Integer.parseInt(infoDoc[0]));

                String[] infoPac = paciente.trim().split("-");
                Paciente p = getPbo().getById(Integer.parseInt(infoPac[0]));

                ExamenFisico exf = new ExamenFisico(
                        Integer.parseInt(this.codigoTextField.getText()),
                        p,
                        Integer.parseInt(this.pesoTextField.getText()),
                        Double.parseDouble(this.alturaTextField.getText()),
                        Integer.parseInt(this.presionArterialTextField.getText()),
                        Double.parseDouble(this.temperaturaTextField.getText()),
                        this.enfermedadTextField.getText(),
                        d
                );

                int res = getBo().insert(exf);

                SwingUtilities.registerSwitch(res);
                cleanTextFields();

            } else {
                SwingUtilities.showJOptionPane("Rellenar espacios vacíos");
            }

        }
    }//GEN-LAST:event_insertButtonMouseClicked

    private void pesoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoTextFieldActionPerformed

    private void tableExamenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableExamenMouseClicked

        if (evt.getClickCount() == 2) {

            this.pacienteComboBox.removeAllItems();
            int row = tableExamen.getSelectedRow();
            this.codigoTextField.setText(getTableExamen().getValueAt(row, 0).toString());
            this.pacienteComboBox.addItem(getTableExamen().getValueAt(row, 1).toString() + "-" + getTableExamen().getValueAt(row, 2).toString());
            this.pesoTextField.setText(getTableExamen().getValueAt(row, 3).toString());
            this.alturaTextField.setText(getTableExamen().getValueAt(row, 4).toString());
            this.presionArterialTextField.setText(getTableExamen().getValueAt(row, 5).toString());
            this.temperaturaTextField.setText(getTableExamen().getValueAt(row, 6).toString());
            this.enfermedadTextField.setText(getTableExamen().getValueAt(row, 7).toString());
            this.doctorComboBox.addItem(getTableExamen().getValueAt(row, 8).toString() + "-" + getTableExamen().getValueAt(row, 9).toString());

            this.codigoTextField.setEnabled(false);
            this.pacienteComboBox.setEnabled(false);

        }


    }//GEN-LAST:event_tableExamenMouseClicked

    private void cleanTextFields() {

        this.pacienteComboBox.setEnabled(true);
        this.doctorComboBox.setEnabled(true);
        this.codigoTextField.setEnabled(true);
        this.codigoTextField.setText("");
        this.pesoTextField.setText("");
        this.alturaTextField.setText("");
        this.temperaturaTextField.setText("");
        this.presionArterialTextField.setText("");
        this.enfermedadTextField.setText("");

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
            java.util.logging.Logger.getLogger(MantExamenFisico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantExamenFisico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantExamenFisico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantExamenFisico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MantExamenFisico().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alturaTextField;
    private javax.swing.JButton cleanButton;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> doctorComboBox;
    private javax.swing.JTextField enfermedadTextField;
    private javax.swing.JButton getByCodeButton;
    private javax.swing.JButton getByPatientIdButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> pacienteComboBox;
    private javax.swing.JTextField pesoTextField;
    private javax.swing.JTextField presionArterialTextField;
    private javax.swing.JTable tableExamen;
    private javax.swing.JTextField temperaturaTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
  public DefaultTableModel getModelExamen() {
        return modelExamen;
    }

    public void setModelExamen(DefaultTableModel modelExamen) {
        this.modelExamen = modelExamen;
    }

    public ExamenFisicoBo getBo() {
        return bo;
    }

    public void setBo(ExamenFisicoBo bo) {
        this.bo = bo;
    }

    public JTable getTableExamen() {
        return tableExamen;
    }

    public DoctorBo getDbo() {
        return dbo;
    }

    public void setDbo(DoctorBo dbo) {
        this.dbo = dbo;
    }

    public PacienteBo getPbo() {
        return pbo;
    }

    public void setPbo(PacienteBo pbo) {
        this.pbo = pbo;
    }

}