/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ControllerBuah;

/**
 *
 * @author asus
 */
class proses {
    public Double njumlahbayar(String inputHarga, String inputJumlahBeli){
        Integer hargaBuah = Integer.valueOf(inputHarga);
        Double jumlahBeli = Double.valueOf(inputJumlahBeli);

        Double jumlahBayar = hargaBuah * jumlahBeli;
        return jumlahBayar;
    }
    
    public String ndiskon (Double jumlahBayar){
        String diskon = null;
        
        if (jumlahBayar < 16000){
            diskon = "0%";
        }
        else if (jumlahBayar >= 16000 && jumlahBayar <= 25000){
            diskon = "10%";
        }
        else if (jumlahBayar > 25000){
            diskon = "15%";
        }
        
        return diskon;
    }
    
    public Double njumlahDiskon(Double jumlahBayar){
        Double jumlahDiskon = null;
        if (jumlahBayar < 16000){
            jumlahDiskon = jumlahBayar*0/100;
        }
        else if (jumlahBayar >= 16000 && jumlahBayar <= 25000){
            jumlahDiskon = jumlahBayar*10/100;
        }
        else if (jumlahBayar > 25000){
            jumlahDiskon = jumlahBayar*15/100;
        }

      return jumlahDiskon;  
    }
    
    public Double ntotalBayar(Double jumlahBayar){
        Double totalBayar = null;
         if (jumlahBayar < 16000){
            totalBayar = jumlahBayar - (jumlahBayar*0/100);
        }
        else if (jumlahBayar >= 16000 && jumlahBayar <= 25000){
            totalBayar = jumlahBayar - (jumlahBayar*10/100);
        }
        else if (jumlahBayar > 25000){
            totalBayar = jumlahBayar - (jumlahBayar*15/100);
        }
        return totalBayar;

    }
   
}
