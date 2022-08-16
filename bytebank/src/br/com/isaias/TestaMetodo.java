package br.com.isaias;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoIsaias = new Conta();
		contaDoIsaias.saldo = 100;
		
		contaDoIsaias.deposita(50);
		
		System.out.println(contaDoIsaias.saldo);
		
		contaDoIsaias.saca(20);
		System.out.println(contaDoIsaias.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(300, contaDoIsaias)) {
			System.out.println("Tranferido com sucesso!");
		}else {
			System.out.println("Faltou dinheiro!");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoIsaias.saldo);
	}

}
