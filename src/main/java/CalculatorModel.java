
/**
 * Model does 3 things:
 * 1) Contains data ***calculationValue***
 * It could contain Service->DAO->DataBase
 * 2) Provides access to data ***getCalculationValue()***
 * 3) Performs some business logic methods, that is needed ***addTwoNumbers(int firstNumber, int secondNumber)***
 * */

public class CalculatorModel {
    private int calculationValue;

    public void addTwoNumbers(int firstNumber, int secondNumber){
        calculationValue=firstNumber+secondNumber;

    }

    public int getCalculationValue(){
        return calculationValue;
    }
}
