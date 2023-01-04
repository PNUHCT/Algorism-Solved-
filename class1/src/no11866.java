import java.io.*;
import java.util.*;

public class no11866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Integer T = Integer.parseInt(st.nextToken());
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=1; i<=T ; i++) dq.add(i);

        Integer num = Integer.valueOf(st.nextToken());
//        String result = "<";
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while(!dq.isEmpty()) {
            int count = 1;
            while(num!=count) {
                dq.addLast(dq.pollFirst());
                count++;
            }
            sb.append(dq.pollFirst());
//            result += dq.pollFirst();
            if(!dq.isEmpty()) sb.append(", ");
        }
//        System.out.println(result+">");
        System.out.println(sb.append(">"));
    }
}

