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
public class Booking {
    private int idBooking;
    private Data data = new Data();
    private Maskapai maskapai = new Maskapai();
    private String kodeKursi;
    private String kelas;
    private String status;
    private String tipePayment;
    private String noCredit;
    private double totalharga;
    public Booking() {       
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Maskapai getMaskapai() {
        return maskapai;
    }

    public void setMaskapai(Maskapai maskapai) {
        this.maskapai = maskapai;
    }
    
    
    public int getIdBooking() {
        return idBooking;
    }  
    
    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }
    
    public String getKodeKursi() {
        return kodeKursi;
    }

    public void setKodeKursi(String kodeKursi) {
        this.kodeKursi = kodeKursi;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalharga() {
        return totalharga;
    }

    public String getTipePayment() {
        return tipePayment;
    }

    public void setTipePayment(String tipePayment) {
        this.tipePayment = tipePayment;
    }

    public String getNoCredit() {
        return noCredit;
    }

    public void setNoCredit(String noCredit) {
        this.noCredit = noCredit;
    }

    public void setTotalharga(double totalharga) {
        this.totalharga = totalharga;
    }
    public Booking getById(int id){
        Booking k = new Booking();
        ResultSet rs = DBHelper.SelectQuery("SELECT * FROM data AS d "
                + " RIGHT JOIN booking AS b ON d.iddata = b.iddata "
                + " LEFT JOIN maskapai AS m ON b.idmaskapai = m.idmaskapai "
                + " LEFT JOIN jadwal AS j ON m.idjadwal = j.idjadwal "
                + " WHERE idbooking = '"+id+"'");
        try{
            while (rs.next()) {
                k = new Booking();
                // tabel data
                Data d = new Data();
                d.setIddata(rs.getInt("iddata"));
                d.setNama(rs.getString("nama"));
                d.setNik(rs.getString("NIK"));
                d.setUmur(rs.getInt("umur"));
                d.setNotelp(rs.getString("notelp"));
                d.setAlamat(rs.getString("alamat"));                
                Maskapai m = new Maskapai();
                m.setIdMaskapai(rs.getInt("idmaskapai"));
                m.setNama(rs.getString("nama_maskapai"));
                m.setWaktuDeparture(String.valueOf(rs.getTime("waktu_departure")));
                m.setWaktuDestination(String.valueOf(rs.getTime("waktu_destination")));
                m.setHarga_bis(rs.getInt("harga_bis"));
                m.setHarga_eko(rs.getInt("harga_eko"));
                m.getJadwal().setIdjadwal(rs.getInt("idjadwal"));
                m.getJadwal().setDepature(rs.getString("departure"));
                m.getJadwal().setDestination(rs.getString("destination"));
                m.getJadwal().setDeparturedate(rs.getString("Departure_date"));
                
                k.setMaskapai(m);
                k.setData(d);
                k.setIdBooking(rs.getInt("idbooking"));
                k.setKodeKursi(rs.getString("kodekursi"));
                k.setKelas(rs.getString("kelas"));
                k.setStatus(rs.getString("status"));
                k.setTotalharga(rs.getDouble("totalharga"));
                k.setTipePayment(rs.getString("tipe_payment"));
                k.setNoCredit(rs.getString("nocredit"));
                k.save();
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }
    public ArrayList<Booking> getAll(){
        ArrayList<Booking> List = new ArrayList();
        ResultSet rs = DBHelper.SelectQuery("SELECT * FROM data AS d "
                + " RIGHT JOIN booking AS b ON d.iddata = b.iddata "
                + " LEFT JOIN maskapai AS m ON b.idmaskapai = m.idmaskapai "
                + " LEFT JOIN jadwal AS j ON m.idjadwal = j.idjadwal ");
        try {
            while (rs.next()) {
                Booking k = new Booking();
                // tabel data
                Data d = new Data();
                d.setIddata(rs.getInt("iddata"));
                d.setNama(rs.getString("nama"));
                d.setNik(rs.getString("NIK"));
                d.setUmur(rs.getInt("umur"));
                d.setNotelp(rs.getString("notelp"));
                d.setAlamat(rs.getString("alamat"));
                
                Maskapai m = new Maskapai();
                m.setIdMaskapai(rs.getInt("idmaskapai"));
                m.setNama(rs.getString("nama_maskapai"));
                m.setWaktuDeparture(String.valueOf(rs.getTime("waktu_departure")));
                m.setWaktuDestination(String.valueOf(rs.getTime("waktu_destination")));
                m.setHarga_bis(rs.getInt("harga_bis"));
                m.setHarga_eko(rs.getInt("harga_eko"));
                m.getJadwal().setIdjadwal(rs.getInt("idjadwal"));
                m.getJadwal().setDepature(rs.getString("departure"));
                m.getJadwal().setDestination(rs.getString("destination"));
                m.getJadwal().setDeparturedate(rs.getString("Departure_date"));
                
                k.setMaskapai(m);
                k.setData(d);
                k.setIdBooking(rs.getInt("idbooking"));
                k.setKodeKursi(rs.getString("kodekursi"));
                k.setKelas(rs.getString("kelas"));
                k.setStatus(rs.getString("status"));
                k.setTotalharga(rs.getDouble("totalharga"));
                k.setTipePayment(rs.getString("tipe_payment"));
                k.setNoCredit(rs.getString("nocredit"));
                
                List.add(k);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return List;
    }
    public void save(){
        if (getById(idBooking).getIdBooking() == 0) {
            String SQL = "Insert INTO booking(iddata, idmaskapai, kodekursi, "
                    + "kelas, status, totalharga, tipe_payment, nocredit) VALUES("
                    + " '"+this.getData().getIddata()+"',"
                    + " '"+this.getMaskapai().getIdMaskapai()+"',"
                    + " '"+this.kodeKursi+"',"
                    + " '"+this.kelas+"',"
                    + " '"+this.status+"',"
                    + " '"+this.totalharga+"',"
                    + " '"+this.tipePayment+"',"
                    + " '"+this.noCredit+"'"
                    + ")";
            this.idBooking = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE booking SET "
                    + " iddata = '"+this.getData().getNama()+"',"
                    + " idmaskapai = '"+this.getMaskapai().getNama()+"',"
                    + " kodekursi = '"+this.kodeKursi+"',"
                    + " kelas = '"+this.kelas+"',"
                    + " status = '"+this.status+"',"
                    + " totalharga = '"+this.totalharga+"',"
                    + " tipe_payment = '"+this.tipePayment+"',"
                    + " nocredit = '"+this.noCredit+"' "
                    + " WHERE idbooking = '"+this.idBooking+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQL = "DELETE FROM booking WHERE idbooking = '"+this.idBooking+"'";
        DBHelper.executeQuery(SQL);
    }
}
