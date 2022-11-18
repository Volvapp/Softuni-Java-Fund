import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, Integer> resultsMap = new LinkedHashMap<>();
        Map<String, Integer> submissionsMap = new LinkedHashMap<>();
        while (!command.equals("exam finished")) {

            String username = command.split("-")[0];
            String language = command.split("-")[1];

            if (language.equals("banned")) {
                resultsMap.remove(username);
                command = scanner.nextLine();
                continue;
            }
            int points = Integer.parseInt(command.split("-")[2]);
            if (!submissionsMap.containsKey(language)) {
                submissionsMap.put(language, 1);
            } else {
                submissionsMap.put(language, submissionsMap.get(language) + 1);
            }
            if (!resultsMap.containsKey(username)) {
                resultsMap.put(username, points);
            } else {
                int initialPoints = resultsMap.get(username);

                if (initialPoints < points) {
                    resultsMap.replace(username, points);
                }
            }


            command = scanner.nextLine();
        }
        System.out.println("Results:");
        resultsMap.entrySet().forEach(entry ->{
            System.out.printf("%s | %d%n",entry.getKey(), entry.getValue());

        });
        System.out.println("Submissions:");
        submissionsMap.entrySet().forEach(entry -> {
            System.out.printf("%s - %d%n",entry.getKey(),entry.getValue());
        });
    }
}