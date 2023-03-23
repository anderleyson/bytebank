public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(121321,23131);
        primeiraConta.setSaldo(200);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.depositar(100);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta(4161230,1231231);
        segundaConta.setSaldo(50);

        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("segunda conta tem " + segundaConta.getSaldo());
    }
}