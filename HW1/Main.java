package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        // Create an instance of the Pyramid class and call the Output method (see Pyramid.java for more info)

        // Create an instance of the Adlibs class and call the story method (see Adlibs.java for more info)

        // Create an instance of the Replace class and call the charReplace method (see Replace.java for more info)
        Pyramid.Output();
        Adlibs a = new Adlibs();
        String answer = a.story("Dylan", 19, "blue");
        System.out.println(answer);
        Replace b = new Replace();
        System.out.println(b.charReplace("ShamPow", 4, 'W'));

    }
}
