package yothio.fchat.ui.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import yothio.fchat.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // タイトルを非表示にします。
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        TextView textView1 = (TextView) findViewById(R.id.splash_text_view);
        ImageView imageView1 = (ImageView) findViewById(R.id.splash_image_view);
        AlphaAnimation alpha = new AlphaAnimation(
                0.0f, // 開始時の透明度（0は完全に透過）
                1.0f); // 終了時の透明度（1は全く透過しない）

        // 3000msかけて透過度を0から1に変更する
        alpha.setDuration(3000);
        textView1.startAnimation(alpha);
        imageView1.startAnimation(alpha);
        Handler hdl = new Handler();
        // 4000ms遅延させてsplashHandlerを実行します。
        hdl.postDelayed(new splashHandler(), 4000);
    }

    class splashHandler implements Runnable {
        public void run() {
            // スプラッシュ完了後に実行するActivityを指定します。
            Intent intent = new Intent(getApplication(), MainActivity.class);
            startActivity(intent);
            // SplashActivityを終了させます。
            SplashActivity.this.finish();
        }
    }
}
