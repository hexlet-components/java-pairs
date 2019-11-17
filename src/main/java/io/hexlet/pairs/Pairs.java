package io.hexlet.pairs;

public class Pairs {
    public static <T> PairType<T> cons(T value1, T value2) {
        return (name) -> {
            switch (name) {
                case CAR:
                    return value1;
                case CDR:
                    return value2;
                default:
                    throw new Error("Wrong command: '" + name + "'");
            }
        };
    }

    public static <T> T car(PairType<T> pair) {
        return pair.apply(Messages.CAR);
    }

    public static <T> T cdr(PairType<T> pair) {
        return pair.apply(Messages.CDR);
    }
}
