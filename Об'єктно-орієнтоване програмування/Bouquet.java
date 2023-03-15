class Flower{
    String NameOfFlower;
    double PriceOfFlower;
    String ColourOfFlower;
    public Flower(String NameOfFlower, String ColourOfFlower ,double PriceOfFlower){
        this.NameOfFlower=NameOfFlower;
        this.PriceOfFlower=PriceOfFlower;
        this.ColourOfFlower=ColourOfFlower;

    }
}



class Bouquet{
    double PriceOfBouquet=0;
    Flower Bouquet[];
    int index=0;
    public Bouquet(double PriceOfBouquet) {
        this.PriceOfBouquet = PriceOfBouquet;
    }
    void  addFlower(Flower Flower){
        if(index>Bouquet.length-1){
            System.out.println("No storage");
            return;
        }
        Bouquet[index++]=Flower;
        PriceOfBouquet+=Flower.PriceOfFlower;
    }
    public void GetPriceBouquet(){
        System.out.println(PriceOfBouquet);
    }
}





public class Main {
    public static void main(String Args[]){
        int i,sum=0;
        Flower Red_Rose=new Flower("Троянда","Червоний",75);
        Flower Chamomile=new Flower("Ромашка","Білий",40);
        Flower Orchid=new Flower("Орхідея","Фіолетовий",202);
        Bouquet bouquet=new Bouquet(3);
        bouquet.addFlower(Red_Rose);
        bouquet.addFlower(Chamomile);
        bouquet.addFlower(Orchid);
        bouquet.addFlower(new Flower("Weed","Green",10));
        bouquet.GetPriceBouquet();
    }
}
