package calculator.v1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자 : ");
        int firstNum = scanner.nextInt(); // 5
        System.out.println("두번째 숫자 : ");
        int secondNum = scanner.nextInt(); // 3
        System.out.println("연산자 : ");
        String operator = scanner.next();

        Calculator calculator = new Calculator();
        calculator.setFirstNum(firstNum); // 5
        calculator.setSecondNum(secondNum);// 3
        calculator.setOperator(operator); // +

        System.out.println("첫 번째 숫자 :" + calculator.getFirstNum());
        System.out.println("두번째 숫자 : " + calculator.getSecondNum());
        System.out.println("연산자 : " + calculator.getOperator());
        //operator = 사용자가 입력한 값
        // calculator.getOperator() : calculator의 값
        String calculatorOperator = calculator.getOperator();

        if (calculatorOperator.equals("+")){
            calculator.setResult(calculator.getFirstNum() + calculator.getSecondNum());
        } else if (calculatorOperator.equals("-")) {
            calculator.setResult(calculator.getFirstNum() - calculator.getSecondNum());
        } else if (calculatorOperator.equals("*")) {
            calculator.setResult(calculator.getFirstNum() * calculator.getSecondNum());
        } else if (calculatorOperator.equals("/")) {
            if (secondNum == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return;
            } else {
                calculator.setResult(calculator.getFirstNum() / calculator.getSecondNum());
            }
        }
        firstNum = 10;
        secondNum = 5;
        System.out.println(calculator.getFirstNum() + "+" + calculator.getSecondNum() + " = " + calculator.getResult());
        //결과 : 1 + 2 = 3

    }
}
