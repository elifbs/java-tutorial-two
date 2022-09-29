package javaegitimiodev2;

public class main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();		
		
	System.out.println("****************");
	
	//CLASS KONUSU:
		
	CustomerManager customerManager;
	CustomerManager customerManager2 = new CustomerManager();
	customerManager = customerManager2;
	customerManager.add();
	customerManager.remove();
	customerManager.update();
		
	System.out.println("****************");
	
	//DEĞER VE REFERANS TİPLERİ:
	
	int sayi1 = 10;
	int sayi2 = 20;
	sayi2 = sayi1;
	sayi1 = 30;
	System.out.println(sayi2);
	
	int[] sayilar1 = {1,2,3};
	int[] sayilar2 = {4,5,6};
	sayilar2 = sayilar1;
	sayilar1[0] = 10;
	System.out.println(sayilar2[0]);
	
	System.out.println("****************");
	
	//DEMO : DÖRT İŞLEM
	
	DortIslem dortislem = new DortIslem();
	int sonuc = dortislem.Topla(666, 444, 1);
	System.out.println(sonuc);
	
	System.out.println("****************");
	
	//FİELD VE ATTRİBUTE:
	
	 Product product = new Product(1, "Laptop", "Lenovo Laptop",8000,100,"blue");
	 /*product.setId(1);
	 product.setName("Laptop");
	 product.setDescription("Lenovo Laptop");
	 product.setPrice(8000);
	 product.setStockAmount(100);
	 product.setRenk("blue");*/
	
	 
	 ProductManager productManager = new ProductManager();
	 productManager.Add(product);
	 System.out.println(product.getKod());
	
	
	
	}
	
	public static void sayiBulmaca() {
		
		int[] rakamlar = new int[] {1,2,5,7,9,0};
		int aranacak = 1;
		boolean varMi = false;
		
		for (int rakam : rakamlar){
			if (rakam == aranacak){
				varMi = true;
				break;
			}			
		}		
		if (varMi){
			mesajVer("Rakam mevcuttur.");
		}else {
			mesajVer("Rakam mevcut değildir.");
		}
		
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
