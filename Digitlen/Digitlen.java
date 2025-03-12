package Digitlen;

public class Digitlen {
    public static int digitlen(long number) {
        if (number == 0) {
            return 1;
        }
        
        number = Math.abs(number);
        
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        
        return count;
    }
    public static void main(String[] args) {
        System.out.println(Digitlen.digitlen(998989778));
    }
}