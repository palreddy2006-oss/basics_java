import java.lang.reflect.Array;
import java.util.Scanner;

public class Vowels_Consonents {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);

        /*char[] vowels = new char[10];
        //{'a','e','i','o','u','A','E','I','O','U'};
        vowels[0]= 'a';
        vowels[2]= 'e';
        vowels[3]= 'i';
        vowels[4]= 'o';
        vowels[5]= 'u';
        vowels[6]= 'A';
        vowels[7]= 'E';
        vowels[8]= 'I';
        vowels[9]= 'O';
        vowels[10]= 'U';

        if (vowels[10] == Letter){
            System.out.println("letter is vowels");
        }else{
            System.out.println("letter is consonent");
        }*/
        if((letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')) {

            System.out.println(letter + " is a vowel");}
        else{
            System.out.println("letter is consonent");
            }

}
    }