package com.projetoIntegrador.sugarzero.viewModel

import android.app.Application
import com.projetoIntegrador.sugarzero.model.TokenUsuario

class TokenGlobal : Application() {
    companion object {
        lateinit var tokenGlobal: TokenUsuario

        fun adicionaTokenAoTokenGlobal(token: TokenUsuario) {
            tokenGlobal = token
        }
    }
}