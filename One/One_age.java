package One;

public class One_age {
    final int diasAno = 365;
    final int diasMes = 30;
    int anos;
    int meses;
    int dias;

    public One_age(int anos, int meses, int dias) {
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    public void calcularDias(){
        dias += (anos * diasAno) + (meses * diasMes);
        System.out.println("\nA idade em dias é: "+ dias);
    }
}
