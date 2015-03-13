package com.yangyize.phonemes;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zetze on 15/3/13.
 */
public class Dial extends MainActivity {
    private EditText phonenum_Txt;
    private Button dial_delete_Btn;
    private Button dial_more_Btn;
    private Map<Integer,Integer>map = new HashMap<Integer,Integer>();
    //private SoundPool spool;
    //private AudioManager am = null;

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone_num);

        listView= (ListView) findViewById(R.id.contactList);
        phonenum_Txt= (EditText) findViewById(R.id.phonenum_txt);
        dial_delete_Btn = (Button) findViewById(R.id.delete);
        dial_more_Btn = (Button)findViewById(R.id.phone_more);

        //Phone Number Text
        phonenum_Txt.setInputType(InputType.TYPE_NULL);//不显示软键盘
        phonenum_Txt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(null == s)
                dial_more_Btn.setVisibility(View.VISIBLE);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}
