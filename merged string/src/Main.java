//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String word1="abc";
        String world2="pqrs";
        System.out.println(mergeAlternately(word1,world2));

    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i=0;
        int j=0;

        while(i<word1.length()&&j<word2.length()){
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(j));
            i++;
            j++;
        }

        if(i<word1.length()){
            merged.append(word1.substring(i));
        }
        if(i<word2.length()){
            merged.append(word2.substring(j));
        }
        return merged.toString();
    }
}
