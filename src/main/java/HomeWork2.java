public class HomeWork2 {
    public static void main(String[] args){
        numbTrue();
        numberPositie();
        numberNegative();
        numdString();
        ageNumber();

    }
    private static void numbTrue() {
        int a = 5;
        int b = 15;
        if(a + b >= 10 && a + b <= 20) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    private static void numberPositie(){
        int c = 7;
        if( c < 0){
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }
    private static void numberNegative(){
        int d = -7;
        if(d >= 0){
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
    private static void numdString(){
        int e = 4;
        int i = 0;
        for( i = 1; i <= e; i++ ){
            System.out.println("Home work two");
        }
    }
    private static void ageNumber(){
        int year = 2020;
        if (year % 4 > 0){
            System.out.println("fals");
        } else if(year % 100 > 0) {
            System.out.println("true");
        } else if(year % 400 == 0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
