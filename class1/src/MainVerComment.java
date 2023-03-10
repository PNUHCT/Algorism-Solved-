import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class MainVerComment {

    public static void main(String[] args) throws IOException {
        /**
         * 콘솔 입력용 리터럴. Scanner와 유사함. 단, Buffer특성과 String으로 고정 형변화이라는 특징으로 조금더 빠를수 있음.
         * 콘솔 출력용 리터럴. system.out.println과 유사하므로 필요에 따라 바꿔가면서 사용.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /**
         * 형 변환 없이 연산 할 수 있는 Math 라이브러리 안의 클래스.
         * .add(BigInteger b) 덧셈
         * .subtract(BigInteger b) 뺄셈
         * .multiply(BigInteger b) 곱셈
         * .divide(BigInteger b) 나눗셈
         * .remainder(BigInteger b) 나머지
         */
        BigInteger bigint;

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T ; i++) {

        }
        /**
         * StringTokenizer : String 형식의 입력값에서 엔터 기준으로 String값을 내보내주는 역할
         * bw.write(""+"\n"); 혹은 bw.append(""+"\n")으로 결과값 줄바꿈하며 입력
         * bw.flush(); : stream을 flush 함. 프로세스를 닫지 않고 용량제어시 사용
         * bw.close(); : stream을 flush 하고, stream을 닫음
         * String.format("%0.2f",a); : double값인 a에 대하여 소수점뒤 2번째에서 반올림하여 String으로 변환해주는 방법
         */
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        bw.close();
    }
}

