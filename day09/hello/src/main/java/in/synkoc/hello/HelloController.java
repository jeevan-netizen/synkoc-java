package in.synkoc.hello;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public record HelloResponse(String message) {}
    public record TimeResponse(String date, String time, String zone) {}

    @GetMapping("/hello")
    public String hello() {
        return "Hello from SYNKOC!";
    }

    @GetMapping("/api/hello")
    public HelloResponse apiHello() {
        return new HelloResponse("Hello from SYNKOC!");
    }

    @GetMapping("/api/time")
    public TimeResponse apiTime() {
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        return new TimeResponse(
            now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")),
            now.format(DateTimeFormatter.ofPattern("HH:mm:ss")),
            "Asia/Kolkata"
        );
    }
}
