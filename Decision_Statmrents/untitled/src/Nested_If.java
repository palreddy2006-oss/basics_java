public class Nested_If {
    public static void main(String[] args){
        String user = "cricket";
        String Player = "virat";

        if(user == "football")
        {
            if(Player == "messi"){
                System.out.println("messi is great football player");
            }
            System.out.println(" & user is football player");
        }else {
            if(Player == "virat"){
                System.out.println("virat is great cricket player");
            }
            System.out.println(" & user iS cricket player");
        }
    }
}
