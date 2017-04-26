public class JFortune {

    public String getFortune() {
        return "42";
    }

    public static void main(String[] args) {
        JFortune jfortune = new JFortune();
        String fortune = jfortune.getFortune();
        System.out.println(fortune);
    }
}
