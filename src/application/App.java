package application;

import subject.ValorDollar;
import observer.*;
public class App {

	public static void main(String[] args) {

		ValorDollar valorDollar = new ValorDollar();
		Internet internet = new Internet();
		Jornal jornal = new Jornal();
		
		//jornal
		valorDollar.registerObserver(jornal);
		valorDollar.setMudancaValor(3.24f, "8:29");
		jornal.publish();
		valorDollar.removeObserver(jornal);
		
		//internet
		valorDollar.registerObserver(internet);
		valorDollar.setMudancaValor(3.25f, "8:30");
		internet.publish();
		valorDollar.removeObserver(internet);
		

		valorDollar.setMudancaValor(3.26f,"8:31");
		//printando os dois sem atualizar
		internet.publish();
		jornal.publish();
		
		//registering both and printing out
		valorDollar.registerObserver(jornal);
		valorDollar.registerObserver(internet);
		valorDollar.setMudancaValor(3.26f,"8:32");
		internet.publish();
		jornal.publish();
		
		
		
	}

}
