public class Calculator {
    public static void main(String[] args) {
        int num1, num2, result = 0;
        if (args.length != 3) {
            System.out
                .println("Please use java Exercise13_1 operand1 operator operand2");
            System.exit(0);
        }
        try {
            num1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong Input: " + args[0]);
            return;
        }
        try {
            num2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong Input: " + args[2]);
            return;
        }
        switch (args[1].charAt(0)) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Your operator " + args[1] + " is not supported.");
                System.exit(0);
                break;
        }
        System.out.println(num1 + " " + args[1] + " " + num2 + " = " + result);
    }
}
