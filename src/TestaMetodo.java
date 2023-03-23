public class TestaMetodo {
    public static void main (String[] args) {
        Conta contaDoPaulo = new Conta(45646895,1411485);
        contaDoPaulo.setSaldo(100);
        contaDoPaulo.depositar(50);
        System.out.println(contaDoPaulo.getSaldo());

        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.getSaldo());
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta(98956,984456);
        contaDaMarcela.depositar(1000);

        boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
        if(sucessoTransferencia) {
            System.out.println("transferencia com sucesso");
        } else {
            System.out.println("faltou dinheiro");

        }
        System.out.println(contaDaMarcela.getSaldo());
        System.out.println(contaDoPaulo.getSaldo());
    }

}
