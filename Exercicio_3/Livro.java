package Exercicio_3;

public class Livro {

    // ATributos privados
    private String titulo;
    private String autor;
    private int paginasTotais;
    private int paginasLidas;


    // Construtor
    public Livro(String titulo, String autor, int paginasTotais){
        this.titulo = titulo;
        this.autor = autor;
        this.paginasTotais = paginasTotais;
        paginasLidas = 0;
    }

    // Métogos Getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getPaginasTotais(){
        return paginasTotais;
    }

    public int getPaginasLidas(){
        return paginasLidas;

    }
    
    //Método para somar a quantidade de páginas lidas pelo leitor
    public void lerPaginas(int quantidade){

        this.paginasLidas += quantidade;

        if (this.paginasLidas > this.paginasTotais) {
            paginasTotais = paginasLidas;
            this.paginasLidas = this.paginasTotais;
        } 
    }

    //Método para exibir o progresso
    public double exibirProgresso(){
        double percentual = ((double)paginasLidas * 100)/paginasTotais;
        return percentual;
    }
}

