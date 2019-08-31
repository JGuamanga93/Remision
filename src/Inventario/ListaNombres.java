/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ing.Ivan
 */
public class ListaNombres extends javax.swing.JDialog {

    /**
     * Creates new form ListaSolicitantes
     */
    public ListaNombres(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnl_fondo = new javax.swing.JPanel();
        btn_seleccionar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaNombres = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ventana Emergente de Solicitantes");
        setUndecorated(true);

        jpnl_fondo.setBackground(new java.awt.Color(255, 255, 255));
        jpnl_fondo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busca y Selecciona ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Subheading", 1, 14), new java.awt.Color(0, 153, 204))); // NOI18N
        jpnl_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_seleccionar.setBackground(new java.awt.Color(255, 255, 255));
        btn_seleccionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_seleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Iconos20x20/20x20-OK.png"))); // NOI18N
        btn_seleccionar.setText("SELECCIONAR");
        btn_seleccionar.setToolTipText("Selecciona unafila");
        btn_seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionarActionPerformed(evt);
            }
        });
        jpnl_fondo.add(btn_seleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 150, 40));

        btn_salir.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Iconos20x20/20X20-CANCEL.png"))); // NOI18N
        btn_salir.setText("SALIR");
        btn_salir.setToolTipText("Cierra la ventana");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jpnl_fondo.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 140, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Iconos40x40/40x40-BUSCAR.png"))); // NOI18N
        jLabel10.setText("BUSCAR ");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, new java.awt.Color(102, 102, 102)));
        jpnl_fondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 40));

        txt_buscar.setBackground(new java.awt.Color(0, 0, 0));
        txt_buscar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_buscar.setForeground(new java.awt.Color(0, 153, 255));
        txt_buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_buscar.setCaretColor(new java.awt.Color(0, 153, 255));
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });
        jpnl_fondo.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 30, 340, 40));

        TablaNombres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 153, 204), null, new java.awt.Color(0, 153, 204)));
        TablaNombres.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TablaNombres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Estado", "Profesion u Ocupacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaNombres.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TablaNombres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablaNombres.setOpaque(false);
        TablaNombres.getTableHeader().setReorderingAllowed(false);
        TablaNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaNombresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaNombres);

        jpnl_fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 720, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnl_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnl_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //selecciona la fila y llena los campos 
    public void SeleccionarFila(){
         int filasel;
        String id,nombre,estado,proocu;
       try{
            filasel=TablaNombres.getSelectedRow();
            if (filasel==-1) {
                JOptionPane.showMessageDialog(null,"No se ha seleccionado ninguna fila","Advertencia",JOptionPane.WARNING_MESSAGE);
            }else{
               mo=(DefaultTableModel) TablaNombres.getModel();
                
                nombre=(String)mo.getValueAt(filasel, 1);
                SalidasAlmacen.txtSolicitante.setText(nombre);
                
                
                this.dispose();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    //metodo donde se crea la tabla con sus datos 
    DefaultTableModel mo;
    public void GenerarTabla(String val){
        String titles[]={"Codigo","Nombre","Estado","Profesion u Ocupacion"};
        String reg[]=new String[4];
        String consulta="";
        mo=new DefaultTableModel(null,titles);
         Connection con;
        con=Conexion.Conexion.GetConnection();
        
        consulta="CALL SP_ListaNombres('%"+val+"%')";
             
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(consulta);
               while (rs.next()) {
                   reg[0]=rs.getString("id");
                   reg[1]=rs.getString("Nombre");
                   reg[2]=rs.getString("Estado");
                   reg[3]=rs.getString("ProfesionuOcupacion");
                   
                   mo.addRow(reg);//agrega el registro a la tabla
               }
            TablaNombres.setModel(mo);//asigna a la tabla el modelo creado
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
    }
    private void btn_seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionarActionPerformed
        //selecciona la fila y manda los datos a la ventana
        SeleccionarFila();
        
    }//GEN-LAST:event_btn_seleccionarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        //cierra la ventana
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        //actualiza la tabla conforme a la letra que teclea
        if(txt_buscar.getText().trim().length()>=1){
            String filtro=txt_buscar.getText();
           GenerarTabla(filtro);

            TablaNombres.setVisible(true);

        } else{
            TablaNombres.setVisible(false);

        }
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void TablaNombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaNombresMouseClicked
        if (evt.getClickCount()==2) {
            SeleccionarFila();
        }
    }//GEN-LAST:event_TablaNombresMouseClicked

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
            java.util.logging.Logger.getLogger(ListaNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListaNombres dialog = new ListaNombres(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaNombres;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_seleccionar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnl_fondo;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
