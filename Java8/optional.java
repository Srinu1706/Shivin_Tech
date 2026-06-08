import java.util.Optional;

public class optional {

    public static void main(String[] args) {
        Optional <String> s1=Optional.ofNullable(null);

        Optional<String> s=Optional.empty();

        String name=s.orElse("Default");
        System.out.println(name);
    }
}