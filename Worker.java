public class Worker {
    int exp;
    String post;
    String name;

    Worker(int exp, String post, String name) {
        this.exp = exp;
        this.post = post;
        this.name = name;
    }

    void getInfo() {
        System.out.println(name + " has " + exp + " years of experience as a " + post);
    }
}