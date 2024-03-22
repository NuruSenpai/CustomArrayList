import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
        CustomArrayList<Integer> customList = new CustomArrayList<>();
        customList.add(1);
        customList.add(2);
        customList.add(3);
        customList.remove(1);
        System.out.println(customList.size());
        System.out.println(customList.get(0));
        ArrayList<Integer> qwe = new ArrayList<>();
        qwe.add(3);
        System.out.println(qwe.contains(3));
    }
}