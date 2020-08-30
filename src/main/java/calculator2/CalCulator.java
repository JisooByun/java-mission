package calculator2;

public class CalCulator {

    private final String[] list;

    public CalCulator(String str){
        String[] list = str.split(" ");
        this.list = list;
    }
    public int calculate(){
        for (int i=2;i<list.length;i+=2) {
            list[i] = operate(list[i-2],list[i],list[i-1]);
        }
        return Integer.parseInt(list[list.length-1]);
    }


    private String operate(String num1,String num2,String oper){
        int num11 = Integer.parseInt(num1);
        int num22 = Integer.parseInt(num2);
        int result = 0;
        switch (oper) {
            case "+": result = num11 + num22;
                break;
            case "-": result = num11 - num22;
                break;
            case "*": result = num11 * num22;
                break;
            case "/": result = num11 / num22;
                break;
        }
        return Integer.toString(result);
    }
}
