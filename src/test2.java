import java.util.*;
import java.io.*;

public class test2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cownum[] = new int[11];
		Arrays.fill(cownum, -1);
		
		int crossingcount[] = new int[11];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cow = Integer.parseInt(st.nextToken());
			int position = Integer.parseInt(st.nextToken());
			if(cownum[cow]!=-1 && cownum[cow] != position) {
				crossingcount[cow]++;
			}
			cownum[cow] = position;
		}
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += crossingcount[i];
		}
		System.out.println(sum);
	}
}
