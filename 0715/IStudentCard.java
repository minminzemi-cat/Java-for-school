
//子クラス
public class IStudentCard extends StudentCard {
    String nationality;

    void printInfo(){
        super.printInfo();
        System.out.println("国籍:"+this.nationality);
}
}
