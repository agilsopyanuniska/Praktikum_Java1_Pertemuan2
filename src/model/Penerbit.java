
package model;

public class Penerbit {
    private int id;
    private String penerbit;

    public Penerbit(int id, String penerbit) {
        this.id = id;
        this.penerbit = penerbit;
    }
    
    public Penerbit(){
        
    }
   
    public int getId() {
        return id;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
    public void viewdata(){
        System.out.println("ID Penerbit : " + id);
        System.out.println("Penerbit : " + penerbit);
    };
    
    
    
/*    public static void main(String[] args) {
        Penerbit penerbit1 = new Penerbit(1,"Ali bin Abi Thalib");
        
        penerbit1.viewdata();
        
        Penerbit penerbit2 = new Penerbit();
        
        penerbit2.setId(2);
        penerbit2.setPenerbit("Abdurrahman bin Auf");
        
        System.out.println("ID Penerbit : " + penerbit2.getId());
        System.out.println("Penerbit : " + penerbit2.getPenerbit());
        
    }  */
    
}

