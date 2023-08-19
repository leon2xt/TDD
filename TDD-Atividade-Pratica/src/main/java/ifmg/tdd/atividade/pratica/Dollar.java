/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifmg.tdd.atividade.pratica;

/**
 *
 * @author Leon
 */
class Dollar {

    private amount ;

    Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multiplier) {
        amount = amount * multiplier;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
    String currency() {
       return "USD";
    }
    
}
class Dollar extends Money {
   private String currency;
	
Dollar(int amount, String currency)  {
      super(amount, currency);
   }
	
   Money times(int multiplier)  {
      return Money.dollar(amount * multiplier);
   }
}
