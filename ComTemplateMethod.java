abstract class ProcessadorPagamento {
    public final void processar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor invalido");
        executarPagamento(valor);
        System.out.println("Comprovante emitido");
    }

    protected abstract void executarPagamento(double valor);
}

class PagamentoPix extends ProcessadorPagamento {
    @Override
    protected void executarPagamento(double valor) {
        System.out.println("Pix: R$ " + valor);
    }
}

class PagamentoCartao extends ProcessadorPagamento {
    @Override
    protected void executarPagamento(double valor) {
        System.out.println("Cartao: R$ " + valor);
    }
}

public class ComTemplateMethod {
    public static void main(String[] args) {
        new PagamentoPix().processar(100.0);
        new PagamentoCartao().processar(75.0);
    }
}
