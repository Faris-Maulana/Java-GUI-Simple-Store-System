/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author maula
 */

class PlanPenjualan extends Penjualan {
    private String username;
    private String password;
    
    @Override
    public int calculator(){
        int total=0;
        double pajak=0;
        int bayar=0;
        pajak = total * 0.03;
        bayar = (int) (total + pajak);
        return bayar; 
    }
    
    public String id(String username, String password){
        this.username= username;
        this.password= password;
        return password;
    }
    public void setUsername(String user){
        username=user;
    }
    public void setPassword(String pass){
        password=pass;
    }
    }
