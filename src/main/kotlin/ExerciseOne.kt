/*
 *
 *  * Copyright 2023  TELOS EDUCACAO CONECTADA LTDA
 *  *
 *  *   Licensed under the Apache License, Version 2.0 (the "License");
 *  *   you may not use this file except in compliance with the License.
 *  *   You may obtain a copy of the License at
 *  *
 *  *       http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *   Unless required by applicable law or agreed to in writing, software
 *  *   distributed under the License is distributed on an "AS IS" BASIS,
 *  *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *   See the License for the specific language governing permissions and
 *  *   limitations under the License.
 *
 */

/**
 *
 * Exercicio 1
 *
 * Escreva um programa que mostre a soma de dois números inteiros e mostre que a soma é par.
 *
 * @see main, onde vamos executar nosso exercicio.
 *
 */
fun main() {
    println("Digite um número inteiro:")
    val num1 = readLine()!!.toInt()

    println("Digite outro número inteiro:")
    val num2 = readLine()!!.toInt()

    println(ExerciseOne().logicExerciseOne(num1, num2))
}

/**
 * Essa classe contém método que irá contém a logica do exercicio.
 */
class ExerciseOne {

    /**
     * Esse método contém a logica do exercicio
     *
     * @param valueOne valor inteiro.
     * @param valueTwo valor inteiro.
     * @return retorna valor string com resultado do desafio.
     */
    fun logicExerciseOne(valueOne: Int, valueTwo: Int): String {
        val soma = valueOne + valueTwo
        return if(soma % 2 == 0)
            "A soma de $valueOne + $valueTwo é par"
        else
            "A soma de $valueOne + $valueTwo é ímpar"
    }

}