import groovy.json.JsonSlurper

class JFortune {

    String[] fortunes

    void loadFortunes(String resourceName) throws IOException {
        String jsonStr = getClass().getResourceAsStream(resourceName).text
        this.fortunes = new JsonSlurper().parseText(jsonStr)
    }

    String getFortune() {
        fortunes.first()
    }

    static void main(String[] args) {
        def jfortune = new JFortune()
        jfortune.loadFortunes("/fortunes.json")
        def fortune = jfortune.fortune
        println(fortune)
    }
}
