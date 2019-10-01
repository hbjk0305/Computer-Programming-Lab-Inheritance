package kiroong;

abstract public class Individual {
    private static int idCount = 0;

    int id;

    protected Individual() {
        id = idCount++;
    }

    protected int sortKey() {
        return 0;
    }

    abstract protected Individual clone();
}
