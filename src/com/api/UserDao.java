package com.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class UserDao {

	public static List<String> getUsernames(int threshold) throws IOException {

		List<String> usernames = new ArrayList<String>();
		int page = 1;
		URL url = new URL("https://jsonmock.hackerrank.com/api/article_users?page=" + page);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("accept", "application/json");
		connection.setRequestProperty("Content-Type", "application/json; utf-8");
		connection.setDoOutput(true);

		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String inputLine;

		while ((inputLine = in.readLine()) != null) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			ResponseBuilder builder = gson.fromJson(inputLine, ResponseBuilder.class);
			List<User> users = builder.getData().stream().filter(f -> f.getSubmission_count() > threshold)
					.collect(Collectors.toList());
			List<String> filterredUserNames = users.stream().map(m -> m.getUsername()).collect(Collectors.toList());
			usernames.addAll(filterredUserNames);
		}
		in.close();
		return usernames;
	}
}
