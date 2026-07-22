public class InstanceofExample {
    
    public static void main(String[] args) {
    Person[] persons = new Person[3];
    persons[0] = new Person();
    persons[1] = new Student();
    persons[2] = new Teacher();


    //instanceof演算子
    // persons[0] instanceof Person

    for(int i = 0; i < persons.length; i++){
            //lengthは配列の要素数を持ってくる
        if(persons[i] instanceof Person){
            System.out.println("persons["+ i + "]はPersonクラスのインスタンスでsu");

        }

    if(persons[i] instanceof Student){
        System.out.println("persons["+ i + "]はStudentクラスのインスタンスでsu");

    }

    if(persons[i] instanceof Person){
        System.out.println("persons["+ i + "]はTeacherクラスのインスタンスでsu");

        }
    }
    }
}
