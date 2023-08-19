/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifmg.tdd.atividade.pratica;

/**
 *
 * @author Leon
 */

class Money {

private String currency; 

  static Money dollar(int amount)  {
      return new Money(amount, "USD");
   }
    static Money franc(int amount) {
      return new Money(amount, "CHF");
   }
   Money(int amount, String currency) {
      this.amount = amount;
      this.currency = currency;
   }
   static Money dollar(int amount)  {
      return new Dollar(amount, "USD");
   }
	
   static Money franc(int amount) {
      return new Franc(amount, "CHF");
   }
    
   Money(int amount, String currency) {
      this.amount = amount;
      this.currency = currency;
   }
	
   public boolean equals(Object object) {
      Money money = (Money) object;
      return amount == money.amount && currency().equals(money.currency());
   }
	
   Money times(int multiplier) {
      return new Money(amount * multiplier, currency);
   }
}
