public class Main {
    public static void main(String[] args) {
        Clothes sweater = new Clothes("s","white","poliester");
        Clothes clothes = new Clothes("M","red","cotton");
        System.out.println(clothes.willSizeFit("S"));
        System.out.println(clothes.willSizeFit("M"));
    }
}
