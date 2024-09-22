package springiscoming.springiscoming.CatalogController;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
class TestController {
    @GetMapping("/demo")
    public String test() {
        return "test";
    }

    @GetMapping("/hello")
    ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @GetMapping("/age")
    ResponseEntity<String> age(
            @RequestParam("yearOfBirth") int yearOfBirth) {

        return new ResponseEntity<>(
                "Year of birth cannot be in the future",
                HttpStatus.BAD_REQUEST);

    }

    @GetMapping("/customHeader")
    ResponseEntity<String> customHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "foo");

        return new ResponseEntity<>(
                "Custom header set", headers, HttpStatus.OK);
    }
}
