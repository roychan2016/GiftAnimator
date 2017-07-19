package xuwei.com.androidgiftanimate.page;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import xuwei.com.androidgiftanimate.R;
import xuwei.com.utils.StatusBarUtils;

public class MainActivity extends AppCompatActivity {
    private int[] giftIds = {
            R.id.gift_cake,
            R.id.gift_hua,
            R.id.gift_ice,
            R.id.gift_666,
            R.id.gift_keng
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StatusBarUtils.setTranslucentStatusBar(this);

        for(int i=0; i<giftIds.length; i++) {
            bindSendGiftButton(giftIds[i], i);
        }
    }

    private void bindSendGiftButton(int btnID, final int giftIndex) {
        findViewById(btnID).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "send Gift : " + giftIndex, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
