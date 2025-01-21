
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {
            String line = br.readLine();
            Map<Character, Integer> frequency = new HashMap<>(); // 문자 빈도 저장

            for(char c : line.toCharArray()) {
                if(c != ' ') { // 공백은 제외
                    frequency.put(c, frequency.getOrDefault(c, 0) + 1);
                }
            }

            int maxFreq = 0;
            char mostFrequentChar = '?';
            boolean isAmbiguous = false;

            for(Map.Entry<Character, Integer> entry : frequency.entrySet()) {
                char currentChar = entry.getKey();
                int currentFreq = entry.getValue();

                if(currentFreq > maxFreq) {
                    maxFreq = currentFreq;
                    mostFrequentChar = currentChar;
                    isAmbiguous = false; // 새로운 최대 빈도가 발견되면 모호성 해제
                } else if(currentFreq == maxFreq) {
                    isAmbiguous = true; // 동일한 최대 빈도 발견
                }
            }

            if(isAmbiguous) {
                sb.append('?').append('\n');
            } else {
                sb.append(mostFrequentChar).append('\n');
            }
        }

        System.out.print(sb);
        br.close();
    }
}
