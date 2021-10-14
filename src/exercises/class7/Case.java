package exercises.class7;

import java.util.ArrayList;
import java.util.Arrays;

public class Case {
    private ArrayList<Flavor> flavors = new ArrayList<>();
    private ArrayList<Cone> cones = new ArrayList<>();
    private ArrayList<Toppings> toppings = new ArrayList<>();

    public Case() {
        Cone cone1 = new Cone("Waffle", 2.99, new ArrayList<>(Arrays.asList("gluten", "eggs")));
        Cone cone2 = new Cone("Sugar", 2.49, new ArrayList<>(Arrays.asList("gluten")));
        Cone cone3 = new Cone("Wafer", 2.25, new ArrayList<>(Arrays.asList("gluten")));
        Cone cone4 = new Cone("Bowl", 2.25, new ArrayList<>(Arrays.asList("none")));
        cones.add(cone1);
        cones.add(cone2);
        cones.add(cone3);
        cones.add(cone4);

        Flavor flavor1 = new Flavor("Vanilla", 0.99, new ArrayList<>(Arrays.asList("dairy")));
        Flavor flavor2 = new Flavor("Chocolate", 0.99, new ArrayList<>(Arrays.asList("dairy")));
        Flavor flavor3 = new Flavor("Red Velvet", 1.49, new ArrayList<>(Arrays.asList("dairy", "red #5")));
        Flavor flavor4 = new Flavor("Rocky Road", 1.49, new ArrayList<>(Arrays.asList("dairy", "nuts", "gelatin")));
        Flavor flavor5 = new Flavor("Strawberry Sorbet", 0.99, new ArrayList<>(Arrays.asList("strawberry")));
        flavors.add(flavor1);
        flavors.add(flavor2);
        flavors.add(flavor3);
        flavors.add(flavor4);
        flavors.add(flavor5);

        Toppings topping1 = new Toppings("Whipped Cream", 0.49, new ArrayList<>(Arrays.asList("dairy")));
        Toppings topping2 = new Toppings("Hot Fudge", .99, new ArrayList<>(Arrays.asList("dairy")));
        Toppings topping3 = new Toppings("Rainbow Jimmies", 0.25, new ArrayList<>(Arrays.asList("dairy", "gelatin", "red #5")));
        toppings.add(topping1);
        toppings.add(topping2);
        toppings.add(topping3);



    }

    public ArrayList<Flavor> getFlavors() {
        return flavors;
    }

    public void setFlavors(ArrayList<Flavor> flavors) {
        this.flavors = flavors;
    }

    public ArrayList<Cone> getCones() {
        return cones;
    }

    public void setCones(ArrayList<Cone> cones) {
        this.cones = cones;
    }

    public ArrayList<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<Toppings> toppings) {
        this.toppings = toppings;
    }
}
