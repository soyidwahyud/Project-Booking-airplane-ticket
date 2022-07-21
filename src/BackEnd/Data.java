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
public class Data {
    private int iddata;
    private String nama;
    private String nik;
    private int umur;
    private String notelp;
    private String alamat;

    public Data() {
    }

    public int getIddata() {
        return iddata;
    }

    public void setIddata(int iddata) {
        this.iddata = iddata;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public Data getById(int id) {
        Data d = new Data();
        ResultSet rs = DBHelper.SelectQuery("SELECT * FROM data "
                + "Where iddata ='"+id+"'");
        try {
            while (rs.next()) {   
                d = new Data();
                d.setIddata(rs.getInt("iddata"));
                d.setNama(rs.getString("nama"));
                d.setNik(rs.getString("NIK"));
                d.setUmur(rs.getInt("umur"));
                d.setNotelp(rs.getString("notelp"));
                d.setAlamat(rs.getString("alamat"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return d;
    }
    public ArrayList<Data> getAll() {
        ArrayList<Data> ListData = new ArrayList<>();
        ResultSet rs = DBHelper.SelectQuery("SELECT * FROM data");
        try {
            while (rs.next()) {   
                Data d = new Data();
                d.setIddata(rs.getInt("iddata"));
                d.setNama(rs.getString("nama"));
                d.setNik(rs.getString("NIK"));
                d.setUmur(rs.getInt("umur"));
                d.setNotelp(rs.getString("notelp"));
                d.setAlamat(rs.getString("alamat"));
                ListData.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListData;
    }
    public void save(){
        if (getById(iddata).getIddata() == 0) {
            String SQL = "INSERT INTO data(nama,NIK,umur,notelp,alamat) VALUES( "
                    + " '"+this.nama+"',"
                    + " '"+this.nik+"',"
                    + " '"+this.umur+"',"
                    + " '"+this.notelp+"',"
                    + " '"+this.alamat+"'"
                    + ")";
            this.iddata = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE data SET "
                    + " nama = '"+this.nama+"',"
                    + " NIK = '"+this.nik+"',"
                    + " umur = '"+this.umur+"',"
                    + " notelp = '"+this.notelp+"',"
                    + " alamat = '"+this.alamat+"' "
                    + " WHERE iddata = '"+this.iddata+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQL = "DELETE FROM data WHERE iddata = '"+this.iddata+"'";
        DBHelper.executeQuery(SQL);
    }
}
