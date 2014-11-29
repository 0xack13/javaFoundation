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
  JTextField tempCelsius, tempFahrenheit;
  JLabel celsiusLabel, fahrenheitLabel;
  JButton convertTempC2F, convertTempF2C, convertTempClear;

  // Constructor
  public ConvertUI() {
    // Create the frame and container.
    converterFrame = new JFrame("Convert Celsius to Fahrenheit");
    
    converterFrame.setSize(400, 200);
    
    converterPanel1 = new JPanel();
    converterPanel1.setLayout(new BorderLayout());
    converterPanel2 = new JPanel();
    converterPanel2.setLayout(new BorderLayout());
    converterPanel3 = new JPanel();
    converterPanel3.setLayout(new BorderLayout());
    
    // Add the panel to the frame.
    converterFrame.getContentPane()
        .add(converterPanel1, BorderLayout.NORTH);
    converterFrame.getContentPane()
        .add(converterPanel2, BorderLayout.CENTER);
    converterFrame.getContentPane()
        .add(converterPanel3, BorderLayout.SOUTH);
    
    // Add the widgets.
    addWidgets();

    

    // Exit when the window is closed.
    converterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Show the converter.
    converterFrame.pack();
    converterFrame.setVisible(true);
  }

  // Create and add the widgets for converter.
  private void addWidgets() {
    tempCelsius = new JTextField(30);
    tempFahrenheit = new JTextField(30);
    
    celsiusLabel = new JLabel("Celsius", SwingConstants.LEFT);
    fahrenheitLabel = new JLabel("Fahrenheit", SwingConstants.LEFT);
    
    convertTempC2F = new JButton("To Fahrenheit");
    convertTempClear = new JButton("Clear");
    convertTempF2C = new JButton("To Celcius");

    celsiusLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    fahrenheitLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

    // Listen to events from Convert button.
    convertTempClear.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            tempCelsius.setText("");
            tempFahrenheit.setText("");
        }
    });
    
    convertTempC2F.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            //(9.0/5.0)*celsius + 32;
            Double c2f = (9.0/5.0) * ((Double.parseDouble(tempCelsius.getText()))) + 32;
            tempFahrenheit.setText(c2f.toString());
        }
    });
    
    convertTempF2C.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Double f2c = (5.0/9.0)*(((Double.parseDouble(tempFahrenheit.getText()))) - 32);
            tempCelsius.setText(f2c.toString());
        }
    });

    // Add widgets to container.
    converterPanel1.add(celsiusLabel, BorderLayout.CENTER);
    converterPanel1.add(tempCelsius, BorderLayout.EAST);
    
    converterPanel2.add(tempFahrenheit, BorderLayout.EAST);
    converterPanel2.add(fahrenheitLabel, BorderLayout.CENTER);
    
    converterPanel3.add(convertTempF2C, BorderLayout.NORTH);
    converterPanel3.add(convertTempC2F, BorderLayout.CENTER);
    converterPanel3.add(convertTempClear, BorderLayout.SOUTH);
  }
  
  public void clearText() {
      tempCelsius.setText("");
      tempFahrenheit.setText("");
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