# Social Network Project

An educational Java project implementing a social media platform that demonstrates core Object-Oriented Programming (OOP) principles.

## Description

This is a console application implementing basic social network functionality. The project was created to demonstrate and practice fundamental OOP concepts:  inheritance, polymorphism, encapsulation, and abstraction.

## Implemented OOP Principles

### 1. **Inheritance**
- `Profile` class inherits from `User`
- `Admin` class inherits from `User`
- Hierarchy: `User` → `Profile` / `Admin`

### 2. **Encapsulation**
- Private fields (`private`) in all classes
- Getters and setters for controlled data access
- Data validation (e. g., age check: `age > 0 && age < 150`)

### 3. **Polymorphism**
- Method overriding:  `toString()`, `equals()`, `hashCode()`
- Overriding `getRole()` method in child classes
- Overriding `printProfile()` method for different user types

### 4. **Abstraction**
- Using interfaces and classes to represent entities
- Hiding internal implementation through methods

## Project Structure

```
SocialNetworkProject/
├── src/
│   ├── Main.java           # Application entry point
│   ├── SocialNetwork.java  # Social network management class
│   ├── User.java           # Base user class
│   ├── Profile. java        # Regular user profile class
│   ├── Admin.java          # Administrator class
│   └── Post. java           # Post class
├── . gitignore
└── 1test.iml
```

## Core Features

### `User` Class (base)
- Username (`username`)
- Biography (`bio`)
- Methods: `getUsername()`, `getBio()`, `setBio()`, `getRole()`, `printProfile()`

### `Profile` Class (extends User)
- User age (`age`)
- List of posts (`posts`)
- Methods: `addPost()`, `showPosts()`, `getAge()`, `setAge()`

### `Admin` Class (extends User)
- Administrator methods:
  - `banUser(Profile profile)` - ban a user
  - `deletePost(Profile profile, Post p)` - delete a post

### `Post` Class
- Post content (`content`)
- Number of likes (`likes`)
- Methods: `getContent()`, `getLikes()`, `Like()`, `printPost()`

### `SocialNetwork` Class
- Social network user management
- Methods: `addUser()`, `showUser()`, `welcome()`

## Usage Example

```java
// Create a social network
SocialNetwork network = new SocialNetwork("MySocial");
network.welcome();

// Create user profiles
Profile user1 = new Profile("Alex", 17);
Profile user2 = new Profile("Amir", 21);

// Set biography
user2.setBio("Student of AITU");

// Add users to the network
network.addUser(user1);
network.addUser(user2);

// Display users
network.showUser();
```

## Future Enhancements (TODO)

- [ ] Friendship system between users
- [ ] Comments on posts
- [ ] Profile privacy settings
- [ ] Data persistence (file/database)
- [ ] GUI interface
- [ ] Notification system
- [ ] Search for users and posts

## Learning Objectives

This project helps understand: 
- How to create class hierarchies
- How to use inheritance to avoid code duplication
- How to override parent class methods
- How to work with collections (ArrayList)
- How to organize code in an object-oriented style

## License

This project was created for educational purposes.

## Author

**ChillyEz**
- GitHub:  [@ChillyEz](https://github.com/ChillyEz)

---
