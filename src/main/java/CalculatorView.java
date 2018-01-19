import javax.swing.*;
import java.awt.event.ActionListener;

/**View is the separated Interface of the program.
 * View does 2 things:
 * 1) Display menu for client.
 * 2) Take income request from client.
 */

public class CalculatorView extends JFrame {
    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLable = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);

    CalculatorView() {
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        calcPanel.add(firstNumber);
        calcPanel.add(additionLable);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
        this.add(calcPanel);

    }

    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }

    public int getsecondNumber(){
        return Integer.parseInt(secondNumber.getText());
    }

    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }

    public void addCalculationListener(ActionListener listeForCalButton){
        calculateButton.addActionListener(listeForCalButton);
    }

    public void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}
