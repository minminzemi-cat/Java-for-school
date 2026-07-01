class Person{
    String name;
    int age;
}

public class Practice {
    static void printInfo(Person p){
        System.out.println("名前：" +p.name);
        System.out.println("年齢"+p.age);
    }

    static boolean ageCheck(Person p,int i){
        // if(p.age > i){
        //     return true;
        // }else{
        //     return false;
        // }
        return p.age > i;
    }

    static void printYoungerPersonName(Person p1,Person p2){
        //年齢の若いほうの名前を出力
        //ただし、同じ年齢の場合はｐ１を出力
        if(p1.age >p2.age){
            System.out.println(p2.name);
        }else
        {
            System.out.println(p1.name);
        }
    }


    static int getTotalAge(Person p1,Person p2){
        int age = p1.age + p2.age;
        return age;


    }

    public static void main(String[] args) {
        Person a = new Person();
        a.name = "高橋";
        a.age=18;

        Person b=new Person();
        b.name="杉田";
        b.age=12;

        printInfo(a);
        printInfo(b);

        System.out.println(ageCheck(a, 15));

        printYoungerPersonName(a, b);

        System.out.println(getTotalAge(a, b));
    }
}
