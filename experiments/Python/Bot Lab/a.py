import tweepy
import datetime

auth = tweepy.OAuthHandler("mk9eDCeENRN0pBmTVP2l2ef7b", 
    "U0Bwq4DFLG2k2oqPyGXB7cWtKzVi8aSCUhCb2T23HFyiC2oWft")

auth.set_access_token("1403784108271099907-tMtsIb0EJu8q1emFNpTGnNAF2EnFJJ", 
    "sQjrfKKtxCxqSbpqWZC62X6jesHX23Tx8ypoBUx5CVM0n")

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