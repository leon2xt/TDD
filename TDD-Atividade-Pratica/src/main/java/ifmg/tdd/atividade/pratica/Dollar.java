/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifmg.tdd.atividade.pratica;

/**
 *
 * @author Leon
 */
public class Dollar {
    int amount = 10;
       Dollar(int amount) {}			
       void times(int multiplier) {}
}
public void testMultiplication() {
       Dollar five = new Dollar(5);
       five.times(2);
       assertEquals(10, five.amount);
    }