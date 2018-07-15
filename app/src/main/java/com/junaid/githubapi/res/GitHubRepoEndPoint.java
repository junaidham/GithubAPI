package com.junaid.githubapi.res;

import com.junaid.githubapi.model.GitHubRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

//user_repositories_url": "https://api.github.com/users/{user}/repos{?type,page,per_page,sort}",


public interface GitHubRepoEndPoint {

    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> getRepo(@Path("user") String name);

}


