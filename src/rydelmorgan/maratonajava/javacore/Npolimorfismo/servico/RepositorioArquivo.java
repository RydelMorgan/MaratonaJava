package rydelmorgan.maratonajava.javacore.Npolimorfismo.servico;

import rydelmorgan.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    public void salvar() {
        System.out.println("Salvando em um Arquivo");
    }
}
