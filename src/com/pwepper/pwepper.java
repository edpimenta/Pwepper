package com.pwepper;

import twitter4j.PagableResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.conf.ConfigurationBuilder;

public class Pwepper {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// Filled auto-generated method stub
		long people = 0;
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("njvydaA8JHdLzSU4aiYyw")
		  .setOAuthConsumerSecret("ecgEjl6LoljJva74WGknIoPN42pln4cwmdsF4Efp44")
		  .setOAuthAccessToken("25489798-4ExR3eQqaaUfq5bU0umYZDrqz7QPxBPWaot481bRn")
		  .setOAuthAccessTokenSecret("lZ1pJ5m8TRYY4GsAI8WC0g1FNISArq2zQXWz0e68BRg");
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		
        try {
            //Twitter twitter = new TwitterFactory().getInstance();
            User user = twitter.verifyCredentials();
            PagableResponseList following;
            System.out.println("Successfully verified credentials of " + user.getScreenName());
            while (people < 2001){
            	following = twitter.getFollowersList(people, people);
            	            }
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to verify credentials: " + te.getMessage());
            System.exit(-1);
        }

	}
}
