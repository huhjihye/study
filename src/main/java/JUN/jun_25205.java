package JUN;

import java.util.Arrays;
import java.util.Scanner;
public class jun_25205 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt(); //문자열 길이
            String str=sc.next(); //문자 받기
            String li=str.substring(n-1); // 맨 끝에 문자 자르기
            System.out.println("짤린 문자열은? " + li);

            String arr[]={"r","s","e","f","a","q","t","d","w","c","z","x","v","g"};
            String stringToSearch= li;
            if(Arrays.asList(arr).contains(stringToSearch)){
                System.out.println(1);
            }else{
                System.out.println(0);
            }

            /*for(int i=0; i<arr.length;i++){
                if(li.equals(arr[i])){
                    System.out.println(1);

                }else{
                    System.out.println(0);

                }
                break;
            }*/
            /*if(li.equalsIgnoreCase(arr)){
                System.out.println(1);
            }else{
                System.out.println(0);
            }

*/

            /*if(li.equals("r")){
                System.out.println(1);
            }else if(li.equals("s")){
                System.out.println(1);
            }else if(li.equals("e")){
                System.out.println(1);
            }else if(li.equals("f")){
                System.out.println(1);
            }else if(li.equals("a")){
                System.out.println(1);
            }else if(li.equals("q")){
                System.out.println(1);
            }else if(li.equals("t")){
                System.out.println(1);
            }else if(li.equals("d")){
                System.out.println(1);
            }else if(li.equals("w")){
                System.out.println(1);
            }else if(li.equals("c")){
                System.out.println(1);
            }else if(li.equals("z")){
                System.out.println(1);
            }else if(li.equals("x")){
                System.out.println(1);
            }else if(li.equals("y")){
                System.out.println(1);
            }else if(li.equals("g")){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
*/
        }
    }


