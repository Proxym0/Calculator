import java.util.Scanner;

public class Calculator implements MethodCall {
    Scanner scanner = new Scanner(System.in);
    String c;
    double a, b, add, multiplication, subtraction, division;

    @Override
    public void messageMethods() {
        System.out.println("Select operation type: add, multiplication, subtraction, division " +
                "\nEnter numbers to perform the operation");
    }
        @Override
    public void choiceMethod() {
            c = scanner.nextLine();
            a = scanner.nextDouble();
            b = scanner.nextDouble();
        if (c.equalsIgnoreCase("add")) {
            add = a + b;
        } else if(c.equalsIgnoreCase("division")){
            division = a / b;
        }else if(c.equalsIgnoreCase("subtraction")){
            subtraction = a - b;
        }else if(c.equalsIgnoreCase("multiplication")){
            multiplication = a * b;
        }
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "add=" + add +
                ", multiplication=" + multiplication +
                ", subtraction=" + subtraction +
                ", division=" + division +
                '}';
    }
}


