package moshi.factory.simpleFactory;

public class CourseFactory {
    public ICourse create(Class<? extends ICourse> clazz){
        try{
            if(null!=clazz){
                return clazz.newInstance();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
