package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Nhap vao so can kiem tra: ");
	    int a = sc.nextInt();
	    if(a > 0) {
	    	System.out.println("a la so duong");
	    }else {
	    	if(a == 0) {
	    		System.out.println("a = 0");
	    	}else {
	    		System.out.println("a la so am");
	    	}
	    }
	    
	    /*9.2 kiem tra n chia het cho 3 hay 5*/
	    System.out.println("Nhap so can kiem tra chia het cho 3 hay 5: ");
	    int b = sc.nextInt();
	    if(b % 3 == 0) {
	    	System.out.println("so b chia het cho 3");
	    }else {
	    	if(b % 5 == 0) {
	    		System.out.println("so b chia het cho 5");
	    	}else {
	    		System.out.println("so b ko chia het cho 3 va 5");
	    		
	    	}
	    }
	    
	    /*9. viet chuong trinh nhap vao thang in ra so ngay*/
	    
	    System.out.println("Nhap vao thang: ");
	    byte month = sc.nextByte();
	  
	    if((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
	    	System.out.println("so ngay trong thang la 31");
	    }else { 
	    		if((month == 4) || (month == 6 ) || (month == 9 ) || (month ==11)) {
	    			System.out.println("so ngay tron thang la 30");
	    		}else {
	    			System.out.println("so ngay la 28 hoac 29");
	    		}
	    	    
	    	 }
	    // Viet ptr giai ptr bac 2
	    System.out.println("nhap cac he so cua ptr bac 2: ");
	    
	    System.out.println("Nhap va he so a = ");
	    int ax2 = sc.nextInt();
	    
	    System.out.println("Nhap vao he so b = ");
	    int bx = sc.nextInt();
	    
	    System.out.println("Nhap vao he so c = ");
	    int c0 = sc.nextInt();
	    
	    if((ax2 == 0) && (bx == 0) && (c0 == 0)) {
	    	System.out.println("ptrinh co vo so nghiem");
	    }
	    
	    if((ax2 == 0) && (bx == 0) && (c0 != 0)) {
	    	System.out.println("Phuong trinh vo nghiem");
	    }
	    
	    if((ax2 == 0) && (bx != 0)) {
	    	System.out.println("Phuong trinh co 1 nghiem duy nhat: " + (float) (-c0/bx));
	    }
	    
	    float denTa = bx * bx - 4 * ax2 * c0;
	    
	    if(denTa > 0) {
	    	
	    System.out.println("nghiem cua ptrinh la:");
	    System.out.println("x1 = " + (float) ((-bx + Math.sqrt(denTa))/(2 * ax2)));
	    System.out.println("x2 = " + (float) ((-bx - Math.sqrt(denTa))/(2 * ax2)));
	    
	    }else {  if(denTa == 0 ) {
	    			System.out.println("phuong trinh co nghiem kep x1 = x2 = " +(float) + (-bx)/(2 * ax2));
	    		  }else {
	    			  System.out.println("Ptrinh vo nghiem");
	    		  }
	    
	    }
	    
	    //Kiem tra 3 canh cua tam giac
	    System.out.println("Nhap vao canh thu nhat cua tam giac: ");
	    float canh1 = sc.nextFloat();
	    
	    System.out.println("Nhap vao canh thu hai cua tam giac");
	    float canh2 = sc.nextFloat();
	    
	    System.out.println("Nhap vao canh thu ba cua tam giac");
	    float canh3 = sc.nextFloat();
	    
	    if((canh1 + canh2>canh3) || (canh2 + canh3 > canh1) || (canh1 + canh3 > canh2)){
	    	System.out.println("ba canh da nhap la ba canh cua tam giac");
	    }		else {
	    		System.out.println("Ba canh da nhap ko phai la ba canh cua tam giac");
	    		}

	}

}
