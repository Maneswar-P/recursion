public class Recursion {
    static void add(int a,int sum){
        if(a==11){
            System.out.println(sum);
            return;
        }
        sum=sum+a;
        add(a+1,sum);
    }
    public static void main(String[] args) {
        int a=1,sum=0;
            add(a,sum);
    }
}
