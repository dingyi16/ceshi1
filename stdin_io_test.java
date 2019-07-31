import java.io.*;

public class stdin_io_test {
    public static void main(String[] args) throws IOException {
        String s;
        while (true) {
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            if((s = stdin.readLine()) != null &&  s.length() != 0) {
                int a = Integer.parseInt(s);
                int b[] = new int[a];
                if(a == 1 || a == 2)
                    System.out.println(1);
                else {
                    b[0] = 1; b[1] = 1;
                    for(int i = 2; i < a; i++) {
                        b[i] = b[i - 1] + b[i - 2];
                    }
                System.out.println(b[a - 1]);
                }
            }
            else
                break;
        }
    }
}