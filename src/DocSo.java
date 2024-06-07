import java.util.Scanner;

public class DocSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so  can doc");
        int so = sc.nextInt();

        String result = readMunber(so);
        System.out.println(result);

    }
    public static String readMunber(int so){
        if(so < 0 || so >= 1000){
            return "Out of ability";
        }else if (so < 10){
            return readSingleDigit(so);
        }else if (so < 20){
            return readTeens(so);
        }else if (so < 100){
            return readTens(so);
        }else {
            return readHundreds(so);
        }
    }
    public static String readSingleDigit(int so){
        switch (so){
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }
    public static String readTeens(int so){
        switch (so){
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }
    public static String readTens(int so){
        int tens = so/10;
        int ones = so%10;

        String tenssStr = "";
        switch (tens){
            case 2: tenssStr = "twenty"; break;
            case 3: tenssStr = "thirty"; break;
            case 4: tenssStr = "fourty"; break;
            case 5: tenssStr = "fifty"; break;
            case 6: tenssStr = "sixty"; break;
            case 7: tenssStr = "seventy"; break;
            case 8: tenssStr = "eighty"; break;
            case 9: tenssStr = "ninety"; break;
        }
        if (ones == 0){
            return tenssStr;
        }else {
            return tenssStr + " " + readSingleDigit(ones);
        }
    }
    public static String readHundreds(int so){
        int hundreds = so/100;
        int remainder = so%100;

        String hundredssStr = readSingleDigit(hundreds) + " hundred";

        if (remainder == 0){
            return hundredssStr;
        }else if (remainder < 10){
            return hundredssStr + " and " + readSingleDigit(remainder);
        }else if (remainder < 20){
            return hundredssStr + " and " + readTeens(remainder);
        }else {
            return hundredssStr + " and " + readTens(remainder);
        }
    }
}
