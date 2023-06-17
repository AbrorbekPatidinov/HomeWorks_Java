import org.json.JSONArray;
import org.json.JSONObject;

public class second_seminar {
    public static void main(String[] args) {
        // First task
        String json = "{\"name\":\"Ivanov\",\"country\":\"Russia\",\"city\":\"Moscow\",\"age\":\"null\"}";
        JSONObject filter = new JSONObject(json);

        StringBuilder whereClause = new StringBuilder();
        for (String key : filter.keySet()) {
            String value = filter.getString(key);
            if (!"null".equals(value)) {
                whereClause.append(key).append("=").append(value).append(" ");
            }
        }
        String result = "select * from students where " + whereClause.toString().trim().replaceAll(", $", "");
        System.out.println(result);

        // Second task
        String json_clone = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        JSONArray list = new JSONArray(json_clone);
        for (int i = 0; i < list.length(); i++) {
            JSONObject object = list.getJSONObject(i);
            StringBuilder stringBuilder = new StringBuilder("Студент ")
                    .append(object.getString("фамилия"))
                    .append(" получил ")
                    .append(object.getString("оценка"))
                    .append(" по предмету ")
                    .append(object.getString("предмет"))
                    .append(".");
            System.out.println(stringBuilder);
        }

        // Task with '*'

        // Средствами String
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "a";
        }
        long start = System.currentTimeMillis();
        str = str.replaceAll("a", "A");
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + " ms");

        // Средствами StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("a");
        }
        start = System.currentTimeMillis();
        for (int i = 0; i < stringBuilder.length(); i++) {
            stringBuilder.setCharAt(i, 'A');
        } 
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + " ms");
    }
}
