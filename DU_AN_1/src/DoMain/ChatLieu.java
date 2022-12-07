/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoMain;

/**
 *
 * @author Admin
 */
public class ChatLieu {

    private String MaChatLieu;
    private String TenChatLieu;

    public ChatLieu() {
    }

    public ChatLieu(String MaChatLieu, String TenChatLieu) {
        this.MaChatLieu = MaChatLieu;
        this.TenChatLieu = TenChatLieu;
    }

    public String getMaChatLieu() {
        return MaChatLieu;
    }

    public void setMaChatLieu(String MaChatLieu) {
        this.MaChatLieu = MaChatLieu;
    }

    public String getTenChatLieu() {
        return TenChatLieu;
    }

    public void setTenChatLieu(String TenChatLieu) {
        this.TenChatLieu = TenChatLieu;
    }

    @Override
    public String toString() {
        return "ViewModelChatLieu{" + "MaChatLieu=" + MaChatLieu + ", TenChatLieu=" + TenChatLieu + '}';
    }
    
        
}
