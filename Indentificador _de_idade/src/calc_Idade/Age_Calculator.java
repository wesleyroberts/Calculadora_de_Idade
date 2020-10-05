package calc_Idade;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Age_Calculator {

	public static void main(String[] args)throws Exception {
		// read inputs
		Scanner input=new Scanner(System.in);
		System.out.println("Informe sua data de nascimento (DD-MM-YYYY)");
		String nasc =input.next();
		
		//Converte String date value para java.util.Date class objeto
		SimpleDateFormat convect= new SimpleDateFormat("dd-mm-yyyy");
		Date nasc_novo=convect.parse(nasc);
		
		// pegar data do sitema
		Date sysdate=new Date();
		
		long ms=System.currentTimeMillis()-nasc_novo.getTime();
		long age=(long)((long)ms/(1000.0*60*60*24*365));

			
		System.out.println("Sua idade é : "+ age);
	}
}
