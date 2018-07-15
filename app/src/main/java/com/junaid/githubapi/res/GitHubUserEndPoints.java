package com.junaid.githubapi.res;

import com.junaid.githubapi.model.GitHubUser;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

// https://api.github.com/users/junaidham
// method-> /users/junaidham
public interface GitHubUserEndPoints {

    @GET("/users/{user}")
    Call<GitHubUser> getUser(@Path("user") String user);
}



