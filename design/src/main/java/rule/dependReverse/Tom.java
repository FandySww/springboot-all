package rule.dependReverse;

public class Tom {
    private ICourse iCourse;
    public void setCourse(ICourse iCourse){
        this.iCourse = iCourse;
    }
    public void study(){
        iCourse.study();
    }
}
