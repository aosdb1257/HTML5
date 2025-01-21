import java.util.*;
import java.io.*;

public class test2581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int min = 101;
		int sum = 0;
		for(int i=n; i<=m; i++) {
			if(check(n)) {
				System.out.println(n);
				sum += n;
				if(n<min) min = n;
			}
		}
		System.out.println(sum);
		System.out.println(min);
		
	}
	public static boolean check(int num) {
		if(num % 2 == 0) return false;
		for(int i=2; i*i<=num; i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
}
