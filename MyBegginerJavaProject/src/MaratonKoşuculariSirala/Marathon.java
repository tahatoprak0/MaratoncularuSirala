package MaratonKoşuculariSirala;

public class Marathon {
    public static void main(String[] args) {

        String[] isimler = {"Kadir", "Gökhan", "Hakan", "Suzan", "Pınar", "Mehmet",
                "Ali", "Emel", "Fırat", "James", "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak"};
        int[] zamanlar = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};
        MarathonKosusu myMarathonkosusu=new MarathonKosusu(isimler,zamanlar);

        myMarathonkosusu.yazdir();
        myMarathonkosusu.siniflandir();


    }

}

class MarathonKosusu{
    private String[] isimler;
    private int[] zamanlar;

    public MarathonKosusu(String[] isimlerArray, int[] zamanlarArray) {
        isimler = isimlerArray;
        zamanlar = zamanlarArray;
    }

    public int getBirinciKosucu(){
        int min=zamanlar[0];
        int index=0;
        for (int i=0;i<zamanlar.length;i++){
            if (zamanlar[i]<min){
                min=zamanlar[i];
                index=i;
            }
        }
        return index;
    }

    public int getİkinciKosucu(){
        int min2=zamanlar[0];
        int index=0;
        for (int i=0;i<zamanlar.length;i++){
            if (i==getBirinciKosucu()){
                continue;
            } if (zamanlar[i]<min2){
                min2=zamanlar[i];
                index=i;
            }
        }
        return index;

    }

    public int getUcuncuKosucu(){

        int min3=zamanlar[0];
        int index=0;
        for (int i=0;i<zamanlar.length;i++){
            if (i==getBirinciKosucu() || i==getİkinciKosucu()){
                continue;
            }if (zamanlar[i]<min3){
                min3=zamanlar[i];
                index=i;
            }
        }
        return index;
    }

    public void yazdir(){
        System.out.println("Birinci : "+isimler[getBirinciKosucu()]+" "+zamanlar[getBirinciKosucu()]+"'");
        System.out.println("İkinci : "+isimler[getİkinciKosucu()]+" "+zamanlar[getİkinciKosucu()]+"'");
        System.out.println("Üçüncü : "+isimler[getUcuncuKosucu()]+" "+zamanlar[getUcuncuKosucu()]+"'");
    }

    public void siniflandir(){
        int A=0;
        int B=0;
        int C=0;
        for (int i=0;i< zamanlar.length;i++){
            if (zamanlar[i]<=299){
                A++;
            }else if(zamanlar[i]>299 &&zamanlar[i]<=399){
                B++;
            }else C++;
        }
        System.out.println("A-->"+A);
        System.out.println("B-->"+B);
        System.out.println("C-->"+C);
    }
}