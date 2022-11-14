import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ATMControl {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		ATMTransaction atm = context.getBean(ATMTransaction.class);
		atm.credit();
		atm.debit();
	}
}
