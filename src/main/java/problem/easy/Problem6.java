package problem.easy;

import java.util.ArrayList;
import java.util.List;

public class Problem6 {

    /**
     * 주어진 정수 리스트에서 중복된 값을 제거하고 유일한 값들만 포함하는 리스트를 반환합니다.
     *
     * @param numbers 원본 정수 리스트
     * @return 중복 없는 정수 리스트
     */
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        List<Integer> list = new ArrayList<>();
        numbers.stream()
                .filter(s -> !list.contains(s))
                .map(s->list.add(s))
                .toList();
        return list;
        //distinct.toList() 도 가능
    }
}