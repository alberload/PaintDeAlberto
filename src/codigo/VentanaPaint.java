package codigo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author xp
 */
public class VentanaPaint extends javax.swing.JFrame {

    BufferedImage buffer1, buffer2 = null;
    Graphics2D bufferGraphics, buffer2Graphics, lienzoGraphics = null;
    Color colorSelect = Color.BLACK;
    Forma miForma;
    Linea miLinea;
    Pincel miPincel;
    int numLados = 0;
    int radioPincel = 5;
    boolean relleno = true;

    public VentanaPaint() {
        initComponents();
        initBuffers();
        eligeColor.setSize(640, 450);
        guardarImagen.setSize(750, 400);
        color.setBackground(colorSelect);
    }
   
    private void initBuffers() {
        lienzoGraphics = (Graphics2D) lienzo.getGraphics();
        
        // Inicializo el 1er buffer
        buffer1 = (BufferedImage) lienzo.createImage(lienzo.getWidth(), lienzo.getHeight());
        bufferGraphics = buffer1.createGraphics();
        bufferGraphics.setColor(Color.white);
        bufferGraphics.fillRect(0, 0, buffer1.getWidth(), buffer1.getHeight());

        // Inicializo el 2º buffer
        buffer2 = (BufferedImage) lienzo.createImage(lienzo.getWidth(), lienzo.getHeight());
        buffer2Graphics = buffer2.createGraphics();
        buffer2Graphics.setColor(Color.white);
        buffer2Graphics.fillRect(0, 0, buffer2.getWidth(), buffer2.getHeight());
    }

//    public void initBuffers() {
//        lienzoGraphics = (Graphics2D) lienzo.getGraphics();
//        createBuffer(buffer, bufferGraphics);
//        createBuffer(buffer2, buffer2Graphics);
//    }
//
//    public void createBuffer(BufferedImage b, Graphics2D bG) {
//        b = (BufferedImage) lienzo.createImage(lienzo.getWidth(), lienzo.getHeight());
//        bG = b.createGraphics();
//        bG.setColor(Color.white);
//        bG.fillRect(0, 0, b.getWidth(), b.getHeight());
//    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        lienzoGraphics.drawImage(buffer1, 0, 0, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eligeColor = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        guardarImagen = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        lienzo = new javax.swing.JPanel();
        color = new javax.swing.JButton();
        cuadrado = new javax.swing.JButton();
        circulo = new javax.swing.JButton();
        triangulo = new javax.swing.JButton();
        pentagono = new javax.swing.JButton();
        hexagono = new javax.swing.JButton();
        estrella = new javax.swing.JButton();
        lapiz = new javax.swing.JButton();
        linea = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuNuevo = new javax.swing.JMenuItem();
        menuGuardar = new javax.swing.JMenuItem();

