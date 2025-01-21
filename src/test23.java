import java.util.*;
import java.io.*;

public class test23 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st2.nextToken()); 
		}
		for(int i=0; i<m; i++) {
			StringTokenizer st3 = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st3.nextToken());
			int b = Integer.parseInt(st3.nextToken());
			int c = Integer.parseInt(st3.nextToken());
			if (a==1) {
				arr[b-1] = c; 
			} else if (a==2) {
				for(int j=b-1; j<c; j++) {
					if(arr[j]==1) arr[j]=0;
					else if(arr[j]==0) arr[j]=1;
				}
			} else if (a==3) {
				for(int j=b-1; j<c; j++) {
					arr[j] = 0;
				}
			} else {
				for(int j=b-1; j<c; j++) {
					arr[j] = 1;
				}
			}
		}
		for(int a: arr) {
			System.out.print(a+" ");
		}
	}
}
