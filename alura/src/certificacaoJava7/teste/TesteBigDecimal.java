package certificacaoJava7.teste;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.util.Locale;

public class TesteBigDecimal {
	
	public static void main(String[] args) {
		
		double d = 1000.5;
		
		BigDecimal b = new BigDecimal(d, MathContext.DECIMAL64);
		
        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

		System.out.println(format.format(b));
		
	}

}
