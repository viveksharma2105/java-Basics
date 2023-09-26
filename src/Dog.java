class Dog {
    private String name;
    private int height;

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }


    public void setHeight(int h) {
        if (isHeightValid(h)) {
            height = h;
        }
        else{
            height = -1;
        }
    }

    public int getHeight() {
        return height;
    }

    public boolean isHeightValid (int h) {
        return ((h >= 10) && (h <= 100));
    }
}