package edu.iu.wkusper.flowerorder.model;


import edu.iu.wkusper.flowerorder.model.enums.Color;
import edu.iu.wkusper.flowerorder.model.enums.Occasion;
import edu.iu.wkusper.flowerorder.model.enums.Type;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Flower implements Comparable {
    @Id
    private String id;

    private Type type;

    private Occasion occasion;

    private Color color;

    private Long price;

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Occasion getOccasion() {
        return occasion;
    }

    public void setOccasion(Occasion occasion) {
        this.occasion = occasion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public Flower(String id, Type type, Occasion occasion, Color color, Long price) {
        this.id = id;
        this.type = type;
        this.occasion = occasion;
        this.color = color;
        this.price = price;
    }
    public Flower(String id, String type, String occasion, String color, String price) {
        this.id = id;
        this.type = Type.valueOf(type);
        this.occasion = Occasion.valueOf(occasion);
        this.color = Color.valueOf(color);
        this.price = Long.valueOf(price);
    }

    public Flower() {

    }


    @Override
    public int compareTo(Object o) {
        Flower other = (Flower) o;
        return other.getPrice().compareTo(this.getPrice());
    }
}
