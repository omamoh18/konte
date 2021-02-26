package pgr301.konte.Konteeksamen;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@RestController
public class DemoController {

    @GetMapping(path = "/", produces = "text/html")
    public String hello() throws IOException {
        FileInputStream in = new FileInputStream("index.html");
        return (new String(in.readAllBytes()));
    }
}