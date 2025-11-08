package greenProject.demo.api.welfare.controller;

import greenProject.demo.api.welfare.service.WelfareService;
import greenProject.demo.db.entity.Welfare;
import greenProject.demo.enums.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class WelfareController {

    private final WelfareService welfareService;

    @GetMapping("/main")
    public String mainPage() {
        return "welfare-main";
    }

    // 💰 도약 계좌
    @GetMapping("/support/savings")
    public String savingsPage(Model model) {
        List<Welfare> welfares = welfareService.getWelfaresByCategory(Category.FINANCE);
        model.addAttribute("title", "도약 계좌");
        model.addAttribute("welfares", welfares);
        return "support-savings";
    }

    // 🎓 장학금
    @GetMapping("/support/scholarship")
    public String scholarshipPage(Model model) {
        List<Welfare> welfares = welfareService.getWelfaresByCategory(Category.EDUCATION);
        model.addAttribute("title", "장학금");
        model.addAttribute("welfares", welfares);
        return "support-scholarship";
    }

    // 🏦 대출
    @GetMapping("/support/loan")
    public String loanPage(Model model) {
        Map<String, List<Welfare>> groupedLoans = welfareService.getLoansGroupedByName();
        model.addAttribute("title", "대출");
        model.addAttribute("groupedLoans", groupedLoans);
        return "support-loan";
    }

    // 🏠 주거
    @GetMapping("/support/housing")
    public String housingPage(Model model) {
        List<Welfare> welfares = welfareService.getWelfaresByCategory(Category.HOUSING);
        model.addAttribute("title", "주거");
        model.addAttribute("welfares", welfares);
        return "support-housing";
    }

    // 🚌 교통
    @GetMapping("/support/transport")
    public String transportPage(Model model) {
        List<Welfare> welfares = welfareService.getWelfaresByCategory(Category.CULTURE_LEISURE);
        model.addAttribute("title", "교통");
        model.addAttribute("welfares", welfares);
        return "support-transport";
    }

    // 💼 근로
    @GetMapping("/support/work")
    public String workPage(Model model) {
        List<Welfare> welfares = welfareService.getWelfaresByCategory(Category.JOB);
        model.addAttribute("title", "근로");
        model.addAttribute("welfares", welfares);
        return "support-work";
    }

    // 💆‍♀️ 정신건강
    @GetMapping("/support/mental")
    public String mentalPage(Model model) {
        List<Welfare> welfares = welfareService.getWelfaresByCategory(Category.CARE_PROTECTION);
        model.addAttribute("title", "정신건강");
        model.addAttribute("welfares", welfares);
        return "support-mental";
    }
}
