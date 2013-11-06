package io.shaka.some;

public class SomeIntegerBuilder implements SomeBuilder<Integer> {
    protected static SomeIntegerBuilder integer = new SomeIntegerBuilder(Integer.MIN_VALUE/2, Integer.MAX_VALUE/2);
    protected static SomeIntegerBuilder naturalNumber = new SomeIntegerBuilder(1, Integer.MAX_VALUE);
    private final int from;
    private final int to;


    private SomeIntegerBuilder(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public Integer build() {
        return from + random.nextInt(to - from);
    }

    public SomeIntegerBuilder from(int from) {
        return new SomeIntegerBuilder(from, to);
    }

    public SomeIntegerBuilder to(int to) {
        return new SomeIntegerBuilder(from, to);
    }


}



