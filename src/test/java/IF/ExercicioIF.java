package IF;

public class ExercicioIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String banco = "Champions";
		int boleto = 3000;
		int dinheironaconta = 2501;
		int saldoespecial = 500;
		int saldorestante = dinheironaconta + saldoespecial - boleto;
		
		System.out.println("Bem vindo ao banco " + banco);
		System.out.println("Seu saldo é de  " + dinheironaconta);
		System.out.println("Voce possui " + saldoespecial + " R$ de cheque especial");
		System.out.println("Seu boleto é no  valor de " + boleto + " R$");
		
		if (boleto <= dinheironaconta + saldoespecial) {
			System.out.println("Voce realizou o pagamento, seu saldo é de " + saldorestante + " R$");
		}   else {
			System.out.println("Saldo insuficiente");
		}
				
	}


	}


