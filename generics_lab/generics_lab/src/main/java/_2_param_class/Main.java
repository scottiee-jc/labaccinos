package _2_param_class;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("", 10);
        Pair<Integer, String> pair2 = new Pair<>(20, "");
        Pair<String, String> pair3 = new Pair<>("", "");

        System.out.println(pair1.getK() + pair1.getV());
        System.out.println(pair2.getK() + pair2.getV());
        System.out.println(pair3.getK() + pair3.getV());
    }
}
