package dev.smurf.results;

public class Err implements Result {
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Err) {
            return true;
        } else {
            return super.equals(obj);
        }
    }

    public static final Err ERR = new Err();
}
