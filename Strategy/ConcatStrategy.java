class ConcatStrategy extends OperationStrategy{
    @Override
    public int execute(int a, int b) {
        return Integer.valueOf(String.valueOf(a)+b);
    }
}