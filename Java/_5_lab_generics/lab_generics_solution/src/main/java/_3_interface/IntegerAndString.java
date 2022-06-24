package _3_interface;


public class IntegerAndString implements GenericInterface<Integer, String> {
    @Override
    public String doSomeOperations(Integer integer) {
        return integer.toString();
    }

    @Override
    public Integer doReverseOperations(String s) {
        return Integer.parseInt(s);
    }
}
