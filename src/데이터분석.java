import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class 데이터분석 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        Map<String, Integer> colOrder = new HashMap<>();
        colOrder.put("code", 0);
        colOrder.put("date", 1);
        colOrder.put("maximum", 2);
        colOrder.put("remain", 3);
        
        int[][] filteredData = Arrays.stream(data).filter(x -> x[colOrder.get(ext)] < val_ext).toArray(int[][]::new);
        Arrays.sort(filteredData, Comparator.comparingInt(o -> o[colOrder.get(sort_by)]));

        return filteredData;
    }
}