/*
      Name:           Mandeep Singh
	  Student Number: A00214509
	  Couse:          App Development for Android JAV1001 - 11329 
*/
// Adding swing and awt package
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Converter{
	public static void main(String[] args)
    {
		// Creating the Frame
		JFrame frame;
        frame=new JFrame("first way");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Creating the button 
        JButton button = new JButton("CONVERT");
        button.setBounds(250, 250, 90, 40);
        frame.add(button);
	    button.doClick();
		// Creating Label  that display title "Converter"
		JLabel label = new JLabel("COVERTER");
		label.setFont(new Font("Serif", Font.BOLD,30));
		label.setBounds(210, 50,300,35);
		frame.add(label); 
		//Creating ComboBox to select a item that want to execute
		String name[] = {"KM to Mi","Mi to KM","cm to in","in to cm","kg to lb","lb to kg","g to oz","oz to g","C to F","C to K","F to C","F to K","L to cups","cup to L"};
		JComboBox jc = new JComboBox(name);
		jc.setBounds(350, 100,90,20);
		frame.add(jc);
		// Creating the label1 
		JLabel label1 = new JLabel("Please select a unit:");
		label1.setBounds(150, 100,300,20);
		frame.add(label1); 
		label1.setFont(new Font("Serif", Font.BOLD,20));
        // Creating the Label2
		JLabel label2 = new JLabel("Please enter a value:");
		label2.setBounds(150, 150,350,20);
		frame.add(label2);
		label2.setFont(new Font("Serif", Font.BOLD,20));
		//Creating the textfield to get input from user   
		JTextField text1 = new JTextField();
		text1.setBounds(350, 150,90,20);
		frame.add(text1);
        //Creating label3 to display the Answer
		JLabel label3 = new JLabel();
		label3.setBounds(250,200,350,20);
		frame.add(label3);
		label3.setFont(new Font("Serif", Font.BOLD,20));		
        
		frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
	    //To put button in action
		button.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			//Using if else statement to calculate the Answer
			// Converting Kilometer to Miles
			if (jc.getSelectedItem().equals("KM to Mi")){
			   double mile1 = Double.parseDouble(text1.getText());
		       double mile = mile1 * 0.62;
			   label3.setText(mile + " miles");
			}
			//Converting Miles to Kilometer
			else if(jc.getSelectedItem().equals("Mi to KM")){
				double km1 = Double.parseDouble(text1.getText());
			    double km = km1 / 0.62;
                label3.setText(km + " kms"); 
		    }
			//converting Centimeter to Inches
		    else if(jc.getSelectedItem().equals("cm to in")){
			    double inch1 = Double.parseDouble(text1.getText());
			    double inch = inch1 / 2.54;
                label3.setText(inch + " inchs"); 
		    }
			//Converting Inches to Centimeter
		    else if(jc.getSelectedItem().equals("in to cm")){
		    	double cm1 = Double.parseDouble(text1.getText());
			    double cm = cm1 * 2.54;
                label3.setText(cm + " cm"); 
		    }
			//Converting Kilogram to Pound
		    else if(jc.getSelectedItem().equals("kg to lb")){
			    double lb1 = Double.parseDouble(text1.getText());
			    double lb = lb1 * 2.2;
                label3.setText(lb + " lb"); 
		    }
			//convering Pound to Kilogram
		    else if(jc.getSelectedItem().equals("lb to kg")){
			    double kg1 = Double.parseDouble(text1.getText());
			    double kg = kg1 * 0.45;
                label3.setText(kg + " kg"); 
		    }
			//Converting Gram to Ounce
		    else if(jc.getSelectedItem().equals("g to oz")){
			    double oz1 = Double.parseDouble(text1.getText());
			    double oz = oz1 * 0.04;
	            label3.setText(oz + " oz"); 
		    }
			//Converting Ounce to Gram
		    else if(jc.getSelectedItem().equals("oz to g")){
			    double g1 = Double.parseDouble(text1.getText());
			    double g = g1 * 28.35;
                label3.setText(g + " g"); 
		    }
			//Converting Celsius to Fahrenheit
		    else if(jc.getSelectedItem().equals("C to F")){
			    double f1 = Double.parseDouble(text1.getText());
			    double f = (f1 + 9/5) +32;
                label3.setText(f + " F"); 
		    }
			//Covertig Fahrenheit to Celsius
		     else if(jc.getSelectedItem().equals("F to C")){
			    double c1 = Double.parseDouble(text1.getText());
			    double c = (c1 -32) * 5/9;
                label3.setText(c + " C"); 
		    }
			//Converting Celsius to Kelvin
		    else if(jc.getSelectedItem().equals("C to K")){
			    double k1 = Double.parseDouble(text1.getText());
			    double k = k1 + 273.15;
                label3.setText(k + " k"); 
		    }
			//Converting Fahrenheit to Kelvin
		    else if(jc.getSelectedItem().equals("F to K")){
			    double k1 = Double.parseDouble(text1.getText());
			    double k = (k1 - 32) * 5/9 + 273.15;
                label3.setText(k + " k"); 
		    }
			//Converting Liter ro cup
		    else if(jc.getSelectedItem().equals("L to cups")){
			    double cups1 = Double.parseDouble(text1.getText());
			    double cups = cups1 * 4.17;
                label3.setText(cups + " cups"); 
		    }
			//Converting Cup to Liter
		    else if(jc.getSelectedItem().equals("cup to L")){
			    double l1 = Double.parseDouble(text1.getText());
			    double l = l1 * 0.24;
                label3.setText(l + " L"); 
		    }
		}
	});
	}
}