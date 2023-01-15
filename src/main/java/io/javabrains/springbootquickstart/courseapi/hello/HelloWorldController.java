package io.javabrains.springbootquickstart.courseapi.hello;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

// @GetMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET)
// @GetMapping is the newer annotation
//
// Both supports consumes
// Consume options are:
//     consumes = "text/plain"
//     consumes = {
//         "text/plain",
//         "application/*"
//     }
//
// @GetMapping can be applied only on method level
// @RequestMapping can be applied on class level and method level
//
// @RequestMapping default value for method is RequestMethod.GET
// @RequestMapping, @GetMapping, etc. default parameter is value

@RestController
@RequestMapping("/")
public class HelloWorldController {

    // public boolean useTrailingSlashMatch()
    // Whether to match to URLs irrespective of the presence of a trailing slash
    //
    // @Deprecated(since="6.0")
    // public void setUseTrailingSlashMatch(boolean useTrailingSlashMatch)
    // If enabled a method mapped to "/users" also matches to "/users/"
    // The default value is true
    //
    // Trailing slash is not inserted in Spring Boot application
    // It only does that in the case of the contextRoot which in a Spring Boot application is usually /, so going to
    // http://localhost:8080 will redirect to http://localhost:8080/
    // Since setUseTrailingSlashMatch() is deprecated, configure redirect views as a list

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

    // /welcome* -> anything in THIS folder or URL section, that starts with "/welcome" and ends before next "/" like
    // /welcomePage
    //
    // /welcome** -> any URL, that starts with "/welcome" including sub-folders and subsections of URL pattern like
    // /welcome/section2/section3/ or /welcomePage/index
    //
    // /welcome/* -> any file, folder or section inside welcome (before next "/") like /welcome/index
    //
    // /welcome/** -> any files, folders, sections, sub-folders or subsections inside welcome
    //
    // One asterisk * ends before next "/", two asterisks ** have no limits

    @GetMapping("/bye*")
    private String sayBye1() {
        System.out.println("bye*");
        return "Good Bye 1!";
    }

    @GetMapping("/bye/*")
    private String sayBye2() {
        System.out.println("bye/*");
        return "Good Bye 2!";
    }

    @GetMapping("/bye/**")
    private String sayBye3() {
        System.out.println("/bye/**");
        return "Good Bye 3!";
    }

    @GetMapping("/bye*/*/test/**")
    private String sayBye4() {
        System.out.println("bye/*/test/**");
        return "Good Bye 4!";
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

    // Redirect requests using method 1
    @RequestMapping(value = {"", "/", "/redirect", "/redirect/"}, method = RequestMethod.GET)
    public void redirectRequest(HttpServletResponse httpServletResponse) {
        System.out.println("redirect hello");
        httpServletResponse.setHeader("Location", "/hello");
        httpServletResponse.setStatus(302);
    }

    // Redirect requests using method 2
    @RequestMapping(value = {"/redirect1", "/redirect1/"}, method = RequestMethod.GET)
    public ModelAndView redirectRequest1() {
        System.out.println("redirect 1 hello");
        return new ModelAndView("redirect:" + "/hello");
    }

    // DOES NOT WORK
    // Redirect requests using method 3
    @RequestMapping(value = {"/redirect2", "/redirect2/"}, method = RequestMethod.GET)
    public String redirectRequest2() {
        System.out.println("redirect 2 hello");
        return "redirect:" + "/hello";
    }

    // Redirect requests using method 1 with wildcard characters to redirect all other undefined URL routes
    @RequestMapping(value = "/**", method = RequestMethod.GET)
    public void redirectAll(HttpServletResponse httpServletResponse) {
        System.out.println("redirect all");
        httpServletResponse.setHeader("Location", "/hi");
        httpServletResponse.setStatus(302);
    }

}
