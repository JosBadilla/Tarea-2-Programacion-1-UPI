
package calculadora;


public class Principal extends javax.swing.JPanel {

    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        bCalcular = new javax.swing.JButton();
        tValor1 = new javax.swing.JTextField();
        bCalculadora = new javax.swing.JLabel();
        tValor2 = new javax.swing.JTextField();
        lTexto2 = new javax.swing.JLabel();
        lTexto = new javax.swing.JLabel();
        rSuma = new javax.swing.JRadioButton();
        rResta = new javax.swing.JRadioButton();
        rMultiplicacion = new javax.swing.JRadioButton();
        rDivision = new javax.swing.JRadioButton();
        lResultado = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(null);

        bCalcular.setBackground(new java.awt.Color(153, 204, 255));
        bCalcular.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bCalcular.setForeground(new java.awt.Color(255, 0, 0));
        bCalcular.setText("Calcular");
        bCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcularActionPerformed(evt);
            }
        });
        add(bCalcular);
        bCalcular.setBounds(170, 240, 233, 95);

        tValor1.setBackground(new java.awt.Color(153, 204, 255));
        tValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tValor1ActionPerformed(evt);
            }
        });
        add(tValor1);
        tValor1.setBounds(40, 160, 170, 60);

        bCalculadora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bCalculadora.setForeground(new java.awt.Color(255, 0, 0));
        bCalculadora.setText("Calculadora");
        add(bCalculadora);
        bCalculadora.setBounds(230, 10, 130, 64);

        tValor2.setBackground(new java.awt.Color(153, 204, 255));
        tValor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tValor2ActionPerformed(evt);
            }
        });
        add(tValor2);
        tValor2.setBounds(370, 160, 170, 60);

        lTexto2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lTexto2.setForeground(new java.awt.Color(0, 255, 255));
        lTexto2.setText("Valor 2");
        add(lTexto2);
        lTexto2.setBounds(460, 90, 100, 50);

        lTexto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lTexto.setForeground(new java.awt.Color(0, 255, 255));
        lTexto.setText("Valor 1");
        add(lTexto);
        lTexto.setBounds(40, 100, 100, 40);

        buttonGroup1.add(rSuma);
        rSuma.setSelected(true);
        rSuma.setText("Suma");
        add(rSuma);
        rSuma.setBounds(470, 250, 51, 23);

        buttonGroup1.add(rResta);
        rResta.setText("Resta");
        add(rResta);
        rResta.setBounds(470, 290, 53, 23);

        buttonGroup1.add(rMultiplicacion);
        rMultiplicacion.setText("Multiplicacion");
        add(rMultiplicacion);
        rMultiplicacion.setBounds(470, 330, 87, 23);

        buttonGroup1.add(rDivision);
        rDivision.setText("Division");
        add(rDivision);
        rDivision.setBounds(470, 370, 61, 23);

        lResultado.setBackground(new java.awt.Color(255, 0, 0));
        lResultado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lResultado);
        lResultado.setBounds(120, 370, 330, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void tValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tValor1ActionPerformed
       
    }//GEN-LAST:event_tValor1ActionPerformed

    private void bCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcularActionPerformed
    
        
        float num1 = 0, num2 = 0, total = 0;
    num1 = Float.parseFloat(tValor1.getText());
    num2 = Float.parseFloat(tValor2.getText());
   
    if (rSuma.isSelected()){
        total = num1 + num2;      
    }  else if (rResta.isSelected());{
    total = num1 - num2;
    }
    if (rMultiplicacion.isSelected()){
        total = num1 * num2;      
    }  else if (rDivision.isSelected());{
    total = num1 / num2;
    }
    
    lResultado.setText(String.valueOf(total));
    }//GEN-LAST:event_bCalcularActionPerformed

    private void tValor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tValor2ActionPerformed
       
    }//GEN-LAST:event_tValor2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bCalculadora;
    private javax.swing.JButton bCalcular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel lResultado;
    private javax.swing.JLabel lTexto;
    private javax.swing.JLabel lTexto2;
    private javax.swing.JRadioButton rDivision;
    private javax.swing.JRadioButton rMultiplicacion;
    private javax.swing.JRadioButton rResta;
    private javax.swing.JRadioButton rSuma;
    private javax.swing.JTextField tValor1;
    private javax.swing.JTextField tValor2;
    // End of variables declaration//GEN-END:variables
}
