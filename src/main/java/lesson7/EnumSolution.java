package lesson7;

enum Color {
    Red,
    Yellow,
    Green
}
public class EnumSolution {
    public static void doSomething(Color color) {
        switch (color){
            case Red:
            case Green:
            case Yellow:
        }
    }

    public static void main(String[] args) {
        doSomething(Color.Red); //+
        doSomething(Color.Yellow); // +
        doSomething(Color.Green);//+
//        doSomething("YELLOW");// +-
//        doSomething("blue"); // -
//        doSomething("Yellow"); // -

    }
}
