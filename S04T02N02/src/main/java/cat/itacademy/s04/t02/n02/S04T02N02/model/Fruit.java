package cat.itacademy.s04.t02.n02.S04T02N02.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fruits")
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long quantity;

    public Fruit(){

    }

    public Fruit (String name , Long quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public Fruit(Long id, String name, Long quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Fruit: " + name + "\n" +
                "Id: " + id + "\n" +
                "Quantity: " + quantity;
    }
}
