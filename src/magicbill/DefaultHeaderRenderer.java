/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicbill;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Vishwa
 */
public class DefaultHeaderRenderer extends JLabel implements TableCellRenderer {

    public DefaultHeaderRenderer(JTable jTable1) {
        setFont(new Font("Times New Roman", Font.BOLD, 20));
        setForeground(Color.white);
        setOpaque(true);
        setPreferredSize(new Dimension(jTable1.getPreferredSize().width, 30));
        float[] hsb = new float[3];
        Color.RGBtoHSB(26, 132, 172, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
        setHorizontalAlignment(CENTER);
        setAlignmentX(CENTER_ALIGNMENT);
        setAlignmentY(CENTER_ALIGNMENT);
//        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        setText(value.toString());
        if (!isSelected) {
            return this;
        }
        return null;
    }
}
