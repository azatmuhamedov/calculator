
import java.util.Scanner;



class Main {
    final static String allowedOps = "+-/*";

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���������:");
        String input = scanner.nextLine();
        System.out.println(calc(input));

    }
    public static String calc(String input) throws Exception {
        String[] operands = input.trim().split(" ");

        if (operands.length != 3) throw new Exception("������ ���� 3 ������� ����������� ��������");

        int a = Integer.parseInt(operands[0]);
        int b = Integer.parseInt(operands[2]);
        String operator = operands[1];

        if (a>10 || b>10 || a<1 || b<1){
            throw new Exception("����� ������ ���� �� 1 �� 10");
        }

        if (allowedOps.indexOf(operator) == -1) throw new Exception("������ �� �������� �������������� ���������");

        int result = -100;

        switch (operator) {
            case ("+"):
                result = a + b;
                break;
            case ("-"):
                result = a - b;
                break;
            case ("/"):
                result = a / b;
                break;
            case ("*"):
                result = a * b;
                break;
        }

        return String.valueOf(result);
    }}

