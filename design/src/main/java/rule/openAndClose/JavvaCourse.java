package rule.openAndClose;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JavvaCourse implements ICourse{
    private Integer Id;
    private String name;
    private Double prise;
    public Integer getId() {
        return this.Id;
    }
    public String getName() {
        return this.name;
    }
    public Double getPrice() {
        return this.prise;
    }
}
