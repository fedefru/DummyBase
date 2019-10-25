package Hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@Autowired
	DummyService service;
	DummyBase base;

	@GetMapping("/login")
	public String createUsuario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "login";
	}

	@PostMapping("/login")
	public String readUser(@ModelAttribute Usuario usuario) {

		if (service.getAtribute(usuario.getUser(), usuario.getPass())) {
			return "okLogin";
		} else {
			return "error";
		}

	}
}
