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
 * Exercicio 3
 *
 * Escreva um programa que leia dois números inteiros e determine qual é o maior.
 *
 * @see main onde vamos executar nosso exercicio.
 *
 */
fun main() {
    println("Digite um número inteiro:")
    val num1 = readLine()!!.toInt()

    println("Digite outro número inteiro:")
    val num2 = readLine()!!.toInt()

    println(ExerciseThree().logicExerciseThree(num1, num2))
}

/**
 * Essa classe contém método que irá contém a logica do exercicio.
 */
class ExerciseThree {

    /**
     * Esse método contém a logica do exercicio
     *
     * @param valueOne valor inteiro.
     * @param valueTwo valor inteiro.
     * @return retorna valor string com resultado do desafio.
     */
    fun logicExerciseThree(valueOne: Int, valueTwo: Int): String {
        return if(valueOne > valueTwo){
            "O primeiro número é o maior: $valueOne"
        } else if(valueTwo > valueOne){
            "O segundo número é o maior: $valueTwo"
        } else{
            "Os números $valueOne, $valueTwo são iguais"
        }
    }

}
