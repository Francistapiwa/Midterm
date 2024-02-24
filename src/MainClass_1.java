package midterm;

import javax.swing.*;
import java.awt.*;

public class MainClass {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Patient Form");
                JPanel bottomPanel = new JPanel(new CardLayout());

                // Create an instance of MainClass
                MainClass mainInstance = new MainClass();

                // Call the non-static method to create a PatientForm instance
                PatientForm patientForm = mainInstance.createPatientForm(bottomPanel);

                frame.getContentPane().add(patientForm);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    // Non-static method to create a PatientForm instance
    private PatientForm createPatientForm(JPanel bottomPanel) {
        return new PatientForm(bottomPanel);
    }
}
