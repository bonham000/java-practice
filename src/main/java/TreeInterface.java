interface TreeInterface {
    String description = "This is a tree";
    public String getDescription();
    public boolean addValue(Integer value);
    public boolean removeValue(Integer value);
    public boolean containsValue(Integer value);
    public long size();
}
