import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int sayi1 = 0, sayi2 = 0;
		String islem;
		boolean devamEt= true;
		while(devamEt){
		System.out.println("Lutfen sayi giriniz:");
		Scanner inputFromUser = new Scanner(System.in);
		sayi1 = inputFromUser.nextInt();
		
		System.out.println("Lutfen diger sayiyi giriniz:");
		sayi2 = inputFromUser.nextInt();
		
		System.out.println("Lutfen yapmak istediginiz islemi seciniz `+ - / *`:");
		Scanner inputString = new Scanner(System.in);
		islem = inputString.nextLine();
			
		Calculator calculate = new Calculator();
		int answer = 0;
		if(islem.equals("+")){
		answer = calculate.add(sayi1, sayi2);
		}
		
		else if(islem.equals("-")) {
		answer = calculate.subtract(sayi1, sayi2);
		}
		
		else if(islem.equals("/")){
		answer = calculate.seperate(sayi1, sayi2);
		}
		
		else if (islem.equals("*")) {
		answer = calculate.multiply(sayi1, sayi2);
		}
		
		System.out.println(answer);
		
		System.out.println("Cikmak icin x" + "Devam icin y");
		Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
		if(input.equals("x")) {System.exit(0); }
		else if(input.equals("y")){
		devamEt = true; }
	
		}	
	}
}
	

