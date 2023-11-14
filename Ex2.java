import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String missatge = "&###@&*&###@@##@##&######@@#####@#@#@#@##@@@@@@@@@@@@@@@*&&@@@@@@@@@####@@@@@@@@@#########&#&##@@##@@##@@##@@##@@##@@##@@##@@##@@##@@##@@##@@##@@##@@##@@&";
        int total=0;

        for (int i = 0; i < missatge.length(); i++) {
            if (missatge.charAt(i) == '#'){
                total++;
            }else if(missatge.charAt(i) == '@'){
                total--;
            }else if(missatge.charAt(i) == '*'){
                total = total * total;
            }else{
                System.out.print(total);
            }
        }

    }
}