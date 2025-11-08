package greenProject.demo.api.welfare.controller;

import ch.qos.logback.core.model.Model;
import greenProject.demo.api.welfare.service.WelfareService;
import greenProject.demo.db.entity.Welfare;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WelfareController {

    private final WelfareService welfareService;

    @GetMapping("/main")
    public String mainPage() {
        return "welfare-main";
    }

    @GetMapping("/savings")
    public String savingsPage(Model model) {
        List<Welfare> welfares = welfareService.getWelfaresByCategory(Category.SAVINGS);
        model.addAttribute("title", "도약 계좌");
        model.addAttribute("welfares", welfares);
        return "support-savings"; // 템플릿 이름
    }
}
