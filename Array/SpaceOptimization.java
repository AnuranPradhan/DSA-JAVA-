public class SpaceOptimization {
    public static void main(String[] args) {
        int a =60;
        int b=95;
        int size=Math.abs((b-a))+1;
        int space[]=new int[size];
        for(int i=a;i<=b;i++){
            if(i%2==0 || i%5==0){
               space[i-a]=1;
            }
        }
        System.out.println("The Items are");
        for(int i=a;i<=b;i++){
            if(space[i-a]==1){
                System.out.println(i);
            }
        }
    }
}
