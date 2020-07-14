import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        String str1 = "";
        String str2 = "My name is Earl";
        String str3 = "I love Java";
      
        int u =0;

        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str2);
        earlBio.add(str3);

        System.out.println(earlBio);

    }
}
