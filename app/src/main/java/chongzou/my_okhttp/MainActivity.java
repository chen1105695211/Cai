package chongzou.my_okhttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //创建okHttpClient对象
        OkHttpClient okHttpClient=new OkHttpClient();
        //创建一个Request
        final Request request = new Request.Builder().url("http://api.fang.anjuke.com/m/android/1.3/shouye/recInfosV3/?city_id=14&lat=40.04652&lng=116.306033&api_key=androidkey&sig=9317e9634b5fbc16078ab07abb6661c5&macid=45cd2478331b184ff0e15f29aaa89e3e&app=a-ajk&_pid=11738&o=PE-TL10-user+4.4.2+HuaweiPE-TL10+CHNC00B260+ota-rel-keys%2Crelease-keys&from=mobile&m=Android-PE-TL10&cv=9.5.1&cid=" +
                "14&i=864601026706713&v=4.4.2&qtime=20160411091603&pm=b61&uuid=1848c59c-185d-48d9-b0e9-782016041109&_chat_id=10").build();
        //new call
        com.squareup.okhttp.Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {

            }
            @Override
            public void onResponse(Response response) throws IOException {
                String string = response.body().string();

//                onResponse回调的参数是response，一般情况下，比如我们希望获得返回的字符串，
//                可以通过response.body().string()获取；如果希望获得返回的二进制字节数组，
//                 则调用response.body().bytes()；如果你想拿到返回的inputStream，
//                 则调用response.body().byteStream()

                Log.i("::::::::::::",string);
            }
        });
//        OkHttpClient client=new OkHttpClient();
//        FormEncodingBuilder builde=new FormEncodingBuilder();
//        builde.add("name", "陈攀");
//        final Request request=new Request.Builder().url("http://api.fang.anjuke.com/m/android/1.3/shouye/recInfosV3/?city_id=14&lat=40.04652&lng=116.306033&api_key=androidkey&sig=9317e9634b5fbc16078ab07abb6661c5&macid=45cd2478331b184ff0e15f29aaa89e3e&app=a-ajk&_pid=11738&o=PE-TL10-user+4.4.2+HuaweiPE-TL10+CHNC00B260+ota-rel-keys%2Crelease-keys&from=mobile&m=Android-PE-TL10&cv=9.5.1&cid=14&i=864601026706713&v=4.4.2&qtime=20160411091603&pm=b61&uuid=1848c59c-185d-48d9-b0e9-782016041109&_chat_id=10").post(builde.build()).build();
//        com.squareup.okhttp.Call call = client.newCall(request);
//        call.enqueue(new Callback() {
//            @Override
//            public void onFailure(Request request, IOException e) {
//
//            }
//
//            @Override
//            public void onResponse(Response response) throws IOException {
//                String string = response.body().string();
//                Log.i(":::::",string);
//            }
//        });

    }
}
