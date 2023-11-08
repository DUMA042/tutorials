class Box {
    public Oranges getOranges() {
        return oranges;
    }

    public void setOrangesDeep(Oranges oranges) {
        this.oranges = oranges;
    }

    public void setOrangesShallow(Oranges oranges) {
        this.oranges.setOrangeNumbers(oranges.getOrangeNumbers());
    }

    private Oranges oranges;
    public Box(Oranges oranges){
        this.oranges=oranges;
    }

    public Box(Boxy boxy){
        oranges = boxy.oranges;
    }

}
