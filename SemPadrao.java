class PagamentoPixSemPadrao {
    void processar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor invalido");
        System.out.println("Pix: R$ " + valor);
        System.out.println("Comprovante emitido");
    }
}

class PagamentoCartaoSemPadrao {
    void processar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor invalido");
        System.out.println("Cartao: R$ " + valor);
        System.out.println("Comprovante emitido");
    }
}

public class SemPadrao {
    public static void main(String[] args) {
        new PagamentoPixSemPadrao().processar(100.0);
        new PagamentoCartaoSemPadrao().processar(75.0);
    }
}
