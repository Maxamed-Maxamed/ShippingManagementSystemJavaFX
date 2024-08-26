package com.example.shippingmanagementsystem.model;



public class Container {
    private String id;
    private int size; // Size in feet, e.g., 10, 20, 40
    private LinkedList<Pallet> pallets;

    public Container(String id, int size) {
        this.id = id;
        this.size = size;
        this.pallets = new LinkedList<>();
    }

    public void addPallet(Pallet pallet) {
        // Check if adding the pallet exceeds container capacity
        double totalSize = 0;
        for (Pallet p : pallets) {
            totalSize += p.getTotalSize();
        }
        if (totalSize + pallet.getTotalSize() <= size * 8 * 8) { // 8 feet width and height assumed
            pallets.add(pallet);
        } else {
            throw new RuntimeException("Container capacity exceeded.");
        }
    }

    public void removePallet(Pallet pallet) {
        pallets.remove(pallet);
    }

    public LinkedList<Pallet> getPallets() {
        return pallets;
    }

    // Getters and Setters for id and size

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPallets(LinkedList<Pallet> pallets) {
        this.pallets = pallets;
    }

    @Override
    public String toString() {
        return "Container{" +
                "id='" + id + '\'' +
                ", size=" + size +
                ", pallets=" + pallets +
                '}';
    }
}
