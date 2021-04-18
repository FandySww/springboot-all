package moshi.mobanfangfa;

/**
 * @Author fandayong
 * @Date 2021/4/18 4:47 PM
 * @description
 */
public abstract class NetworkCourse {
    protected final void createCourse(){
      this.postPreResource();
      this.createPPT();
      this.liveVideo();
      this.postNote();
      this.postPreResource();
      if(needHomework()){
          checkHomework();
      }
    }
    abstract void checkHomework();
    protected boolean needHomework(){
        return false;
    };
    final void postSource(){
        System.out.println("提交源码");
    }

    final void postNote(){
        System.out.println("提交课件和笔记");
    }

    final void liveVideo(){
        System.out.println("直播授课");
    }

    final void createPPT(){
        System.out.println("创建备课ppt");
    }

    final void postPreResource(){
        System.out.println("分发预习资料");
    }
}
