package violationsSampleClasses;

import static java.lang.Integer.*;    //violates forbid Static import rule

public class ViolationSamples {

    public void lon() { }  //violates rule method name length > 3

    public void tooLongMethod() {    //violates rule method length <= 5 lines

        String tooLongLine = "This line is too loooooooooooooooooooooooooooooooooooooooooooong";

    }
}
