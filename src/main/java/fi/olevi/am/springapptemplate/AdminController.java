package fi.olevi.am.springapptemplate;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableMethodSecurity
@RequestMapping("/admin")
public class AdminController {

    @PreAuthorize("principal.claims.get('groups') != null && principal.claims.get('groups').contains('appTmplSpring')")
    @GetMapping("/index")
    public String getAdminIndex(Model model) {
        model.addAttribute("wau", "you are awesome");
        return "adminIndex";
    }

    @PreAuthorize("principal.claims.get('groups') != null && principal.claims.get('groups').contains('appTmplSpring')")
    @GetMapping("user")
    @ResponseBody
    public OidcUser getUser(@AuthenticationPrincipal OidcUser user) {
        return user;
    }

    
}
