/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Rifaul06
 */
public class Maskapai {
    private int idMaskapai;
    private double harga_bis;
    private double harga_eko;
    private String nama;
    private Jadwal jadwal = new Jadwal();
    private String waktuDeparture;
    private String waktuDestination;

    public Maskapai() {
    }

    public int getIdMaskapai() {
        return idMaskapai;
    }

    public void setIdMaskapai(int idMaskapai) {
        this.idMaskapai = idMaskapai;
    }

    public double getHarga_bis() {
        return harga_bis;
    }

    public void setHarga_bis(double harga_bis) {
        this.harga_bis = harga_bis;
    }

    public double getHarga_eko() {
        return harga_eko;
    }

    public void setHarga_eko(double harga_eko) {
        this.harga_eko = harga_eko;
    }
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Jadwal getJadwal() {
        return jadwal;
    }

    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }

    public String getWaktuDeparture() {
        return waktuDeparture;
    }

    public void setWaktuDeparture(String waktuDeparture) {
        this.waktuDeparture = waktuDeparture;
    }

    public String getWaktuDestination() {
        return waktuDestination;
    }

    public void setWaktuDestination(String waktuDestination) {
        this.waktuDestination = waktuDestination;
    }
    
    public Maskapai getById(int id){
        Maskapai m = new Maskapai();
        ResultSet rs = DBHelper.SelectQuery("SELECT * FROM maskapai m LEFT JOIN jadwal j"
                + " ON m.idjadwal = j.idjadwal "
                + " WHERE idmaskapai = '"+id+"'");
        try {
            while (rs.next()) {                
                m = new Maskapai();
                m.setIdMaskapai(rs.getInt("idmaskapai"));
                m.getJadwal().setIdjadwal(rs.getInt("idjadwal"));
                m.getJadwal().setDepature(rs.getString("departure"));
                m.getJadwal().setDestination(rs.getString("destination"));
                m.getJadwal().setDeparturedate(rs.getString("Departure_date"));
                m.setNama(rs.getString("nama_maskapai"));
                m.setWaktuDeparture(String.valueOf(rs.getTime("waktu_departure")));
                m.setWaktuDestination(String.valueOf(rs.getTime("waktu_destination")));
                m.setHarga_bis(rs.getInt("harga_bis"));
                m.setHarga_eko(rs.getInt("harga_eko"));
          
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return m;
    }
    public ArrayList<Maskapai> getAll(){
        ArrayList<Maskapai> ListMaskapai = new ArrayList();
        ResultSet rs = DBHelper.SelectQuery("SELECT * FROM maskapai m LEFT JOIN jadwal j ON m.idjadwal = j.idjadwal");
        try {
            while (rs.next()) {                
                Maskapai m = new Maskapai();
                m.setIdMaskapai(rs.getInt("idmaskapai"));
                m.getJadwal().setIdjadwal(rs.getInt("idjadwal"));
                m.getJadwal().setDepature(rs.getString("departure"));
                m.getJadwal().setDestination(rs.getString("destination"));
                m.getJadwal().setDeparturedate(rs.getString("Departure_date"));
                m.setNama(rs.getString("nama_maskapai"));
                m.setWaktuDeparture(String.valueOf(rs.getTime("waktu_departure")));
                m.setWaktuDestination(String.valueOf(rs.getTime("waktu_destination")));
                m.setHarga_bis(rs.getInt("harga_bis"));
                m.setHarga_eko(rs.getInt("harga_eko"));
                ListMaskapai.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListMaskapai;
    }
    public void save(){
        if (getById(idMaskapai).getIdMaskapai() == 0) {
            String SQL = "INSERT INTO maskapai(idjadwal, nama_maskapai, waktu_departure, waktu_destination, harga_bis, harga_eko) VALUES("
                    + " '"+this.getJadwal().getIdjadwal()+"',"
                    + " '"+this.nama+"',"
                    + " '"+this.waktuDeparture+"',"
                    + " '"+this.waktuDestination+"',"
                    + " '"+this.harga_bis+"',"
                    + " '"+this.harga_eko+"'"
                    + ")";
            this.idMaskapai = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE maskapai SET"
                    + " idjadwal = '"+this.getJadwal().getIdjadwal()+"',"
                    + " nama_maskapai = '"+this.nama+"',"
                    + " waktu_departure = '"+this.waktuDeparture+"',"
                    + " waktu_destination = '"+this.waktuDestination+"',"
                    + " harga_bis = '"+this.harga_bis+"',"
                    + " harga_eko = '"+this.harga_eko+"'"
                    + " WHERE idmaskapai = '"+this.idMaskapai+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQL = "DELETE FROM maskapai WHERE idmaskapai = '"+this.idMaskapai+"'";
        DBHelper.executeQuery(SQL);
    }
    public String toString(){
        return this.nama;
    }
}
