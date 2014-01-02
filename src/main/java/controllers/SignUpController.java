package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SignUpController {

    @ModelAttribute("signUpForm")
    private SignUpForm getSignUpForm() {
        return new SignUpForm();
    }

    @RequestMapping(value = "/signUp", method = RequestMethod.GET)
    public String signUpForm(SignUpForm signUpForm) {
        return "signUp/form";
    }

    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public String signUp(SignUpForm signUpForm, BindingResult bindingResult, ModelMap model) {
        model.addAttribute("email", signUpForm.getEmail());
        return "signUp/form";
    }
}
