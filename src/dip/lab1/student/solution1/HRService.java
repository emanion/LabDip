package dip.lab1.student.solution1;

import javax.swing.JOptionPane;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @author your name goes here
 */
public class HRService {

    public double getAnnualCompensationForEmployee(Employee e)
    {
        double annualCompensation;

        // One example of using fragile if logic to determine employee type.
        // If only we could use polymorphism instead!
        annualCompensation = e.getAnnualWages();
        return annualCompensation;
    }


}
