package BoxItemTest;

public class Box {
    String itemName;
    int itemWeight = 0;

    public Box(String itemName, int boxWeight) {
        this.itemName = itemName;
        this.itemWeight = boxWeight;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(int itemWeight) {
        this.itemWeight = itemWeight;
    }
}
