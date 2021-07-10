import tweepy
import datetime

auth = tweepy.OAuthHandler("A", "B")
auth.set_access_token("C", "D")

api = tweepy.API(auth)

try:
    api.verify_credentials()
    print("Authentication OK")
except:
    print("Error during authentication")


timeline = api.home_timeline()
for tweet in timeline:
    print(f"{tweet.user.name} said {tweet.text}")

#api.update_status("Tweet.." + str(datetime.datetime.now()))

print("Search for 'Houston Outlaws' in 10 most recent public tweets")
for tweet in api.search(q="Houston Outlaws", lang="pt", rpp=10):
    print(f"-- {tweet.user.name}:{tweet.text}")
    print("")