package task1;

public class Controlstructure {
	public static void main(String[] args) {
        int[] numbers={10,25,30,45,50,65,54 ,65, 96};
        for (int i=0; i < numbers.length; i++){
            if (numbers[i]%2==0) {
                System.out.println("Even number:"+numbers[i]);
            }
        }
    }
}
