public class Ternary_Operator {
    public static void main(String[] args){
        int A = 11;
        int B = 12;
        int C = 13;
        int D = 14;
        int E = 15;
        //Maximum of two numbers
        /*int r = (A>B) ? A : B;
        System.out.println(r);*/

        //Maximum of three numbers
       /* int r = (A>B) ? A : B;
        int s = (r>C) ? r : C;
        System.out.println(s);*/

        //Maximum of four numbers
        /*int r = (A>B) ? A : B;
        int s = (C>D) ? C : D;

        int Result = (r > s) ? r : s;
        System.out.println(Result);*/
        /*int result2 = A > B ? (((A > C) ? ((A > D)? A : D) : ((C > D) ? C : D))) : (((B > C)? ((B > D)? B : D):(( C> D? C : D))));
        System.out.println(result2);*/

        //Maximum of 5 numbers
        /*int X = A > B ? A : B;
        int Y = C > D ? C : D;
        int Z = X > Y ? X : Y;
        int Result = Z > E ? Z : E;
        System.out.println(Result);*/

        int result2 =A > B ? (A>C?(A>D?(A>E ?A:E):(D>E?D:E)):(C>D?(C>E?C:E):(D>E?D:E))) : (B>C?((B>D?(B>E?B:E):(D>E?D:E))):(C>D?(C>E?C:E):(D>E?D:E)));
        System.out.println(result2);

    }
}
