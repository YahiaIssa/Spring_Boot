package Java102;

public class Tweet {

    private String tweet_id;
    private String tweet_massage;

    public Tweet(String tid, String massage) {
        this.tweet_id = tid;
        this.tweet_massage = massage;
        System.out.println("@" + this.tweet_id + "   " + this.tweet_massage);
    }

    public void newTweet(String tid, String massage) {
        this.tweet_id = tid;
        this.tweet_massage = massage;
        System.out.println("@" + this.tweet_id + "   " + this.tweet_massage);
    }

    public void Reply(String tid, String tmassage) {
        this.tweet_massage = tmassage;
        System.out.println("@"+this.tweet_id+" "+ tid+" "+this.tweet_massage);
    }

    public void Retweet(String rtid, String tmessage) {
        this.tweet_massage = tmessage;
        System.out.println("Rt"+this.tweet_id+" "+ rtid+" "+this.tweet_massage);

    }
}
