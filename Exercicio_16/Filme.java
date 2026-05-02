package Exercicio_16;

public class Filme {
    private String titulo;
    private int duracaoEmMinutos;
    private double precoIngresso;

    public Filme(String titulo, int duracao, double preco){
        this.titulo = titulo;
        setDuracaoEmMinutos(duracao);
        setPrecoIngresso(preco);
    }

    public int getDuracaoEmMinutos(){
        return this.duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int novaDuracao){
        if(novaDuracao > 0 && novaDuracao < 600){
            this.duracaoEmMinutos = novaDuracao;
        } else {
            System.out.println("Duração inválida!");
        }
    }

    public double getPrecoIngresso(){
        return precoIngresso;
    }

    public void setPrecoIngresso(double novoPreco){
        if(novoPreco >= 0 && novoPreco <= 150){
            this.precoIngresso = novoPreco;
        } else {
            System.out.println("O preço não pode ser negativo e nem superior a 150!");
        }
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        if (!titulo.isBlank()){
            this.titulo = titulo;
        } else {
            System.out.println("O texto não pode estar vazio!");
        }
    }

    public double calcularMeiaEntrada(){
        return this.precoIngresso / 2;
    }
}
