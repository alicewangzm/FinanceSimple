# FinanceSimple

Interested in cracking into Finance? Our FinanceSimple app targets girls from 10-15 to get a grasp on simple financial concept like stock market and time value of money. Let's start explore now!

API & Back-End Development: Mingyu Liu & Zimeng Wang
UI & Orginial Image Design: Lingqi Ren

## Inspiration
When I was young, I was always amazed by the stock charts and I wondered how those lines full of twists and turns could actually lead to financial opportunities. I was looking forward to a chance to learn about finance and actually apply it in my real life. 

As I research into this area, I also notice that many females are scared by the numbers and seemingly complicated math in the financial world. As many finance lessons are hard to understand and boring, I also believe that we lack interactive approaches to educate the younger population and expose them to the basics of finance. 

This is how we come up with the idea of FinanceSimple —— an app that can allow young people to learn finance easily, apply the concepts, and see the power of finance.

## What it does
The app is a perfect platform to inspire teenagers and young adults to learn about finance and actually have the opportunity to apply financial knowledge in a virtual setting. 

On the main page of the app there are well-designed lessons which guide you into the financial world. In each of the lessons, besides a video and text explaining the concepts, the user will also get the chance to work through a set of practice questions to enhance their understandings. By watching the videos and working through the problems, the user will be rewarded Finan Dollars, which act as the virtual currency in our platform. To add more fun and interactions to the study process, we've also created Kahoot competitions which every teenager loves! In addition, for those who are really ambitious, there is a challenge related to each lesson where the users need to think hard and apply hard in a more complex setting to earn addition Finan Dollars. 

We know that working through video lessons can be boring and we know that the most significant part of learning finance is actually to be able to apply the concepts in real life. That's the idea behind how we come up with the second module, which is a virtual market. Considering the stock market might be too complex and overwhelming for a 10-year-old to start with, we decide to create a virtual barn market to trade grocery items. The prices vary every day and users will be able to use their Finan Dollars to buy and sell the items. This virtual market can let the users experience the usefulness of finance in real lives and help them develop the habit of applying financial knowledge to save and invest. 

We notice that the environmental issue is also something that teenagers should be exposed to. So in our app, we allow users to plant trees using their Finan Dollars. In the future, we would be planting actual trees for the users! This functionality can remind people to act environmentally friendly in their daily lives.

There is also a profile page on the app where the users can modify their names, profile pictures, and see their Finan Dollars as well as local and global rankings. 

## How I built it
We built the Android application in Java and XML using Android Studio. The user interface was designed using Figma. We used Google Sign in API to allow users to sign in. 

## Challenges I ran into
It is easy to teach students who have related backgrounds about finance, but it is a bit harder to let teenagers with no prior knowledge be interested in finance. Hence, it took us a lot of time to design the gaming system. We adapt to a situation that everyone may encounter in daily life, shopping. In addition, the concept that allows the system to work is also simple: "One buys at a low price and sells at a high price." In this case, teenagers whose ages are between 10 - 15 will be more likely to be attracted by this game and they will learn some knowledge when they complete tasks in the game. 

Then another problem arises: How to keep motivating them to learn from lessons and experiences? The coins they have earned must have some meaning, which mimics the buying power in the real world. Thus, we develop the "Forest" panel in this app to allow them to use their coins to plant trees. Besides the sense of accomplishment, it also reminds teenagers to realizes the importance of protecting our environment.

Initially, we were planning to use firebase platform for multiple sign-in options. However, we ran into issues with implementation. Then we decided to allow only Gmail sign in. We will migrate into using firebase system in the future so multiple sign-in options will be allowed as well as the accounts will be better monitored. 

## Accomplishments that I'm proud of
We are really proud to come up with this social entrepreneurial idea to support young girls in the finance/fintech industries. We believe, with this early exposure to the industry, more and more girls will be interested in numbers and be willing to step into this industry! 

## What I learned
We learned how to use google sign in methods, collaborating online, and more insights on building android app! It was also the first time for us trying to build the user interface using Figma. 

## What's next for FinanceSimple
For demonstration purposes and because we don't have the video lessons recorded right now, we've hardcoded one of the video lessons to show the user interface. In the future, we would store the videos and text descriptions in a database to pull from. In addition to that, we will also cover more FinTech materials. As the target user group of our app expands, we could actually create a virtual stock market instead of a barn market. We would be using different APIs such as blockchain API transferring tokens to mimic the real stock market and give users the opportunities to practice their skills in a way similar to what they do in real lives. We could work with other interactive study platforms besides Kahoot to make our lessons more attractive and interactive. Lastly, we would seek partners and sponsors so that we could plant real trees for the users to further reinforce the significance of environmentally friendly actions. 

