import java.util.Optional;

public class optional {

    public static void main(String[] args) {
        // Optional <String> s1=Optional.ofNullable(null);
     

        Optional<String> s=Optional.empty();

        String name=s.orElse("Srinivas");
        System.out.println(name);
    }
}

// of will not allow null values  ...
// of nullable it will allow null values if vlaue is null returns Optional.empty  ...
//empty returns empty optional ...
//orElse we can set default value  ...
// empty returns a optional values
//is empty returns true if value is exsists
//is present returns true if value is exsists