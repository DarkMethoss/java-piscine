public class DoOp {
    public static String operate(String[] args) {
        if (args == null || args.length != 3) {
            return "Error";
        }

        int operand1 = Integer.parseInt(args[0]);
        String operation = args[1];
        int operand2 = Integer.parseInt(args[2]);

        switch (operation) {
            case "+":
                return (operand1 + operand2) + "";
            case "-":
                return (operand1 - operand2) + "";
            case "*":
                return (operand1 * operand2) + "";
            case "/":
                if (operand2 == 0) {
                    return "Error";
                }
                return (operand1 / operand2) + "";
            case "%":
                if (operand2 == 0) {
                    return "Error";
                }
                return (operand1 % operand2) + "";
            default:
                return "Error";
        }

    }
}