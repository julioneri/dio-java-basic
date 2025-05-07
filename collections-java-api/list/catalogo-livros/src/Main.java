public class Main {
    public static void main(String[] args) throws Exception {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2024);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2025);
        
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println("=================");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2022, 2024));
        System.out.println("=================");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
