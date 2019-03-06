/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timothysnipes
 */
public class Customer {
  
   private int custID;
   private int orderSize;
  
      
   public Customer()
   {
       this.orderSize = (int)(1+25*Math.random());      
   }
  
   protected int getOrderSize()
   {
       return orderSize;
   }
  
   protected void redOrderSize()
   {
       this.orderSize=this.orderSize-3;
   }
  
   public int getCustID()
   {
       return custID;
   }
  

   public void setCustID(int custID)
   {
       this.custID = custID;
   }
  
}

