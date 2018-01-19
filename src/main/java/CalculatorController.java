import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** Controller coordinates between the View and Model.
 * It does:
 * 1) Takes request (parameters) from View (that Client send).
 * 2) Send request (parameters) to Model (Business logic).
 * 3) Takes results of Model.
 * 4) Refresh view with results of p.3.
 * */

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
