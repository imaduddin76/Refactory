package aim.helmi.myrefactory;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("/users")
    Call<List<User>> getUserData();
}

