// Sobrecarga e um conceito de polimorfismo que consite basicamente
// em criar variações de um mesmo método, ou seja a criação de dois ou mais
// metodos com nomes totalmente iguais em uma classe, com a condição
// de que os argumentos sejam diferente.

public class Carro {
    public int velocidade(int distancia, int tempo){
        return distancia/tempo;
    }
    public int velociade(int velociade){
        return velociade;
    }
}

/* A sobreposição de metodos e um conceito do poimorfismo que nos
 * permite reescrever um metodo, ou seja, podemos reescrever nas clesses
 * filhas metodos criados inicialmente na classe pai, os metodos que serão sobreposto
 * devem possuir o mesmo nome, tipo de retorno e quantidade de parâmetros do metodo
 * inicial, podendo adicionar um algo a mais ou não.
 */

public class Direcao{
    //sobrepondo o metodo toString da class Object
    public String toString(){
        return "Continue em frente";
    }
}