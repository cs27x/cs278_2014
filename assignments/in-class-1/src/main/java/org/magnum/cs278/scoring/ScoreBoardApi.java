package org.magnum.cs278.scoring;

import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import retrofit.http.Path;

public interface ScoreBoardApi {

	@FormUrlEncoded
	@POST("/asgn/in-class/1/student/{student}/completed")
	public String completed(@Path("student") String student, @Field("step") int step);
	
}
