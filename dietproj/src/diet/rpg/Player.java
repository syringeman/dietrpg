/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package diet.rpg;
/**
 *
 * @author Edu
 */
import java.util.Scanner;
import static diet.rpg.Food.*;

public class Player {
    
    private String name;
    private int age;
    private float height;
    private float weight;
    private String sex;
    private float imc;
    private int plCoins;
    private int plLevel;


Player(String name, int age, float height, float weight, String sex, float imc, int plCoins, int plLevel){
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.sex = sex;
    this.imc = imc;
    this.plCoins = plCoins;
    this.plLevel = plLevel;
 }


public static float imcCalc(float weight, float height){
    return weight / (height*height);
}


public static void printPlayer(Player pl){
    System.out.println(pl.name);
    System.out.println(pl.age + " anos");
    System.out.println(pl.height + "kg");
    System.out.println(pl.weight + "m");
    System.out.println(pl.sex);
    System.out.println("IMC = " +  pl.imc);
    System.out.println(pl.plCoins + " CC (Caloric Coins)");
    System.out.println("Level: " + pl.plLevel);
    
}


public static void newPlayer(){
    
    System.out.println("Digite seu nome:");
    System.out.println("Digite sua idade: ");
    System.out.println("Digite sua altura: ");
    System.out.println("Digite seu peso: ");
    System.out.println("Digite seu sexo (M/F): ");
    
    Player pl = new Player("Joao",23,65,2,"H",0,0,100);
    pl.imc = imcCalc(pl.weight,pl.height);
    
    System.out.println("Cadastro efetuado com sucesso :) \n\n\n");
     printPlayer(pl);
}


public static void main(String[] arg){   
    newPlayer();
    Food fd = new Food("Bolacha", 45);
   
    printFood(fd);
}

}