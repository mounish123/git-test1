import java.util.*;
public class Main{
    public static void main(String[] args) {
        System.out.println("enter the input string:");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int n = a.length();
        int z = ((int) a.charAt(0));
        System.out.println(z);
        /*String ans;
        for(int i = 0; i<n; i++){
            if(i == 0){
                if(65 <= ((int) a.charAt(i)) <= 91){
                    ans.append(a.charAt(i))
                };
                else{
                    ans.append((a.charAt(i)).toUpperCase());
                };
            };
            else{
                if(((int) a.charAt(i)) == 32 ){
                    continue;
                };
                elseif(65 <= ((int) a.charAt(i)) <= 91 || 97<=((int) a.charAt(i))<=122){
                    if(((int) a.charAt(i-1)) == 32){
                        ans.append(a.charAt(i).toUpperCase());
                    };
                    else{
                        ans.append(a.charAt(i).toLowerCase());
                    };
                };
            };

            };
            System.out.println(ans);*/
        }


        //scanner.close();

    }
