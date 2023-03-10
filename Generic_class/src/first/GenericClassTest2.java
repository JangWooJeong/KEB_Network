package first;

class Dp<K, V>{
    private K name;
    private V grade;

    public Dp(K name, V grade) {
        this.name = name;
        this.grade = grade;
    }

    public K getName() {
        return name;
    }

    public V getGrade() {
        return grade;
    }
}
public class GenericClassTest2 {
    public static void main(String[] args) {
        Dp<String, String> s1 = new Dp<>("한호열", "상병");
        System.out.println(s1.getName() + "의 계급은 " + s1.getGrade() + "입니다");
        Dp<String, Integer> s2 = new Dp<>("한호열", 3);
        System.out.println(s2.getName() + "의 계급은 " + s2.getGrade() + "입니다");
    }
    
}
