package nv.edu.ntu.uyennhi.hothiuyennhi_59131707_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editName, SoThich;
    EditText editNS;
    RadioGroup rdgGT;
    Button btnXN;
    CheckBox checkCook, checkHome, checkCafe, chechNhac, checkPhim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvents();
    }

    @SuppressLint("WrongViewCast")
    private void addView(){
        editName = findViewById(R.id.editName);
        editNS = findViewById(R.id.editNS);
        rdgGT = findViewById(R.id.rdgGT);
        btnXN = findViewById(R.id.btnXN);
        SoThich = findViewById(R.id.edtSoThich);
        checkCafe = findViewById(R.id.checkCafe);
        checkCook = findViewById(R.id.checkCook);
        checkHome = findViewById(R.id.checkHome);
        checkPhim = findViewById(R.id.checkPhim);
        chechNhac = findViewById(R.id.checkNhac);

    }

    private void addEvents(){
        btnXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HienThi();
            }
        });
    }

    private void HienThi(){
        String Name = editName.getText().toString();
        String GT = "";
        String NS = editNS.getText().toString();
        switch (rdgGT.getCheckedRadioButtonId()){
            case R.id.radioNam:
                GT = "Nam";
                break;
            case R.id.radioNu:
                GT = "Nu";
                break;
        }
        String edtSoThich ="";
        boolean cafe = checkCafe.isChecked();
        if(cafe == true)
            edtSoThich += "Đi cafe với bạn bè " ;
        boolean home = checkHome.isChecked();
        if(home == true)
            edtSoThich += "Ở nhà một mình";
        boolean XP = checkPhim.isChecked();
        if(XP == true)
            edtSoThich += "Xem phim";
        boolean VaoBep = checkCook.isChecked();
        if(VaoBep == true)
            edtSoThich += "Vào bếp nấu ăn";
        boolean NgheNhac = chechNhac.isChecked();
        if(NgheNhac == true)
            edtSoThich += "Nghe nhac";
        String edtSothich = SoThich.getText().toString();
        Toast.makeText(getApplicationContext(), Name + "\n Ngày Sinh: " + NS +"\n Giới Tính" + GT + "\n Sở Thích" +
                edtSoThich + edtSoThich, Toast.LENGTH_SHORT).show();

    }
}
