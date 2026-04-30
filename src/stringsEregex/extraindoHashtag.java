package stringsEregex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.ArrayList;
public class extraindoHashtag {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um testo com #: ");
        String texto = sc.nextLine();
        Pattern pattern = Pattern.compile("#\\w+");
        Matcher matcher = pattern.matcher(texto);

        ArrayList<String> hashtags = new ArrayList<>();
        while(matcher.find()){
            hashtags.add(matcher.group());
        }
        if(hashtags.isEmpty()){
            System.out.println("Seu texto não possui #.");
        }else{
            System.out.println("# encontradas: "+String.join(", ",hashtags));
        }
        sc.close();
    }
}
