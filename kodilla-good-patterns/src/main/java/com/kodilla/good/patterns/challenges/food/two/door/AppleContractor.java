package com.kodilla.good.patterns.challenges.food.two.door;

public class AppleContractor implements Contractor {
    private String name;
    private String address;
    private String product;



    public AppleContractor(String name, String address, String product) {
        this.name = name;
        this.address = address;
        this.product = product;

    }


    public boolean process(Order orderInformation) {

            System.out.println("Contractor: " + orderInformation.getContractor().getName() +
                    " Address: " + orderInformation.getContractor().getAddress() +
                    " Product: " + orderInformation.getContractor().getProduct() + " Quantity: " + orderInformation.getQuantity());
            return true;



    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppleContractor that = (AppleContractor) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        return product != null ? product.equals(that.product) : that.product == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (product != null ? product.hashCode() : 0);
        return result;
    }
}
