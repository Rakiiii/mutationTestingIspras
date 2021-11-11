package dev.smurf.results;

public class Ok implements Result {
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Ok) {
            return true;
        } else {
            return super.equals(obj);
        }
    }

    public static final Ok OK = new Ok();
}
