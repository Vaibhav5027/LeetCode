

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "the sky is blue    ";

            String[] s1=s.trim().split(" ");
            StringBuilder s2=new StringBuilder();
            for(int i=s1.length-1; i>=0; i--){
                s2.append(s1[i]);
                if(i>0){
                    s2.append(" ");
                }
            }

        System.out.println(s2);
        }
    }
