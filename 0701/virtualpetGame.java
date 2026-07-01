class virtualDog{
    String name;
    int maxEnergy;
    int energy;
}


public class virtualpetGame {
    public static void main(String[] args) {
        
    
    virtualDog taro = new virtualDog();
    taro.name ="taro";
    taro.maxEnergy=100;
    taro.energy =50;

    //ジロ
    virtualDog jiro = new virtualDog();
    jiro.name = "ジロ";
    jiro.maxEnergy = 100;
    jiro.energy =40;

    System.out.println("名前：" + taro.name);
    System.out.println("最大HP：" + taro.maxEnergy);
    System.out.println("HP：" + taro.energy);

     System.out.println("名前：" + jiro.name);
    System.out.println("最大HP：" + jiro.maxEnergy);
    System.out.println("HP：" + jiro.energy);
   
    }
}



