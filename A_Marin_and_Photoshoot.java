import java.util.*;
import java.io.*;


public class A_Marin_and_Photoshoot{

    static class Pair{
        int first;
        int last;
        public Pair(int first , int last){
            this.first = first;
            this.last = last;
        }
    
        public int getFirst(){
            return first;
        }
        public int getLast(){
            return last;
        }
    }

    static final int M = 1000000007;

    // Fast input 
    static class Hrittik_FastReader{
        StringTokenizer st;
        BufferedReader br;
        public int n;
        public Hrittik_FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        
        
    }
    // Fast output
    static class Hrittik_FastWriter {
        private final BufferedWriter bw;

        public Hrittik_FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);

        }

        public void close() throws IOException {
            bw.close();
        }
    }

    // GCD of two integers
    private static int gcd(int a , int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    // GCD of two long integers
    private static long gcd(long a , long b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    // LCM of two integers
    private static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    // LCM of two long integers
    private static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    // swap two elements of an array
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // calculating x ^ y
    private static long power(long x, long y){
        long res = 1; 
        x = x % M;
        while(y > 0){
            if ((y & 1) == 1){
                res = (res * x) % M;
            }
            y = y >> 1; 
            x = (x * x) % M;
        }
        return res;
    }

    static void sortPairByFirst(Pair arr[]){
        Arrays.sort(arr , new Comparator<Pair>(){
            @Override public int compare(Pair p1 , Pair p2){
                return p1.first - p2.first;
            }
        });
    }

    static void sortPairByLast(Pair arr[]){
        Arrays.sort(arr , new Comparator<Pair>(){
            @Override public int compare(Pair p1 , Pair p2){
                return p1.last - p2.last;
            }
        });
    }


    public static void main(String[] args) {

        try {
            Hrittik_FastReader Sc =new Hrittik_FastReader();
            Hrittik_FastWriter out = new Hrittik_FastWriter();
            int t = Sc.nextInt();
            outer : while(t-- > 0){
                // write your code here
                
                
                
                
            }
            out.close();
        }

        catch (Exception e) {
            return;
        }
    }
}
