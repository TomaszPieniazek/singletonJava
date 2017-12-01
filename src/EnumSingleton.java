public enum EnumSingleton {
    INSTANCE;
    private int number;
    private EnumSingleton(){
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
