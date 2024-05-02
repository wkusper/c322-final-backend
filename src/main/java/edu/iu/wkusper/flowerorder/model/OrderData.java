package edu.iu.wkusper.flowerorder.model;


import edu.iu.wkusper.flowerorder.model.enums.Relationship;
import edu.iu.wkusper.flowerorder.model.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class OrderData {

    @GeneratedValue
    @Id
    private Long id;

    private String userid;

    private String flower_id;

    private String address;

    private String delivery_date;

    private String first_name;
    private String last_name;


    private Status status;
    private Relationship relationship;

    private Long price;


    public OrderData(String userid, String flower_id, String address, String delivery_date, String price,
                     String first_name, String last_name, String relationship) {

        this.userid = userid;
        this.flower_id = flower_id;
        this.address = address;
        this.delivery_date = delivery_date;
        this.price = Long.valueOf(price);
        this.first_name = first_name;
        this.last_name = last_name;
        this.relationship = Relationship.valueOf(relationship);
        this.status = Status.PENDING;

    }
    public OrderData(String userid, String flower_id, String address, String delivery_date, String price,
                     String first_name, String last_name, String relationship, String status, String user_id) {

        this.userid = userid;
        this.flower_id = flower_id;
        this.address = address;
        this.delivery_date = delivery_date;
        this.price = Long.valueOf(price);
        this.first_name = first_name;
        this.last_name = last_name;
        this.relationship = Relationship.valueOf(relationship);
        this.status = Status.PENDING;

        this.userid = user_id;

    }
    public OrderData(String userid, String flower_id, String address, String delivery_date, String price,
                     String first_name, String last_name, String relationship, String status) {

        this.userid = userid;
        this.flower_id = flower_id;
        this.address = address;
        this.delivery_date = delivery_date;
        this.price = Long.valueOf(price);
        this.first_name = first_name;
        this.last_name = last_name;
        this.relationship = Relationship.valueOf(relationship);
        this.status = Status.valueOf(status);

    }

    public OrderData() {

    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Relationship getRelationship() {
        return relationship;
    }

    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setFlower_id(String flower_id) {
        this.flower_id = flower_id;
    }


    public String getFlower_id() {
        return flower_id;
    }
    public String getId() {
        return userid;
    }


    public String getUserid() {
        return userid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(String deivery_date) {
        this.delivery_date = deivery_date;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
