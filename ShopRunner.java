class ShopRunner{

public static void main(String[]args){

System.out.println("Running Start");

String itemseq="shoes";
double priceseq=2000;
String brandseq="puma";
Shop.buy(itemseq,priceseq,brandseq);

String itemseq1="Flif Flops";
String brandseq1="puma";
Shop.exchange(itemseq1,brandseq1);



System.out.println("Running ends");

} 




}
