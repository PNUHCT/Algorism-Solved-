package Softeer;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class copareDistance {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if(A>B) System.out.println("A");
        else if (A<B) System.out.println("B");
        else System.out.println("same");
    }
}

