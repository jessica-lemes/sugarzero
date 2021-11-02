package com.projetoIntegrador.sugarzero.model

import com.google.gson.annotations.SerializedName

class RetornaRegistros(
    @SerializedName("id")
    val Id : Int,
    @SerializedName("usuario")
    val Usuario: Usuario,
    @SerializedName("lancamentos")
    val Lancamentos : ArrayList<RegistroDiario>
) {
}