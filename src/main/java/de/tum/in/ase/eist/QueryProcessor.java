package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class QueryProcessor {
    // Comment //psd
    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "Til";
        } else if (query.contains("plus")) {
            String[] params = query.split(" ");
            int sum = 0;
            for (String s : params) {
                try {
                    int n = Integer.parseInt(s);
                    sum += n;

                } catch (NumberFormatException e) {
                    //
                }
            }
            return String.valueOf(sum);
        }
        return "";
    }
}