        jButton2.setText("Aceptar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout eligeColorLayout = new javax.swing.GroupLayout(eligeColor.getContentPane());
        eligeColor.getContentPane().setLayout(eligeColorLayout);
        eligeColorLayout.setHorizontalGroup(
            eligeColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eligeColorLayout.createSequentialGroup()
                .addGroup(eligeColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eligeColorLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButton2)
                        .addGap(148, 148, 148)
                        .addComponent(jButton3))
                    .addGroup(eligeColorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        eligeColorLayout.setVerticalGroup(
            eligeColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eligeColorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(eligeColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(0, 50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout guardarImagenLayout = new javax.swing.GroupLayout(guardarImagen.getContentPane());
        guardarImagen.getContentPane().setLayout(guardarImagenLayout);
        guardarImagenLayout.setHorizontalGroup(
            guardarImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarImagenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        guardarImagenLayout.setVerticalGroup(
            guardarImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarImagenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));

        lienzo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lienzoMouseDragged(evt);
            }
        });
        lienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lienzoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lienzoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );

        color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                colorMousePressed(evt);
            }
        });

        cuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/cuadrado.png"))); // NOI18N
        cuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuadradoMousePressed(evt);
            }
        });

        circulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/circulo.png"))); // NOI18N
        circulo.setPreferredSize(new java.awt.Dimension(38, 38));
        circulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                circuloMousePressed(evt);
            }
        });

        triangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/triangulo.png"))); // NOI18N
        triangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                trianguloMousePressed(evt);
            }
        });

        pentagono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/pentagono.png"))); // NOI18N
        pentagono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pentagonoMousePressed(evt);
            }
        });

        hexagono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/Hexagon-32.png"))); // NOI18N
        hexagono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hexagonoMousePressed(evt);
            }
        });

        estrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/estrella.png"))); // NOI18N
        estrella.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                estrellaMousePressed(evt);
            }
        });

        lapiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/lapiz.png"))); // NOI18N
        lapiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lapizMousePressed(evt);
            }
        });

        linea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linea.png"))); // NOI18N
        linea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lineaMousePressed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButton1.setText("Relleno");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton1MousePressed(evt);
            }
        });

        jMenu1.setText("File");

        menuNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        menuNuevo.setText("Nuevo");
        menuNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuNuevoMousePressed(evt);
            }
        });
        menuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(menuNuevo);

        menuGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        menuGuardar.setText("Guardar");
        menuGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuGuardarMousePressed(evt);
            }
        });
        menuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(menuGuardar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(circulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pentagono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hexagono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estrella, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(linea, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lapiz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {circulo, cuadrado, estrella, hexagono, pentagono, triangulo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(circulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pentagono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hexagono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(estrella, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(color, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lapiz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(linea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {circulo, cuadrado, estrella, hexagono, pentagono, triangulo});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lienzoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMousePressed
        switch (numLados) {
            case 1:
                miPincel = new Pincel(evt.getX(), evt.getY(), radioPincel, colorSelect, relleno);
                break;
            case 2:
                miLinea = new Linea(evt.getX(), evt.getY(), colorSelect);
                break;
            case 3:
                miForma = new Triangulo(evt.getX(), evt.getY(), colorSelect, relleno);
                break;
            case 4:
                miForma = new Cuadrado(evt.getX(), evt.getY(), colorSelect, relleno);
                break;
            case 5:
                miForma = new Pentagono(evt.getX(), evt.getY(), colorSelect, relleno);
                break;
            case 6:
                miForma = new Hexagono(evt.getX(), evt.getY(), colorSelect, relleno);
                break;
            case 12:
                miForma = new Estrella(evt.getX(), evt.getY(), colorSelect, relleno);
                break;
            case 100:
                miForma = new Circulo(evt.getX(), evt.getY(), colorSelect, relleno);
                break;
        }

        repaint(0, 0, 1, 1);
    }//GEN-LAST:event_lienzoMousePressed

    private void lienzoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseDragged
        //borro lo que hubiera en el lienzo
        if (numLados != 1 && numLados != 2){
            bufferGraphics.drawImage(buffer2, 0, 0, null);
            miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
            lienzoGraphics.drawImage(buffer1, 0, 0, null);
        } else if (numLados == 1){
            // Pincel
//            miPincel.dibujate(buffer2Graphics, evt.getX(), evt.getY(), radioPincel);
//            miPincel = new Pincel(evt.getX(), evt.getY(), radioPincel, colorSelect, relleno);
//            lienzoGraphics.drawImage(buffer1, 0, 0, null);
            miPincel.dibujate(buffer2Graphics, evt.getX(), evt.getY(), radioPincel);
            lienzoGraphics.drawImage(buffer2, 0, 0, null);
            bufferGraphics.drawImage(buffer1, 0, 0, null);
            miPincel.dibujate(bufferGraphics, evt.getX(), evt.getY(), radioPincel);
            lienzoGraphics.drawImage(buffer1, 0, 0, null);
        } else if (numLados == 2){
            bufferGraphics.drawImage(buffer2, 0, 0, null);
            miLinea.dibujate(bufferGraphics, evt.getX(), evt.getY());
            lienzoGraphics.drawImage(buffer1, 0, 0, null);
        }
        repaint(0, 0, 1, 1);
    }//GEN-LAST:event_lienzoMouseDragged

    private void lienzoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseReleased
        if (numLados != 2) {
            miForma.dibujate(buffer2Graphics, evt.getX(), evt.getY());
        } else if (numLados == 2) {
            miLinea.dibujate(buffer2Graphics, evt.getX(), evt.getY());
        } else if (numLados == 1) {
            //Pincel
            miPincel.dibujate(buffer2Graphics, evt.getX(), evt.getY(), radioPincel);
        }

    }//GEN-LAST:event_lienzoMouseReleased

    private void colorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorMousePressed
        eligeColor.setVisible(true);
    }//GEN-LAST:event_colorMousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        colorSelect = jColorChooser1.getColor();
        eligeColor.setVisible(false);
        color.setBackground(colorSelect);
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        eligeColor.setVisible(false);
    }//GEN-LAST:event_jButton3MousePressed

    private void cuadradoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuadradoMousePressed
        //cuadrados
        numLados = 4;
    }//GEN-LAST:event_cuadradoMousePressed

    private void circuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_circuloMousePressed
        //circulos
        numLados = 100;
    }//GEN-LAST:event_circuloMousePressed

    private void trianguloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trianguloMousePressed
        //triangulos
        numLados = 3;
    }//GEN-LAST:event_trianguloMousePressed

    private void pentagonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pentagonoMousePressed
        //pentagonos
        numLados = 5;
    }//GEN-LAST:event_pentagonoMousePressed

    private void hexagonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hexagonoMousePressed
        //Hexagonos
        numLados = 6;
    }//GEN-LAST:event_hexagonoMousePressed

    private void estrellaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estrellaMousePressed
        numLados = 12;
    }//GEN-LAST:event_estrellaMousePressed

    private void menuGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGuardarMousePressed
        int seleccion = jFileChooser1.showSaveDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            //el usuario ha pulsado en ACEPTAR
            File fichero = jFileChooser1.getSelectedFile();
            String nombre = fichero.getName();
            String extension = nombre.substring(nombre.lastIndexOf('.') + 1, nombre.length());
            if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")) {
                try {
                    ImageIO.write(buffer1, extension, fichero);
                } catch (IOException e) {
                }
            }
        }

        if (seleccion == JFileChooser.CANCEL_OPTION) {
            //el usuario ha pulsado en CANCELAR
        }
    }//GEN-LAST:event_menuGuardarMousePressed

    private void menuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarActionPerformed
        int seleccion = jFileChooser1.showSaveDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            //el usuario ha pulsado en ACEPTAR
            File fichero = jFileChooser1.getSelectedFile();
            String nombre = fichero.getName();
            String extension = nombre.substring(nombre.lastIndexOf('.') + 1, nombre.length());
            if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")) {
                try {
                    ImageIO.write(buffer1, extension, fichero);
                } catch (IOException e) {
                }
            }
        }

        if (seleccion == JFileChooser.CANCEL_OPTION) {
            //el usuario ha pulsado en CANCELAR
        }
    }//GEN-LAST:event_menuGuardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lapizMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lapizMousePressed
        numLados = 1;
    }//GEN-LAST:event_lapizMousePressed

    private void lineaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lineaMousePressed
        numLados = 2;
    }//GEN-LAST:event_lineaMousePressed

    private void jToggleButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MousePressed
        relleno = !relleno;
    }//GEN-LAST:event_jToggleButton1MousePressed

    private void menuNuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuNuevoMousePressed
        initBuffers();
        repaint();
    }//GEN-LAST:event_menuNuevoMousePressed

    private void menuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton circulo;
    private javax.swing.JButton color;
    private javax.swing.JButton cuadrado;
    private javax.swing.JDialog eligeColor;
    private javax.swing.JButton estrella;
    private javax.swing.JDialog guardarImagen;
    private javax.swing.JButton hexagono;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton lapiz;
    private javax.swing.JPanel lienzo;
    private javax.swing.JButton linea;
    private javax.swing.JMenuItem menuGuardar;
    private javax.swing.JMenuItem menuNuevo;
    private javax.swing.JButton pentagono;
    private javax.swing.JButton triangulo;
    // End of variables declaration//GEN-END:variables
}
