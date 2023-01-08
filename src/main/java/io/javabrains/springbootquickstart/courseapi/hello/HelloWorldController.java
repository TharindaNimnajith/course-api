package io.javabrains.springbootquickstart.courseapi.hello;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping(value = {"/hello", "/hello/", "/welcome", "/welcome/"})
    private String sayHello() {
        System.out.println("hello");
        return "Hello World!";
    }

    @GetMapping("/bye")
    private String sayBye() {
        System.out.println("bye");
        return "Good Bye!";
    }

    @GetMapping(value = "/hi")
    private String sayHi() {
        System.out.println("hi");
        return "Hi!";
    }

    @RequestMapping("/api/sorry")
    private String saySorry() {
        System.out.println("sorry");
        return "Sorry!";
    }

    @RequestMapping(value = {"", "/", "/redirect", "/redirect/"}, method = RequestMethod.GET)
    public void redirectRequest(HttpServletResponse httpServletResponse) {
        System.out.println("redirect hello");
        httpServletResponse.setHeader("Location", "/hello");
        httpServletResponse.setStatus(302);
    }

    @RequestMapping(value = "/**", method = RequestMethod.GET)
    public void redirectAll(HttpServletResponse httpServletResponse) {
        System.out.println("redirect all");
        httpServletResponse.setHeader("Location", "/hi");
        httpServletResponse.setStatus(302);
    }

}
