public class Clothes {
    private String size;
    private String color;
    private String material;

    public Clothes(String size,String color,String material) {
        this.size = size;
        this.color = color;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMateril() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String willSizeFit(String inputSize){
        if
        (this.size.equalsIgnoreCase(inputSize)) {
            return "Цей розмір вам підходть:" + size;
        }
        else {
            return "Цей розмір вам не підходть:" + size;}

    }
}

