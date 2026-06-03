public class NestExample {
    public static void main(String[] args){
        for(int a =1;a<=3;a++){
            System.out.println("a="+a);
            for(int b=1;b<=3;b++){
                System.out.println("    b ="+b);
                for(int c = 1;c <=3;c++){
                    System.out.println("         c = "+c);
                    for(int d =1;d<=3;d++){
                        System.out.println("                d = " +d);
                    }
                }
            }
        }
    }
}
