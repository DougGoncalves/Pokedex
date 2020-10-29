package br.com.douggoncalves.pokedex.ui.pesquisa

import br.com.douggoncalves.pokedex.domain.entity.Pokemon

interface PesquisaContract {

    interface PesquisaView {

        fun exibePokemon(pokemon: Pokemon?)
        fun exibeErro(mensagem: String?)

    }

    interface PesquisaPresenter {

        fun pesquisar(id: String)
    }
}