public class Person {
    private String id;
    private String nama;
    private String negara;
    private int tahunLahir;
    private String kategori;
    private String skillLevel;

    // konstruktor kosong
    public Person(){
    }

    // konstruktor
    public Person(String id, String nama, String negara, int tahunLahir, String kategori, String skillLevel){
        this.id = id;
        this.nama = nama;
        this.negara = negara;
        this.tahunLahir = tahunLahir;
        this.kategori = kategori;
        this.skillLevel = skillLevel;
    }

    // getter
    public String getId(){
        return id;
    }
    public String getNama(){
        return nama;
    }
    public String getNegara(){
        return negara;
    }
    public int getTahunLahir(){
        return tahunLahir;
    }
    public String getKategori(){
        return kategori;
    }
    public String getSkillLevel(){
        return skillLevel;
    }

    // setter
    public void setId(String id){
        this.id = id;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setTahunLahir(int tahunLahir){
        this.tahunLahir = tahunLahir;
    }
    public void setKategori(String kategori){
        this.kategori = kategori;
    }
    public void setSkillLevel(String skillLevel){
        this.skillLevel = skillLevel;
    }
}