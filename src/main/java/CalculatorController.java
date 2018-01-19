import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel){
        this.theModel = theModel;
        this.theView = theView;
        this.theView.addCalculationListener(new CalculateListener());

    }

    class CalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber  = 0;
            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getsecondNumber();
                theModel.addTwoNumbers(firstNumber,secondNumber);
                theView.setCalcSolution(theModel.getCalculationValue());
            } catch (NumberFormatException ex){
                theView.displayErrorMessage("Not Numbers");
            }
        }
    }


}
