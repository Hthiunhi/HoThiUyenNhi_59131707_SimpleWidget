package nv.edu.ntu.uyennhi.hothiuyennhi_59131707_simplewidget;

import android.text.TextUtils;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Toast {
    private String Name;
    private String NS;
    private boolean GT;
    private ArrayList<String> SoThich;

    public Toast(){
        this.Name = "";
        this.NS ="";
        this.GT = true;
        this.SoThich = new ArrayList<>();
    }
    public void setName(String Name){
        this.Name = Name;
    }

    public void setNS(String NS){
        this.NS = NS;
    }

    public void setGT(boolean GT){
        this.GT = GT;
    }

    public void setSoThich(ArrayList<String> SoThich){
        this.SoThich = SoThich;
    }

    public void DSSoThich (String ST){
        SoThich.add(ST);
    }

    @NonNull
    @Override
    public String toString() {
            return   Name + '\n' +
                    "Ngày sinh: " + NS + '\n' +
                    "Giới tính: " + (GT ? "Nam" : "Nữ") + '\n' +
                    "Sở thích: " + TextUtils.join("; ", SoThich);
    }
}
