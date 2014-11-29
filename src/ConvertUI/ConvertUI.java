/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConvertUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

// This example demonstrates the use of JButton, JTextField and JLabel.
public class ConvertUI implements ActionListener {
  JFrame converterFrame;

  JPanel converterPanel1, converterPanel2, converterPanel3;

  JTextField tempCelsius;

  JLabel celsiusLabel, fahrenheitLabel;

  JButton convertTempC2F, convertTempF2C, convertTempClear;

  // Constructor
  public ConvertUI() {
    // Create the frame and container.
    converterFrame = new JFrame("Convert Celsius to Fahrenheit");
    converterPanel1 = new JPanel();
    converterPanel1.setLayout(new BorderLayout());
    
    converterPanel2 = new JPanel();
    converterPanel2.setLayout(new BorderLayout());
    
    converterPanel3 = new JPanel();
    converterPanel3.setLayout(new BorderLayout());

    // Add the widgets.
    addWidgets();

    // Add the panel to the frame.
    converterFrame.getContentPane()
        .add(converterPanel1, BorderLayout.NORTH);
    converterFrame.getContentPane()
        .add(converterPanel2, BorderLayout.CENTER);
    converterFrame.getContentPane()
        .add(converterPanel3, BorderLayout.SOUTH);

    // Exit when the window is closed.
    converterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Show the converter.
    converterFrame.pack();
    converterFrame.setVisible(true);
  }

  // Create and add the widgets for converter.
  private void addWidgets() {
    // Create widgets.

    ImageIcon icon = new ImageIcon("images/convert.gif",
        "Convert temperature");
    tempCelsius = new JTextField(2);
    celsiusLabel = new JLabel("Celsius", SwingConstants.LEFT);
    convertTempC2F = new JButton(icon);
    fahrenheitLabel = new JLabel("Fahrenheit", SwingConstants.LEFT);

    celsiusLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    fahrenheitLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

    // Listen to events from Convert button.
    convertTempC2F.addActionListener(this);

    // Add widgets to container.
    converterPanel.add(tempCelsius);
    converterPanel.add(celsiusLabel);
    converterPanel.add(convertTempC2F);
    converterPanel.add(fahrenheitLabel);
  }

  // Implementation of ActionListener interface.
  public void actionPerformed(ActionEvent event) {
    // Parse degrees Celsius as a double and convert to Fahrenheit.
    int tempFahr = (int) ((Double.parseDouble(tempCelsius.getText())) * 1.8 + 32);

    // Set fahrenheitLabel to new value and set font color based on the
    // temperature.
    if (tempFahr <= 32) {
      fahrenheitLabel
          .setText("<html><Font Color=blue>"
              + tempFahr
              + "&#176 </Font><Font Color=black> Fahrenheit</font></html>");
    } else if (tempFahr <= 80) {
      fahrenheitLabel
          .setText("<html><Font Color=green>"
              + tempFahr
              + "&#176 </Font><Font Color=black> Fahrenheit </Font></html>");
    } else {
      fahrenheitLabel
          .setText("<html><Font Color=red>"
              + tempFahr
              + "&#176 </Font><Font Color=black> Fahrenheit</Font></html>");
    }
  }

  // main method
  public static void main(String[] args) {
    // set the look and feel
    try {
      UIManager.setLookAndFeel(UIManager
          .getCrossPlatformLookAndFeelClassName());
    } catch (Exception e) {
    }

    ConvertUI converter = new ConvertUI();

  }
}