package Three;

public class Three_porcentage {
	    public double balance;

	    public Three_porcentage(double balance) {
	        this.balance = balance;
	    }

	    public void readjustmentbalance(){
	        System.out.println("Saldo atual: "+balance);

	        System.out.println("Saldo com reajuste de 1%: "+ (balance + balance*0.01));
	    }
	}

