import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        String S=sc.next();
        int[] arr=new int[26];
        for(int i=0;i<S.length();i++){
            arr[S.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            System.out.print(arr[i]+" ");
        }
	}
}