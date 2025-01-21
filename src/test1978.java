import java.util.*;
import java.io.*;

public class test1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			for(int j=2; j<=10; j++) {
				if(j==num) {
					continue;
				}
				else if(((num % j) == 0) || num == 1 || num ==2) {
					break;
				} 
				else if(j==10 ) {
					count ++;
					System.out.println(num);
				}
				
			}
		}
		System.out.print(count);
	}		
}

