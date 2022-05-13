import javax.swing.JOptionPane;

public class TesteLivro {
    public static void main(String[] args) {
        //variável de referência
        Livro meuLivro;        
        meuLivro = new Livro();

        //Livro meuOutroLivro = new Livro();

        meuLivro.preco = 150;
        meuLivro.qtdePaginas = 500;

        System.out.println("Meu livro custa: " + meuLivro.preco);

        meuLivro.abrir();

        String querVoltar = JOptionPane.showInputDialog("Quer voltar");

        //não compare strings com ==
        if (querVoltar.equals("Sim")){
            meuLivro.virarPagina(true);
        }
        else{
            meuLivro.virarPagina(false);
        }
    }    
}
