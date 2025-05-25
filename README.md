Northeastern University DAMG_6210 Final Project (Creating Alumni Database using Java Netbeans, Oracle JDBC and MySQL database)

# 🎓 ConnectVerse: Alumni Engagement & Events Platform

A full-stack alumni relationship management system built with **Java (Swing + JDBC)** and **MySQL** that streamlines alumni recordkeeping, event participation, and data administration for educational institutions.

---

## 📌 Overview

This project simulates a real-world **university alumni database system**, offering:

- 👤 Alumni profile creation & updates  
- 🎓 Education & Work history tracking  
- 🧠 Skill management  
- 📍 Address handling  
- 📅 Event browsing, registration & tracking  
- 🗂️ Centralized alumni data view & reports  

Designed in **Java (NetBeans IDE)** with **Oracle JDBC**, it features a clean UI and a scalable backend built on a **normalized MySQL schema** with 7+ interconnected tables.

---

## 🛠 Tech Stack

| Category         | Tools / Technologies            |
|------------------|---------------------------------|
| Language         | Java (Swing, JDBC)              |
| Database         | MySQL                           |
| IDE              | NetBeans                        |
| Integration      | Oracle JDBC Thin Driver         |
| Data Modeling    | Relational schema, PK-FK design |
| UI Framework     | Java Swing                      |
| Others           | CardLayout, JProgressBar        |

---

## 🧱 Database Design

| Table             | Description                                            |
|------------------|--------------------------------------------------------|
| `Student`         | Stores primary alumni records                         |
| `StudentAdd`      | Residential address linked to each alumni             |
| `Education`       | Degree history and academic performance               |
| `WorkExperience`  | Job roles, durations, and associated skills           |
| `StudentSkills`   | Technical or soft skills possessed by alumni          |
| `Events`          | University-hosted events                              |
| `EventParticipants` | Alumni registrations for events                     |

> All foreign key relationships ensure referential integrity and enable efficient joins.

---

## 🎨 User Interface Features

### 🧍 Alumni Record Creation
- Input personal and address details
- Progress bar to track form steps

### 🎓 Education & 🏢 Work Panels
- Add multiple degrees and work experiences
- Enforce non-duplicate IDs and foreign key consistency

### 📅 Event Registration Panel
- View upcoming university events
- Register securely with Student ID
- Prevent duplicate registrations
- Real-time database updates for event-participation

### 📊 View Panel (JSplitPane)
- Side navigation buttons
- Dynamic view for:
  - Student info
  - Address details
  - Education history
  - Work experience

---

## 🧪 SQL Schema Snippet

```sql
CREATE TABLE Student (
  sid INT PRIMARY KEY,
  sname VARCHAR(100),
  contact VARCHAR(15),
  semail VARCHAR(255) UNIQUE,
  sgender ENUM('Male', 'Female'),
  sdob DATE
);
```

## 📈 Key Features for Recruiters

| Area              | Highlight                                                  |
|-------------------|------------------------------------------------------------|
| Data Engineering  | Normalized schema, indexing, efficient retrieval           |
| Backend Logic     | JDBC + Swing integration, SQL transaction handling         |
| CRUD Operations   | Full support across personal, academic, and work           |
| Event Automation  | View, register, and track alumni event participation       |
| UI & Navigation   | CardLayout, JSplitPane, event-driven interaction           |

---

## 💡 What I Learned

- 💾 Real-world database schema design  
- 🔗 JDBC connectivity and SQL execution with Java  
- 🧰 Managing UI navigation and component interaction  
- 🛡️ Ensuring data integrity and foreign key enforcement  
- 📊 Bridging alumni engagement with real-time data access  

---

## 🔮 Future Enhancements

- 📧 Email notifications for event invites  
- 📊 Admin dashboards with alumni engagement metrics  
- 🔗 LinkedIn-based auto-updating of work experience  
- ☁️ Cloud deployment with hosted database access  

---

📬 Reach out to me on [LinkedIn](https://www.linkedin.com/in/je-pulipati/) for collaboration or backend/data engineering opportunities.
