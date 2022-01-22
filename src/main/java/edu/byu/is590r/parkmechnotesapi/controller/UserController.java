
package edu.byu.is590r.parkmechnotesapi.controller;

        import edu.byu.is590r.parkmechnotesapi.service.DummyUserService;
        import edu.byu.is590r.parkmechnotesapi.service.UserService;
        import lombok.AllArgsConstructor;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController
{
    UserService userService;

    @GetMapping("/user")
    public String getUser(@RequestParam String username)
    {
        var user = userService.getUsername(username);
        return user;
    }
}