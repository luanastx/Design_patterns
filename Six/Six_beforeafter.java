package Six;

public class Six_beforeafter {
    public int num;

    public Six_beforeafter(int num) {
        this.num = num;
    }

    public void printbeforeafter(){
        int before = this.num--;
        int after = this.num++;
        System.out.println("numero informado: "+ num + "\nAntecessor: "+ before);
        System.out.println("Sucessor: "+ after);
    }
}
