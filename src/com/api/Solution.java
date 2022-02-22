package com.api;

import java.io.IOException;
import java.util.List;

public class Solution {

	public static void main(String[] args) throws IOException {

		List<String> result = UserDao.getUsernames(10);

		result.forEach(r -> {
			System.out.println(r);
		});
	}

}
