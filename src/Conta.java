public abstract class Conta implements IConta {

private  static final int AGENCIA_PADRAO=33;
private static int SEQUENCIAL =1;

protected int agencia;
protected int numero;
protected double saldo;
protected Cliente clientes;


public Conta(Cliente cliente){
    this.agencia=AGENCIA_PADRAO;
    this.numero=SEQUENCIAL++;
    this.clientes=cliente;
    this.saldo=0;
}
@Override
public void sacar(double valor){
saldo-=valor;
}
@Override
public void depositar(double valor){
    saldo+=valor;
}
@Override
    public void transferir(double valor, IConta contaDestino){
sacar(valor);
contaDestino.depositar(valor);
}

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", clientes=" + clientes +
                '}';
    }
}
