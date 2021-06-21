package br.com.simao.jogoGourmet.model;

public class Meal {

    private Meal left;
    private Meal right;
    private String value;

    public Meal(String value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public Boolean isMealLeaf() {
        return (this.left == null);
    }

    public Meal getLeft() {
        return left;
    }

    public void setLeft(Meal left) {
        this.left = left;
    }

    public Meal getRight() {
        return right;
    }

    public void setRight(Meal right) {
        this.right = right;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
