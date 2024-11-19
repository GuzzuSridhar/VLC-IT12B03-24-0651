package basics;

public class PrintInColors {
    public static void main(String[] args) {

        // text colors
        System.out.println("\u001B[30m" + "This is in Black" + "\u001B[0m");
        System.out.println("\u001B[31m" + "This is in Red" + "\u001B[0m");
        System.out.println("\u001B[32m" + "This is in Green" + "\u001B[0m");
        System.out.println("\u001B[33m" + "This is in Yellow" + "\u001B[0m");
        System.out.println("\u001B[34m" + "This is in Blue" + "\u001B[0m");
        System.out.println("\u001B[35m" + "This is in Purple" + "\u001B[0m");
        System.out.println("\u001B[36m" + "This is in Cyan" + "\u001B[0m");
        System.out.println("\u001B[37m" + "This is in White" + "\u001B[0m");

        // background colors
        System.out.println("\u001B[40m" + "This is in Black background" + "\u001B[0m");
        System.out.println("\u001B[41m" + "This is in Red background" + "\u001B[0m");
        System.out.println("\u001B[42m" + "This is in Green background" + "\u001B[0m");
        System.out.println("\u001B[43m" + "This is in Yellow background" + "\u001B[0m");
        System.out.println("\u001B[44m" + "This is in Blue background" + "\u001B[0m");
        System.out.println("\u001B[45m" + "This is in Purple background" + "\u001B[0m");
        System.out.println("\u001B[46m" + "This is in Cyan background" + "\u001B[0m");
        System.out.println("\u001B[47m" + "This is in White background" + "\u001B[0m");

        // combination
        System.out.println("\u001B[44m" + "\u001B[37m" + "This is in Black background" + "\u001B[0m");

        // Format Text
        System.out.println("\u001b[1m" + "This is in bold" + "\u001B[0m");
        System.out.println("\u001b[3m" + "This is italics" + "\u001B[0m");
        System.out.println("\u001b[4m" + "This is underlined" + "\u001B[0m");

    }
}
