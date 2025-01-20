package calculator.v1;

public class Calculator {
    private int firstNum;
    private int secondNum;
    private String operator;
    private int result;

    public Calculator() {
    }
    public void setResult(int result) {
        this.result = result;
    }
    public void setFirstNum(int firstNum){
        this.firstNum = firstNum;
    }
    public void setSecondNum(int secondNum){
        this.secondNum = secondNum;
    }
    public void setOperator(String operator){
        this.operator = operator;
    }

    public int getFirstNum(){
        return this.firstNum;
    }
    public int getSecondNum(){
        return this.secondNum;
    }
    public String getOperator(){
        return this.operator;
    }
    public int getResult(){
        return this.result;
    }
}