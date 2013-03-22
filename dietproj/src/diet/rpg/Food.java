/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diet.rpg;

/**
 *
 * @author Edu
 */
public class Food {
    private String foodName;
    private double foodCalories;


Food(String foodName, double foodCalories){
    this.foodName = foodName;
    this.foodCalories = foodCalories;
}

public static void newFood(){
    System.out.println("Digite o nome do alimento: ");
    System.out.println("Digite a quantidade de calorias: ");
    Food fd = new Food("Bolacha", 45);
    printFood(fd);
    System.out.println("Cadastro de alimento efetuado com sucesso :) \n\n");
    
}

public static void printFood(Food fd){
    System.out.println(fd.foodName);
    System.out.println(fd.foodCalories + " calorias");
}

}