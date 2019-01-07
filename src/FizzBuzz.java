import java.util.Arrays;

public class FizzBuzz {
    public void execute(){

    }

    public String processNumber(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if(i % 5 == 0) {
            return "Buzz";
        } else
            return String.valueOf(i);
    }

    public String[] printNums50() {
        String[] arr = new String[50];
        arr[0] = "0";
        for(int i = 1; i < 50; i++) {
            arr[i] = processNumber(i);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
