package _3_generic_interface;

public class IntegerAndString implements GenericInterface<Integer, String> {

    @Override
    public String doSomeOperations(Integer integer) {
        return integer.toString();
    }

    @Override
    public Integer doReverseOperations(String s) {
        return Integer.parseInt(s);
        // parseInt parses a string arg as a decimal int
    }
}
