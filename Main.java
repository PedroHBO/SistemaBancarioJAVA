public class Main {
    public static void main(String[] args) {
        Cliente pedro = new Cliente();
        pedro.setNome("Pedro Henrique");
        Conta cc = new ContaCorrente(pedro);
        Conta cp = new ContaPoupanca(pedro);
        cc.depositar(100);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cc.transferir(50, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
