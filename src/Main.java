import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int a=in.nextInt(), b=in.nextInt(), c=in.nextInt(), n = in.nextInt();
//        int count=0;
//        String str= "";
//        for (int i = 0;i*a <= n;i++) {
//            for (int j = 0;j*b <= n;j++) {
//                for (int k = 0;k*c <= n;k++) {
//                    if (i*a + j*b + k*c == n) {
//                        count++;
//                        str += (String) (i+" "+j+" "+k);
//                        str+="\n";
//                    }
//                }
//            }
//        }
//
//        System.out.print(count+"\n"+str);
        String[] str= in.nextLine().split(" ");
        int max=0, count=0;
        for (int i = 0;i< str.length;i++) {
            if (Integer.parseInt(str[i]) > max) max = Integer.parseInt(str[i]);
        }
        for (int i = 0;i<str.length;i++) {
            if (Integer.parseInt(str[i]) == max) count++;
        }
        System.out.println(count);



    }
}