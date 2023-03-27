package Two;

public class Two_average {
	    public int n1 = 7;
	    public int n2 = 8;
	    public int n3 = 9;
	    public int n4 = 4;
	    public int n5 = 5;
	    public int n6 = 6;
	    public double average1;
	    public double average2;

	    public void calculate(){
	        average1 = n1*n2*n3;
	        System.out.println("average 1: "+average1);
	        average2 = n4*n5*n6;
	        System.out.println("average 2: "+average2);

	        System.out.println("Soma das medias: " + (average1+average2) );
	        System.out.println("Media das medias: " + (average1*average2) / 2);
	    }
	}

