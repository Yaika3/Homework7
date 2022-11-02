public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.println("Итерац = "+ i);
        }

        for (int r = 10; r > 0; r--){
            System.out.println("Итерац = "+ r);
    }
        for (int p = 0; p< 17; p=p+2 ) {
            System.out.println("Четная" + p);
        for ( int H = 10; H> -10;H--){
            System.out.println("Обратно" + H);


}
        for (int year = 1904; year < 2096; year = year +4){
            System.out.println("Високосный "+ year);

        }
        for (int sev = 7;sev <= 98; sev = sev+7 ){
            System.out.println("По семь"+ sev);

        }
        for (int two = 1; two < 512; two= two * 2){
            System.out.println("Умножаем "+ two);
        }
        int pot = 29000;
        int total = 0;
        for (int y = 0; y < 12; y++){
            total = total + total/100;
            total = total + pot;
            System.out.println("Месяц "+ total );
        }
        }}}