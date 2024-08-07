/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.ui;

import org.example.data.Memory;
import org.example.file.FileUtil;
import org.example.file.FormatHandler;
import org.example.controller.AppController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Damon Morgan, Ernesto Felix
 */
public class EditWindow extends javax.swing.JFrame {
    private String filePath;
    private AppController appController;

    /**
     * Creates new form InstructionWindow
     */
    public EditWindow(AppController appController) {
        this.appController = appController;
        filePath = "instructions.txt";
        initComponents();
        addPopupMenu();
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
        textArea = new javax.swing.JTextArea();
        continueButton = new javax.swing.JButton();
        saveAsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        scrollToTopButton = new javax.swing.JButton();
        convertButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        filePathLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        continueButton.setBackground(new java.awt.Color(0, 204, 0));
        continueButton.setText("Apply changes and load program");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        saveAsButton.setText("Save As");
        saveAsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        jLabel1.setText("View and edit");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Max instructions: 250");

        jLabel4.setForeground(new java.awt.Color(255, 0, 51));

        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Legacy instructions must be converted by clicking the button below");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        scrollToTopButton.setText("Scroll to top");
        scrollToTopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrollToTopButtonActionPerformed(evt);
            }
        });

        convertButton.setForeground(new java.awt.Color(204, 0, 0));
        convertButton.setText("Convert from legacy to new format");
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        filePathLabel.setBackground(new java.awt.Color(0, 0, 0));
        filePathLabel.setForeground(new java.awt.Color(255, 255, 0));
        filePathLabel.setText("file path");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(filePathLabel)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filePathLabel)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel6.setText("File name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(380, 380, 380)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(convertButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(saveAsButton)))
                            .addGap(40, 40, 40))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(scrollToTopButton)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(continueButton)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollToTopButton)
                        .addGap(11, 11, 11)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(convertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveAsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 26, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        List<Integer> instructions = extractInstructionsFromTextAreaInt();

        appController.getMemoryManager().writeToMemoryFromIntegerList(instructions);
        appController.getFileManager().saveInstructionsToFileFromMemory(filePath);

        File file = new File(filePath);
        appController.getGui().getRunProgramButton().setEnabled(true);
        appController.getGui().setSelectedFile(file);
        appController.getGui().clearOutputArea();
        appController.getGui().getFileLoadedLabel().setText(file.getName());
        appController.getGui().appendMessageToTextArea(file.getName() + " loaded successfully.\n");
        dispose();
    }//GEN-LAST:event_continueButtonActionPerformed

    private void scrollToTopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrollToTopButtonActionPerformed
        // TODO add your handling code here:
        jScrollPane1.getVerticalScrollBar().setValue(0);
    }//GEN-LAST:event_scrollToTopButtonActionPerformed

    public void saveAsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsButtonActionPerformed
        // TODO add your handling code here:
        List<String> instructions = extractInstructionsFromTextArea();

        appController.getMemoryManager().writeToMemoryFromStringList(instructions);
        File file = appController.getFileManager().saveAsInstructionsToFileFromMemory();
        this.setFilePath(file.getAbsolutePath());
        appController.getGui().setSelectedFile(file);

        filePathLabel.setText(file.getName());
        appController.getGui().getFileLoadedLabel().setText(file.getName());
        appController.getGui().appendMessageToTextArea(file.getName() + " saved and loaded successfully.\n");
        System.out.println(file.getName());

    }//GEN-LAST:event_saveAsButtonActionPerformed

    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        // TODO add your handling code here:
        List<Integer> instructions = extractInstructionsFromTextAreaInt();

        instructions = FormatHandler.convertInstructionsToNewFormat(instructions);
        for (Integer instruction : instructions) {
            int operation = instruction / 1000;
            int operand = instruction % 100;
            System.out.println("newInstruction: " + instruction + " Operation: " + operation + " Operand: " + operand);
        }
        List<String> stringList = new ArrayList<>();
        for (Integer instruction : instructions) {
            stringList.add(String.valueOf(instruction));
        }
        textArea.setText(null);
        appendInstructions(stringList);

    }//GEN-LAST:event_convertButtonActionPerformed

    /**
     * Creates and shows the instruction window with the given file path and instructions.
     *
     * @param file the file path of the program
     * @param instructions the list of instructions
     */
    public void createAndShowEditWindow(File file, List<String> instructions) {
        EditWindow editWindow = new EditWindow(appController);
        editWindow.setLocationByPlatform(true);
        editWindow.setVisible(true);
        editWindow.setFilePath(file.getAbsolutePath());
        editWindow.filePathLabel.setText(file.getName());
        editWindow.appendInstructions(instructions);
    }

    /**
     * Appends a list of instructions to the text area.
     *
     * @param instructions the list of instructions to append
     */
    public void appendInstructions(List<String> instructions) {
        int memorySize = Memory.SIZE;
        for (int j = 0; j < memorySize && j < instructions.size(); j++) {
            String instruction = instructions.get(j);
            textArea.append(instruction + "\n");
        }
    }

    /**
     * Sets the file path for saving instructions.
     *
     * @param filePath the file path
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Retrieves text from the text area.
     *
     * @return the list of instructions
     */
    public List<String> extractInstructionsFromTextArea() {
        List<String > instructions = new ArrayList<>();

        String text = textArea.getText();

        String[] lines = text.split("\\n");

        int i = 0;
        for (String line : lines) {
            instructions.add(line);
            System.out.println("line: " + i + ": " + line);
            i++;
        }
        return instructions;
    }

    public List<Integer> extractInstructionsFromTextAreaInt() {
        List<Integer> instructions = new ArrayList<>();

        String text = textArea.getText();

        String[] lines = text.split("\\n");

            int i = 0;
            for (String line : lines) {
                try{
                instructions.add(Integer.parseInt(line));
                System.out.println("line: " + i + ": " + line);
                i++;
                }catch (NumberFormatException e) {
                    instructions.add(0);
                    appController.getGui().appendMessageToTextArea("invalid instruction: " + line);
            }
        }

        return instructions;
    }

    /**
     * By Ernesto Felix
     * Adds a popup menu with Cut, Copy, and Paste functionality to the text area.
     */
    private void addPopupMenu() {
        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem cutMenuItem = new JMenuItem("Cut");
        cutMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.cut();
            }
        });
        popupMenu.add(cutMenuItem);

        JMenuItem copyMenuItem = new JMenuItem("Copy");
        copyMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.copy();
            }
        });
        popupMenu.add(copyMenuItem);

        JMenuItem pasteMenuItem = new JMenuItem("Paste");
        pasteMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.paste();
            }
        });
        popupMenu.add(pasteMenuItem);

        textArea.setComponentPopupMenu(popupMenu);
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueButton;
    private javax.swing.JButton convertButton;
    private javax.swing.JLabel filePathLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveAsButton;
    private javax.swing.JButton scrollToTopButton;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
