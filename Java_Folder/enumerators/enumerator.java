enum Mobile{
    Apple(2000),Samsung(1500),Oneplus(1500),Redmi(1000);
    private int price;
    Mobile(int price){
        this.price=price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
class enumerator{
    public static void main(String args[]){
        Mobile m=Mobile.Apple;
        System.out.println(m+" : "+m.getPrice());

        //printing all

        for(Mobile i:Mobile.values()){
            System.out.println(i+" : "+i.getPrice());
        }
    }
}