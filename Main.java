import entidade.Cliente;
import regra.Operacao;

class Main {
  public static void main(String[] args) {
 
		Cliente cliente = new Cliente();
		cliente.nome = "Lazaro Silva";
    System.out.println("CLIENTE: " + cliente.nome);

		Conta myconta = new Conta(567801);
    System.out.println("CONTA: " + myconta.getSaldo());

		myconta.creditar(1000);
    System.out.println("CONTA: " + myconta.getSaldo());

		myconta.debitar(300);
    System.out.println("CONTA: " + myconta.getSaldo());

		Operacao operacao = new Operacao();
	  //operacao.transferir(500, myconta, tuaconta);

    System.out.println("fim teste cliente!");
  }
}