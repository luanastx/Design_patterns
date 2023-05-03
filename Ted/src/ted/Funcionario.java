package ted;

public class Funcionario extends Pessoa {

	
		private int matricula;
		private String cargo;
		private double salario;
		private int dataAdmissao;
		
		public void reajustarSalario(double porcetagem) {
			this.salario = this.salario * porcetagem;
		}
		public void promover(String cargo) {
			this.cargo = cargo;
		}
		public int getMatricula() {
			return matricula;
		}
		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}
		public String getCargo() {
			return cargo;
		}
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		public int getDataAdmissao() {
			return dataAdmissao;
		}
		public void setDataAdmissao(int dataAdmissao) {
			this.dataAdmissao = dataAdmissao;
		}

}
