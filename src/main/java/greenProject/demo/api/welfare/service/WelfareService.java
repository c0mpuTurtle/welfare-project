package greenProject.demo.api.welfare.service;

import greenProject.demo.db.entity.Welfare;
import greenProject.demo.db.repository.WelfareRepository;
import greenProject.demo.enums.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WelfareService {

    private final WelfareRepository welfareRepository;

    // 일반 카테고리 조회
    public List<Welfare> getWelfaresByCategory(Category category) {
        return welfareRepository.findByCategory(category);
    }

    // 💡 대출 항목 자동 분류
    public Map<String, List<Welfare>> getLoansGroupedByName() {
        List<Welfare> loans = welfareRepository.findByCategory(Category.LIVING_SUPPORT);

        return loans.stream()
                .collect(Collectors.groupingBy(w -> {
                    String name = Optional.ofNullable(w.getName()).orElse("").toLowerCase();

                    if (name.contains("학자금")) {
                        return "학자금 대출";
                    } else if (name.contains("전세") || name.contains("월세") || name.contains("집")) {
                        return "주거 대출";
                    } else {
                        return "기타";
                    }
                }, LinkedHashMap::new, Collectors.toList()));
    }
}
