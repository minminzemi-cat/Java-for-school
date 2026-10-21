package J0916;

public class Practice2_3 {
    public static void main(String[] args) {
        try {
            System.out.println("何らかの処理が行われました");
            throw new NullPointerException();

        } catch ( ArrayIndexOutOfBoundsException e) {
            System.out.println("例外処理A");
        }
        catch(Exception e){
            System.out.println("例外処理B");
        }
    }
}
