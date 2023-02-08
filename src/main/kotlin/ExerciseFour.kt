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
 * Exercicio 4
 *
 * Escreva um programa que leia três números inteiros e determine qual deles é o maior.
 *
 * @see main onde vamos executar nosso exercicio.
 *
 */
fun main() {
    println("Digite o primeiro número:")
    val num1 = readLine()!!.toInt()

    println("Digite o segundo número:")
    val num2 = readLine()!!.toInt()

    println("Digite o terceiro número:")
    val num3 = readLine()!!.toInt()

    println(ExerciseFour().logicExerciseFour(num1, num2, num3))
}


/**
 * Essa classe contém método que irá contém a logica do exercicio.
 */
class ExerciseFour {

    /**
     * Esse método contém a logica do exercicio
     *
     * @param valueOne valor inteiro.
     * @param valueTwo valor inteiro.
     * @param valueThree valor inteiro.
     * @return retorna valor string com resultado do desafio.
     */
    fun logicExerciseFour(valueOne: Int, valueTwo: Int, valueThree: Int): String {
        return if (valueOne > valueTwo && valueOne > valueThree){
            "$valueOne é o maior número"
        } else if (valueTwo > valueOne && valueTwo > valueThree){
            "$valueTwo é o maior número"
        } else {
            "$valueThree é o maior número"
        }
    }
}
