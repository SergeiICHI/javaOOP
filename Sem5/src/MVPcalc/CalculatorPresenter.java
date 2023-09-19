package MVPcalc;
public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void onAddButtonClicked() {
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();

        model.add(number1, number2);
        double result = model.getResult();

        view.displayResult(result);
    }

    public void onMultiButtonClicked(){
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();

        model.multi(number1,number2);
        double result = model.getResult();

        view.displayResult(result);

    }
    public void onSubtractButtonClicked(){
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();

        model.subtract(number1,number2);
        double result = model.getResult();

        view.displayResult(result);


    }

    public void onDivideButtonClicked(){
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();

        model.divide(number1,number2);
        double result = model.getResult();

        view.displayResult(result);
    }






}
