/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Kucing extends Hewan {
    private String ras;

    /**
     * @return the ras
     */
    public String getRas() {
        return ras;
    }

    /**
     * @param ras the ras to set
     */
    public void setRas(String ras) {
        this.ras = ras;
    }
    
    public String tips(){
        String desc="";
        if(getRas().equals("Bengal")){
            desc = "1. Berikan Makanan Kaya Nutrisi \n"
                    + "2. Perhatikan Kebersihan Bulunya\n"
                    + "3. Kebersihan Telinga, Mata, dan Gigi\n"
                    + "4. Berikan Mainan\n"
                    + "5. Ajak Bermain\n"
                    + "6. Beri ruang yang luas untuk menghindari\n"
                    + "   Stress\n"
                    + "Sumber: www.halodoc.com";
        }else if(getRas().equals("Persia")){
            desc = "1. Melakukan Grooming\n"
                    + "2. Bersihkan Mata dan Telinga\n"
                    + "3. Memotong Kuku & Sikat Gigi\n"
                    + "4. Vaksin\n"
                    + "5. Sterilisasi\n"
                    + "6. Perhatikan Nutrisi\n"
                    + "7. Air Minum Bersih\n"
                    + "Sumber : www.orami.co.id";
        }
        return desc;
    }
}
