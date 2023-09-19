package calt;


import java.util.Scanner;

public class main  extends CalculatorModel{
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        view.printResult(model.multiply(-3,65));

        CalculatorController controller = new CalculatorController(model,view);

        Scanner in = new Scanner(System.in);
        System.out.print("введите первое число: ");
        double numb1 = in.nextDouble();
        System.out.print("второе число первое число: ");
        double numb2 = in.nextDouble();
        System.out.print("введите знак операции: ");
        char X = in.next().charAt(0);


        controller.calculate(numb1,numb2,X);
        in.close();



    }
}
