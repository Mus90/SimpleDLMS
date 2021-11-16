import java.io.*;
public class ManageDl
    {
        public static void main(String[] args) throws IOException {

            Process process = Runtime.getRuntime().exec("pwd");
            printResults(process);
		// Extract and add data, db and public_html folders inside simpledl-java/src/main/java/
            System.out.println("****** importing ********");
            Process importProcess = Runtime.getRuntime().exec("perl src/main/java/simpledl/bin/import.pl");
            printResults(importProcess);

            System.out.println("****** indexing ********");
            Process indexProcess = Runtime.getRuntime().exec("perl src/main/java/simpledl/bin/index.pl");
            printResults(indexProcess);

            System.out.println("****** generating ********");
            Process generateProcess = Runtime.getRuntime().exec("perl src/main/java/simpledl/bin/generate.pl --website --force");
            printResults(generateProcess);

            System.out.println("****** generating ********");
            Process generateProcessAll = Runtime.getRuntime().exec("perl src/main/java/simpledl/bin/generate.pl --all");
            printResults(generateProcessAll);

        }
        public static void printResults(Process process) throws IOException {
            StringBuilder builder = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append("\n");
                System.out.println(line);
            }
        }
    }
