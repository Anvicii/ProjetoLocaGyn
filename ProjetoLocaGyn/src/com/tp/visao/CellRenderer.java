/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.visao;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Aluno
 */
public class CellRenderer extends DefaultTableCellRenderer{
    JLabel jLabelLogo = new JLabel();
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row,
int column){
            
            if(isSelected){
            this.setBackground(table.getBackground());
            this.setForeground(table.getForeground());
            
            }else{
            this.setBackground(table.getBackground());
            this.setForeground(table.getForeground());
            }
            ImageIcon logo = new ImageIcon(table.getValueAt(row, column -1).toString());
            jLabelLogo.setText("");
            logo.setImage(logo.getImage().getScaledInstance(table.getRowHeight(), table.getRowHeight(), 1));
            jLabelLogo.setIcon(logo);
            jLabelLogo.setHorizontalAlignment(CENTER);
            return jLabelLogo;
        
        }
}