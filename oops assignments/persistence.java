

import java.util.Set;
import java.awt.Color;
import java.util.Date;
import java.util.HashSet;

public class persistence {
    private Long id; // identifier

    private Date birthdate;
    private Color color;
    private char sex;
    private float weight;
    private int litterId;

    private persistence mother;
    private Set<persistence> kittens = new HashSet<persistence>();

    public Long getId() {
        return id;
    }

    void setBirthdate(Date date) {
        birthdate = date;
    }
    public Date getBirthdate() {
        return birthdate;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }
    public float getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }
    void setColor(Color color) {
        this.color = color;
    }

    void setSex(char sex) {
        this.sex=sex;
    }
    public char getSex() {
        return sex;
    }

    void setLitterId(int id) {
        this.litterId = id;
    }
    public int getLitterId() {
        return litterId;
    }

    void setMother(persistence mother) {
        this.mother = mother;
    }
    public persistence getMother() {
        return mother;
    }
    void setKittens(Set<persistence> kittens) {
        this.kittens = kittens;
    }
    public Set<persistence> getKittens() {
        return kittens;
    }
    
    // addKitten not needed by Hibernate
    public void addKitten(persistence kitten) {
    	kitten.setMother(this);
	kitten.setLitterId( kittens.size() ); 
        kittens.add(kitten);
    }
}
