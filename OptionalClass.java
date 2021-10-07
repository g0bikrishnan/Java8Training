package optional;

import java.util.Optional;

public class OptionalClass {
    Optional<String> opt;

    public OptionalClass() {
    }

    public void getFullname(String fname, String lname) {
        opt=Optional.ofNullable(fname);
        if (opt.isPresent()) {
            System.out.println(fname + " " + lname);
        }else {
            System.out.println("first name can't be empty");

        }
    }

    public static void main(String[] args) {
        OptionalClass op = new OptionalClass();
        String fname = null,lname;
        lname="Krishnan";
      op.getFullname(null,lname);
    }
}
