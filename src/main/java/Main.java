import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        String str1 = "Hello World";
        String str2 = "My name is Earl";
        String str3 = "I love Java";

        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str2);
        earlBio.add(str3);

        System.out.println(earlBio);

    }
}
