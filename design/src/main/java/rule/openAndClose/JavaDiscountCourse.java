package rule.openAndClose;

public class JavaDiscountCourse extends JavvaCourse {
    public JavaDiscountCourse(Integer Id, String name, Double prise) {
        super(Id, name, prise);
    }
//    public Double getOriginPrice(){
//        return super.getPrice();
//    }// 这个是不对的不应该覆盖父类的方法应该设计改进的
    public Double getDiscountPrice(){
        return super.getPrice()*0.6;
    }
}
