// figura 5.12: AutoPolicyTest.java
// demonstrando Strings em um switch
public class ApoliceTeste{
	public static void main(String[] args) {
		// cria dois objetos Apolice
		Apolice apolice1 = new Apolice(11111111, "Toyota Camry", "NJ");
		Apolice apolice2 = new Apolice(22222222, "Ford Fusion", "ME");

		// exibe se cada apolice esta em um estdo "sem culpa"
		apoliceNoEstadoSemCulpa(apolice1);
		apoliceNoEstadoSemCulpa(apolice2);
	}

	// metodo que mostra se uma Apolice esta em um estado com segure de automovel "sem culpa"
	public static void apoliceNoEstadoSemCulpa(Apolice apolice){
		System.out.println("A apolice de carro:");
		System.out.printf(
			"Conta #: %d; Carro: %s; Estado %s %s em um estado sem culpa%n%n",
			apolice.getNumConta(),apolice.getMarcaModelo(),
			apolice.getEstado(),
			(apolice.ehEstadoSemCulpa() ? "esta": "nao esta"));
	}
}// fim da classe ApoliceTeste