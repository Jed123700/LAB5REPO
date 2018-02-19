import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            System.out.println("Enter a hexadecimal number:");
            String input = scnr.next();

            int len = input.length();
            int last = len-1;
            input.toUpperCase();
            long data[] = new long [8];
            char second = input.charAt(1);

            if (input.startsWith("0x"))
            {
            //System(input.length(2,len));
                input = input.substring(2,len);
                len = input.length();
                last = len-1;
            };
            int i = 0;
            while(i<len) {
                switch (input.charAt(i)) {
                    case ('A'):
                        data[i] = 10;
                        break;
                    case ('B'):
                        data[i] = 11;
                        break;
                    case ('C'):
                        data[i] = 12;
                        break;
                    case ('D'):
                        data[i] = 13;
                        break;
                    case ('E'):
                        data[i] = 14;
                        break;
                    case ('F'):
                        data[i] = 15;
                        break;
                    default:
                        char temp = input.charAt(i);
                        data[i] = Character.getNumericValue(temp);
                }
//                System.out.println(data[i]);
                i++;
            }
            long sum = 0;

            int j = 0;
            while(last>=0){
               long x = data[last];
               double mult = Math.pow(16,j);
               double temp = x*mult;
               sum += (long)temp;
//               System.out.println(data[j]);
//               System.out.println(temp);
//               System.out.println(mult);
               last--;
               j++;
            }
        System.out.println("Your number is "+ sum + " in decimal");

        }}


