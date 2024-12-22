/*Assignment 2 Creating a product class*/

class Product
{
    private int pid;
    private String pbrand;
    private double pprice;
    private String ptype;
    
    public  void setId(int pid)
    {
        this.pid= pid;
    }
    public int getpId()
    {
        return pid;
    }
    
    public  void setBrand(String pbrand)
    {
        this.pbrand= pbrand;
    }
    public String getpBrand()
    {
        return pbrand;
    }
    
    public  void setPrice(double pprice)
    {
        this.pprice= pprice;
    }
    public double getPrice()
    {
        return pprice;
    }
    
    public  void setType(String ptype)
    {
        this.ptype= ptype;
    }
    public String getpType()
    {
        return ptype;
    }
}

class Demo
{
public static void main(String args[]){
    Product p1 = new Product();
    p1.setId(101);
    System.out.println(p1.getpId());
    p1.setBrand("Patanjali");
    
    System.out.println(p1.getPrice ());
    p1.setType ("biscuit");
    System.out.println(p1.getpType ());
    }
}