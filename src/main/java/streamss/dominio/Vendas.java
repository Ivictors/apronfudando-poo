package streamss.dominio;

public class Vendas {
    private String mes;
    private String ano;
    private String vendedorNome;
    private int qtdItensVendidos;
    private double totalVendasMes;

    public Vendas(String mes, String ano, String vendedorNome, int qtdItensVendidos, double totalVendasMes) {
        this.mes = mes;
        this.ano = ano;
        this.vendedorNome = vendedorNome;
        this.qtdItensVendidos = qtdItensVendidos;
        this.totalVendasMes = totalVendasMes;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getVendedorNome() {
        return vendedorNome;
    }

    public void setVendedorNome(String vendedorNome) {
        this.vendedorNome = vendedorNome;
    }

    public int getQtdItensVendidos() {
        return qtdItensVendidos;
    }

    public void setQtdItensVendidos(int qtdItensVendidos) {
        this.qtdItensVendidos = qtdItensVendidos;
    }

    public double getTotalVendasMes() {
        return totalVendasMes;
    }

    public void setTotalVendasMes(double totalVendasMes) {
        this.totalVendasMes = totalVendasMes;
    }

    @Override
    public String toString() {
        return "Vendas{" +
                "mes='" + mes + '\'' +
                ", ano='" + ano + '\'' +
                ", vendedorNome='" + vendedorNome + '\'' +
                ", qtdItensVendidos=" + qtdItensVendidos +
                ", totalVendasMes=" + totalVendasMes +
                '}';
    }
}
