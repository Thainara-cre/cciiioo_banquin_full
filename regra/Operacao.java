package regra;

import entidade.Conta;

public class Operacao {

    public void transferir(double v, Conta o, Conta d){
    
		o = new Conta(1000);
		d = new Conta(1000);

		o.debitar(v);
		d.creditar(v);
		
    }


}

