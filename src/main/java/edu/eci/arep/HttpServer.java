package edu.eci.arep;

import static spark.Spark.*;
import spark.Request;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import edu.eci.arep.Controller;

public class HttpServer {

    /**
     * Metodo que inicia el servidor
     *
     * @param args
     */
    public static void main(String[] args) {
        port(getPort());
        System.out.println("Server started on port: " + getPort());
        staticFiles.location("/static");

        Controller controller = new Controller();

        get("/hello", (req, res) -> "Hello World");

        get("/hello/:name", (req, res) -> {
            res.type("application/json");
            return "(\"name\"; \"" + req.params(":name") + "\")";
        });

        get("/samplehtml", (req, res) -> {
            res.type("text/html");
            return controller.body("sample", "html");
        });

        get("/samplecss", (req, res) -> {
            res.type("text/css");
            return controller.body("sample", "css");
        });

        get("/samplejs", (req, res) -> {
            res.type("text/javascript");
            return controller.body("sample", "js");
        });

        get("/samplepng", (req, res) -> {
            res.type("image/png");
            return new BufferedReader(new FileReader("src/main/resources/static/files/eci.png")).readLine();
        });

    }

    /**
     * Metodo que obtiene el puerto
     *
     * @return
     */
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 35000;
    }
}
