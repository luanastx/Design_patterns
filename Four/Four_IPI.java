package Four;

public class Four_IPI {
	   public double ipi;
	    public int code1;
	    public double value1;
	    public int quant1;
	    public int code2;
	    public double value2;
	    public int quant2;

	    public Four_IPI(double ipi, int code1, double value1, int quant1, int code2, double value2, int quant2) {
	        this.ipi = ipi;
	        this.code1 = code1;
	        this.value1 = value1;
	        this.quant1 = quant1;
	        this.code2 = code2;
	        this.value2 = value2;
	        this.quant2 = quant2;
	    }

	    public void totalvalue(){
	        System.out.println("Total value: " + ((value1*quant1 + value2*quant2)*(ipi/100 + 1)));
	    }
	}
