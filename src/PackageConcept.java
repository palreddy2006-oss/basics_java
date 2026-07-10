public class PackageConcept {
    public static void main(String[] args){
        System.out.println("hi abhi");
        Hello();//The main method is now trying to call (trigger) your helper method named Hello
    }
    public static void Hello(){
        //Because you put (String[] args) inside the parentheses, you told Java: "To use the Hello method, you must hand it a list of text data (strings)."
        System.out.print("hello");
    }
}
