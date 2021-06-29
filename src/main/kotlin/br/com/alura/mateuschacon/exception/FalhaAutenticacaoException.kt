package br.com.alura.mateuschacon.exception

import java.lang.Exception

class FalhaAutenticacaoException(
    mensagem: String = "Falha na autenticação"

) : Exception(mensagem){

}