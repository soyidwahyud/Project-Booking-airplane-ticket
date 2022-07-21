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
public class Jadwal {
    private int idjadwal;
    private String depature;
    private String destination;
    private String departuredate;

    public Jadwal() {
    }

    public int getIdjadwal() {
        return idjadwal;
    }

    public void setIdjadwal(int idjadwal) {
        this.idjadwal = idjadwal;
    }

    public String getDepature() {
        return depature;
    }

    public void setDepature(String depature) {
        this.depature = depature;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparturedate() {
        return departuredate;
    }

    public void setDeparturedate(String departuredate) {
        this.departuredate = departuredate;
    }
    
    public Jadwal getById(int id){
        Jadwal j = new Jadwal();
        ResultSet rs = DBHelper.SelectQuery("SELECT * FROM jadwal "
                + " WHERE idjadwal = '"+id+"'");
        try {
            while (rs.next()) {
                j = new Jadwal();
                j.setIdjadwal(rs.getInt("idjadwal"));
                j.setDepature(rs.getString("departure"));
                j.setDestination(rs.getString("destination"));
                j.setDeparturedate(rs.getString("departure_date"));               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return j;
    }
    public ArrayList<Jadwal> getAll(){
        ArrayList<Jadwal> ListJadwal = new ArrayList<>();
        ResultSet rs = DBHelper.SelectQuery("SELECT * FROM jadwal ");
        try {
            while (rs.next()) {
                Jadwal j = new Jadwal();
                j.setIdjadwal(rs.getInt("idjadwal"));
                j.setDepature(rs.getString("departure"));
                j.setDestination(rs.getString("destination"));
                j.setDeparturedate(rs.getString("departure_date"));
                ListJadwal.add(j);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListJadwal;
    }
    public void delete(){
        String SQL = "DELETE FROM jadwal WHERE idjadwal = '"+this.idjadwal+"'";
        DBHelper.executeQuery(SQL);
    }
    public void save(){
        if (getById(this.idjadwal).getIdjadwal() == 0) {
            String SQL = "INSERT INTO jadwal(departure,destination,Departure_date) VALUES ("
                    + " '"+this.depature+"',"
                    + " '"+this.destination+"',"
                    + " '"+this.departuredate+"'"
                    + ")";
            this.idjadwal = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE jadwal SET "
                    + " departure = '"+this.depature+"',"
                    + " destination = '"+this.destination+"',"
                    + " Destination_date = '"+this.departuredate+"'"
                    + " WHERE idjadwal = '"+this.idjadwal+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    @Override
    public String toString(){
        return this.destination;
    }
}
