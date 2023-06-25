import java.io.*;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			bw.write(String.valueOf(A + B) + "\n");   //버퍼에 있는 값 전부 출력

		}

		br.close();
		bw.flush();   //남아있는 데이터를 모두 출력시킴
		bw.close();   //스트림을 닫음
	}

}