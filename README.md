

# Grapevine

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
[Social media app for people to share their love for plants. Users will post pictures and document their plants. Users will be able to follow other profiles and/or plants.]

### App Evaluation
- **Category: Social Media**
- **Mobile: This app would be primarily developed for mobile.**
- **Story: People can view your profile and view collage of your plants and tap on them to see pictures of the progression of its growth over time.**
- **Market: Any individual could choose to use this app, and to keep it a safe environment, people would be organized into age groups.**
- **Habit: This app could be used as often or unoften as the user wanted depending on how deep their social life is, and what exactly they're looking for.**
- **Scope: User post their plants progress with tags like weather and location and they can view a map like in snapchat with their stories but instead with peoples plants nearby.**

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* User log in and creation page
  [*] User able to login with username and password
* User post page 
* User feed
* User profile page
* User search page

**Optional Nice-to-have Stories**

* Screen for viewing your boards and one for others
* Screen to track your plants and when they need to be watered
* Built in weather 

### 2. Screen Archetypes

* LOGIN / REGISTRATION
   *  Upon Download/Reopening of the application, the user is prompted to log in to gain access to their profile information
* POSTING PAGE
   * UPON pressing a button the user will be brought to a screen where they can create their posts and take pictures 
* FEED
   * Immediatly upon logging in they will be brought to a page curated for them based on the people they follow as well as the plants
* PROFILE PAGE
   * Page where the user can view all the boards or their plants as well as a "theme"/"banner" that is a collage of their plants (possibly their most liked pics or custom created)
* SEARCH PAGE
  * Page where user can search up users and plants.
## 3. Navigation

**Tab Navigation** (Tab to Screen)
* LOGIN
* FEED
* PROFILE
* POST
* SEARCH

**Flow Navigation** (Screen to Screen)
* LOGIN
   * Screen to login or signup 
   * LOGIN -> FEED
* FEED
   * Button to access feed is on bottom but also opens up automatically on login
   * FEED -> PROFILE or POST or SEARCH
* PROFILE
   * Button to access profile is on bottom
   * PROFILE -> FEED or POST or SEARCH
* POST
   * Button to access POST is on bottom | to get back to feed its a back button
   * POST -> FEED
* SEARCH
   * Button to access SEARCH is on bottom
   * PROFILE -> FEED or POST or SEARCH

## Wireframes
<img width="933" alt="image" src="https://user-images.githubusercontent.com/66335530/141373923-ad7d17b4-d092-4a60-b077-ebb372561ba5.png">

## Schema 
### Models
*Post*
| Property | Type | Description |
| --- | --- | --- |
| postID | String | id for the user post
| userImage | Pointer to User | image of the user
| plantsBoard | String | name of the board that the plant belongs to
| image | File | image that the user posts
| caption | String | caption of the post
| createdAt | DateTime | date when post is created
| updatedAt | DateTime | date when post was last updated

*User*
| Property | Type | Description |
| --- | --- | --- |
| userID | String | id for the user
| followersCount | Number | number of followers
| followingCount | Number | number of users the user is following
| plantsCount | Number | number of plants for the user
| postImage | Pointer to Post | image of user's post
| profileImage | File | profile image of user
| coverimage | File | cover image of user

*Search*
| Property | Type | Description |
| --- | --- | --- |
| userID | Pointer to user | image and username of users
| postId | Pointer to posts | image and caption of post
| plantID | Pointer to plant | image and name of plant board


*Plant*
| Property | Type | Description |
| --- | --- | --- |
| plantID | String | name of plant 
| userID | Pointer to user | gathers info of other plants from specific user
| postId | Pointer to posts | gets image and captions of specific plant


### Networking
* Home Feed Screen 
  * (Read/GET) Query all posts from following users
  * Create/POST) Create a new like on a post
  * (Delete) Delete existing like
  * (Create/POST) Create a new comment on a post
  * (Delete) Delete existing comment
  * (Update/POST) Update description on a post
  * (Update/POST) Update plant's name or species
* Profile Screen
  * (Update/USER) Update user profile image
  * (Update/USER) Update user profile background image
  * (Read/GET) Query logged in user object 
* Create Post Screen
  * (Create/POST) Create a new post object
  * (Read/GET) Select plants
* Search Screen
  * (Read/GET) Search plant or user
* Login Screen
  * (Read/GET) Get user's ID and password
  * (Create/USER) Create a new account

# Progress
## Basic screens are created
![grapevine_progress](https://user-images.githubusercontent.com/66335530/142297265-c427af2f-7189-41eb-a74e-d248c0538a2d.gif)

