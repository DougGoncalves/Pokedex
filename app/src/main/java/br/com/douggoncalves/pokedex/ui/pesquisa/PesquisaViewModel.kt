package br.com.douggoncalves.pokedex.ui.pesquisa

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.douggoncalves.pokedex.data.remote.api.APIService
import br.com.douggoncalves.pokedex.data.repository.PokemonRepositoryImpl
import br.com.douggoncalves.pokedex.domain.entity.Pokemon

class PesquisaViewModel : ViewModel() {

    val pokemonReponse = MutableLiveData<Pokemon>()
    val mensagemErroResponse = MutableLiveData<String>()

    fun pesquisar(id: String) {
        val repository = PokemonRepositoryImpl(APIService.instance)

        repository.pesquisar(id,{
            pokemonReponse.value = it
        }, {
            mensagemErroResponse.value = it.message
        })
    }
}