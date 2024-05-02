import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        //Итоговый вывод - [33, 22]
        List<Data> dataList = List.of(new Data("22", "1"), new Data("11", "3"), new Data("33", "1"));
        List<Data> dataList1 = List.of(new Data("11", "3"), new Data("22", "3"), new Data("33", "2"));
        System.out.println(findData(dataList, dataList1));
    }

    public static Collection<String> findData(List<Data> data, List<Data> data2) {
        return Stream.concat(data.stream(), data2.stream())
                .collect(Collectors.groupingBy(d -> Arrays.asList(d.getCode(), d.getVersion())))
                .values().stream()
                .filter(d -> d.size() == 1)
                .flatMap(Collection::stream)
                .map(Data::getCode)
                .collect(Collectors.toSet());
    }


    public static class Data {
        String code;
        String version;

        public Data(String code, String version) {
            this.code = code;
            this.version = version;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        @Override
        public String toString() {
            return "Data{" + "code='" + code + '\'' + ", version='" + version + '\'' + '}';
        }
    }
}
