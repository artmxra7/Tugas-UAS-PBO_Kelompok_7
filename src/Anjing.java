/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Anjing extends Hewan {
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
        if(getRas().equals("Retriever")){
            desc = "1.Harus Ada Cukup Ruang \n"
                    + "2.Bersiaplah untuk Rutin Membersihkan Bulu\n"
                    + "3.Jangan Meninggalkan Anjing Golden \n"
                    + "  Retriever Sendirian\n"
                    + "4.Sediakan Mainan untuk Anjing \n"
                    + "  Golden Mengunyah\n"
                    + "5.Beri Latihan Rutin untuk Menyalurkan Energi\n"
                    + "Sumber: www.halodoc.com";
        }else if(getRas().equals("Bulldog")){
            desc = "1. Bersihkan Anjing Dengan Teliti\n"
                    + "2. Pastikan Kandang Dan Tempat Makan Bersih\n"
                    + "3. Periksa Ke Dokter Jika Perlu\n"
                    + "4. Berikan Makanan Bernutrisi Lengkap\n"
                    + "5. Grooming Di Waktu Yang Tepat\n"
                    + "6. Sikat Gigi Dengan Rutin\n"
                    + "7. Bersihkan Telinga Anjing Bulldog Secara Rutin\n"
                    + "Sumber : bagi-in.com";
        }
        return desc;
    }
}
