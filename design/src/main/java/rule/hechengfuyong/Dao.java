package rule.hechengfuyong;

public class Dao {
    private DBConnection dbConnection;
    public void setDbConnection(DBConnection dbConnection){
        this.dbConnection = dbConnection;
    }
    public void add(){
        String conn = this.dbConnection.getConnection();
    }
}
