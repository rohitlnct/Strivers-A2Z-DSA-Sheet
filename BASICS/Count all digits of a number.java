import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		int temp = Math.abs(num);
		while(temp>0){
		    count++;
		    temp = temp/10;
		}
		System.out.println(count);
	}
}
