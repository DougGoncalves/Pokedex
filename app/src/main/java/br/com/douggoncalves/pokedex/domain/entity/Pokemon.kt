package br.com.douggoncalves.pokedex.domain.entity

import com.google.gson.annotations.SerializedName

data class Pokemon(
    @SerializedName("") val nome: String,
    val urlImagem: String
)