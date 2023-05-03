package ted;

public class Pessoa {
		private String name;
		private int dataNascimento;
		private String endereco;
		private String telefone;
		
		public Pessoa(String name, String endereco, String telefone ) {
			this.name = name;
			this.endereco = endereco;
			this.telefone = telefone;
		}
		public void cadastrar() {
			System.out.println("Cadastro finalizado!");
		}
		public int obterIdade() {
			int dataAtual = 2023;
			int idade = dataAtual - dataNascimento;
			return idade;
			
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(int dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
}
