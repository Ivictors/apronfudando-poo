package enumeradores.teste;

import enumeradores.dominio.Cliente;
import enumeradores.dominio.Produto;
import enumeradores.dominio.TipoCliente;
import enumeradores.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {

        Produto bone = new Produto("Bone", 100.00);
        Produto conjunto = new Produto("Conjunto", 300.00);
        Produto tenis = new Produto("Tenis", 500.00);

        Cliente clienteX = new Cliente("José", bone, TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente clienteY = new Cliente("Maria", conjunto, TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente clienteZ = new Cliente("Pedro", tenis, TipoCliente.PESSOA_FISICA, TipoPagamento.PIX);

        System.out.println(clienteX);
        System.out.println(clienteY);
        System.out.println(clienteZ);

        System.out.printf("Desconto para pagamentos em debito: %.2f R$ para produto: %s %n" , TipoPagamento.DEBITO.calcularDesconto(bone.valor) , bone.nome);
        System.out.printf("Desconto para pagamentos em credito: %.2f R$ para produto: %s %n" , TipoPagamento.CREDITO.calcularDesconto(conjunto.valor) , conjunto.nome);
        System.out.printf("Desconto para pagamentos em pix: %.2f R$ para produto: %s %n" , TipoPagamento.PIX.calcularDesconto(tenis.valor) , tenis.nome);
    }
}
//        for (TipoCliente tipoCliente : TipoCliente.values()) {
//            System.out.println(tipoCliente);
//        }
//        for (TipoCliente tipoCliente : EnumSet.range(TipoCliente.PESSOA_FISICA,TipoCliente.PESSOA_JURIDICA)){
//            System.out.println(tipoCliente);
//        }
