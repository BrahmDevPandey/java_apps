import org.springframework.stereotype.Component;

@Component
public class ATMTransaction {
	public void credit() {
		System.out.println("Credited 1000000 in account as salary.");
	}
	
	public void debit() {
		System.out.println("Debited 10000000 from account for Telescope.");
	}
}
