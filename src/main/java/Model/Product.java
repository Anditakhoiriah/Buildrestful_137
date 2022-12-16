/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Product {
    private String id;
    private String name;
    private int price;
    private Double diskon;
    private Double totalharga;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
      public int getPrice() {
        return price ;
    }
      
    public void setPrice(int price) {
        this.price = price;
    }
    
          public Double getDiskon() {
        return diskon ;
    }
      
    public void setDiskon(Double diskon) {
        this.diskon = diskon;
    }

    public Double getTotalharga() {
        return totalharga;
    }

    public void setTotalharga(Double totalharga) {
        this.totalharga = totalharga;
    }
    
}
