package com.br.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoLivros {

    private List<InformacoesDoLivro>livros = new ArrayList<>();

    public InformacoesDoLivro cadastrarNovoLivro(String autor, String titulo, String editora, int exemplares, String categoria){
        InformacoesDoLivro novoLivro;
        novoLivro = new InformacoesDoLivro( autor, titulo, editora, categoria, exemplares );
        livros.add(novoLivro);
        return novoLivro;
    }

}
