/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diet.rpg;

/**
 *
 * @author Edu
 */
public class Player {
    private String name;
    private int idade;
    private float altura;
    private float peso;


Player(String name){
    this.name = name;
    this.idade = 0;
}


public static void main(String[] arg){
    Player x = new Player("Joao");
}

}