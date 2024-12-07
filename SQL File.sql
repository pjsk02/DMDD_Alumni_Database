use Admin_Database;

DROP TABLE Student;
CREATE TABLE Student (
    sid INT PRIMARY KEY, 
    sname VARCHAR(100),
    contact VARCHAR(15),
    semail VARCHAR(255) UNIQUE,
    sgender ENUM('Male', 'Female', 'Other'),
    sdob DATE
);

DROP TABLE StudentAdd;
CREATE TABLE StudentAdd (
    sid INT PRIMARY KEY,                      -- Foreign key and primary key
    Add1 VARCHAR(255) NOT NULL,               -- First line of the address
    Add2 VARCHAR(255),                        -- Second line of the address (optional)
    City VARCHAR(100) NOT NULL,               -- City
    State VARCHAR(100) NOT NULL,              -- State
    Postal_Code VARCHAR(20) NOT NULL,         -- Postal or ZIP code
    Country VARCHAR(100) NOT NULL,            -- Country
    CONSTRAINT FK_StudentID_Addr FOREIGN KEY (sid) 
        REFERENCES Student(sid) 
        ON DELETE CASCADE
);


DROP TABLE Education;
DROP TABLE IF EXISTS Education;
CREATE TABLE Education (
    EducationID INT AUTO_INCREMENT PRIMARY KEY,  -- Unique identifier for each education entry
    StudentID INT NOT NULL,                      -- Foreign key referencing Student table
    Institution VARCHAR(255) NOT NULL,           -- Name of the institution
    Degree VARCHAR(100) NOT NULL,                -- Degree obtained (e.g., Bachelors, Masters)
    Specialization VARCHAR(100),                 -- Specialization or major (optional)
    StartingYear YEAR NOT NULL,                  -- Year education started
    PassingYear YEAR,                            -- Year education completed (optional)
    GPA DECIMAL(4, 2),                           -- Grade Point Average (optional)
    CONSTRAINT FK_Edu_StudentID FOREIGN KEY (StudentID) 
        REFERENCES Student(sid) 
        ON DELETE CASCADE
);

DROP TABLE WorkExperience;
CREATE TABLE WorkExperience (
    WorkID INT AUTO_INCREMENT PRIMARY KEY,     -- Unique identifier for each work experience
    StudentID INT NOT NULL,                    -- Foreign key referencing Student table
    Company VARCHAR(255) NOT NULL,             -- Name of the company
    Title VARCHAR(100) NOT NULL,               -- Job title or role
    StartDate DATE NOT NULL,                   -- Date when work started
    EndDate DATE,                              -- Date when work ended (optional for ongoing roles)
    PlaceOfWork VARCHAR(255) NOT NULL,         -- Location of the workplace
    CONSTRAINT FK_Student_WorkExperience FOREIGN KEY (StudentID) 
        REFERENCES Student(sid) 
        ON DELETE CASCADE
);

DROP TABLE StudentSkills;
CREATE TABLE StudentSkills (
    StudentID INT NOT NULL,
    SkillName VARCHAR(255) NOT NULL,
    PRIMARY KEY (StudentID, SkillName),
    FOREIGN KEY (StudentID) REFERENCES Student(sid) 
        ON DELETE CASCADE
);

DROP TABLE Events;
CREATE TABLE Events (
    EventID INT PRIMARY KEY,
    EventName VARCHAR(255) NOT NULL,
    EventDate DATE NOT NULL,
    Location VARCHAR(255)
);

DROP TABLE EventParticipants;
CREATE TABLE EventParticipants (
    EventID INT NOT NULL,
    StudentID INT NOT NULL,
    PRIMARY KEY (EventID, StudentID),
    FOREIGN KEY (EventID) REFERENCES Events(EventID),
    FOREIGN KEY (StudentID) REFERENCES Student(sid)
    ON DELETE CASCADE
);


-- Dropping Table
-- Drop the 'StudentAdd' table
DROP TABLE IF EXISTS StudentAdd;

-- Drop the 'Education' table
DROP TABLE IF EXISTS Education;

-- Drop the 'WorkExperience' table
DROP TABLE IF EXISTS WorkExperience;

-- Drop the 'StudentSkills' table
DROP TABLE IF EXISTS StudentSkills;

-- Drop the 'EventParticipants' table
DROP TABLE IF EXISTS EventParticipants;

-- Drop the 'Events' table
DROP TABLE IF EXISTS Events;

-- Drop the 'Student' table
DROP TABLE IF EXISTS Student;
-- 

-- Student:

INSERT INTO Student (sid, sname, contact, semail, sgender, sdob)
VALUES
(1001, 'Alice Johnson', '1234567890', 'alice.johnson@example.com', 'Female', '2000-05-15'),
(1002, 'Rahul Verma', '+91-9876543210', 'rahul.verma@example.com', 'Male', '1998-11-20'),
(1003, 'Sophia Brown', '9876543210', 'sophia.brown@example.com', 'Female', '1997-06-12'),
(1004, 'Michael Lee', '7894561230', 'michael.lee@example.com', 'Male', '1995-03-22'),
(1005, 'Emma Davis', '6547893210', 'emma.davis@example.com', 'Female', '1999-09-10'),
(1006, 'Liam Wilson', '2345678901', 'liam.wilson@example.com', 'Male', '2001-01-18'),
(1007, 'Olivia Martinez', '8901234567', 'olivia.martinez@example.com', 'Female', '1998-07-25'),
(1008, 'Noah Kim', '5678901234', 'noah.kim@example.com', 'Male', '2000-02-10'),
(1009, 'Ava Patel', '3216549870', 'ava.patel@example.com', 'Female', '1999-11-11'),
(1010, 'Ethan Turner', '7893216540', 'ethan.turner@example.com', 'Male', '1996-08-30'),
(1011, 'Isabella White', '4561237890', 'isabella.white@example.com', 'Female', '2002-04-15'),
(1012, 'James Green', '6789123456', 'james.green@example.com', 'Male', '1997-10-05'),
(1013, 'Amelia Adams', '4567891230', 'amelia.adams@example.com', 'Female', '1995-12-18'),
(1014, 'Alexander Clark', '3456789012', 'alexander.clark@example.com', 'Male', '2001-06-21'),
(1015, 'Mia Walker', '2345671234', 'mia.walker@example.com', 'Female', '1998-03-07'),
(1016, 'Lucas Hill', '8901235678', 'lucas.hill@example.com', 'Male', '1999-09-23'),
(1017, 'Harper Scott', '1238904567', 'harper.scott@example.com', 'Female', '2000-12-01'),
(1018, 'Benjamin Young', '7890123456', 'benjamin.young@example.com', 'Male', '1995-05-19'),
(1019, 'Ella Parker', '5678907890', 'ella.parker@example.com', 'Female', '2002-02-28'),
(1020, 'William Evans', '6543217890', 'william.evans@example.com', 'Male', '1997-07-14');


-- StudentAdd:

INSERT INTO StudentAdd (sid, Add1, Add2, City, State, Postal_Code, Country)
VALUES
(1001, '123 Main St', NULL, 'Boston', 'Massachusetts', '02115', 'USA'),
(1002, '45 Elm St', 'Apt 2B', 'Chennai', 'Tamil Nadu', '600001', 'India'),
(1003, '78 Oak St', NULL, 'London', 'Greater London', 'SW1A 1AA', 'UK'),
(1004, '32 Maple St', 'Suite 101', 'Toronto', 'Ontario', 'M4B 1B3', 'Canada'),
(1005, '56 Pine St', NULL, 'San Francisco', 'California', '94102', 'USA'),
(1006, '89 Cedar St', NULL, 'Sydney', 'New South Wales', '2000', 'Australia'),
(1007, '12 Birch St', NULL, 'Singapore', 'Singapore', '238840', 'Singapore'),
(1008, '67 Walnut St', 'Unit 3A', 'New York', 'New York', '10001', 'USA'),
(1009, '90 Ash St', NULL, 'Mumbai', 'Maharashtra', '400001', 'India'),
(1010, '34 Spruce St', NULL, 'Berlin', 'Berlin', '10115', 'Germany'),
(1011, '77 Fir St', NULL, 'Paris', 'Ile-de-France', '75001', 'France'),
(1012, '29 Redwood St', 'Floor 4', 'Tokyo', 'Tokyo', '100-0001', 'Japan'),
(1013, '14 Cypress St', NULL, 'Seoul', 'Seoul', '04524', 'South Korea'),
(1014, '85 Palm St', NULL, 'Dubai', 'Dubai', '00000', 'UAE'),
(1015, '19 Willow St', NULL, 'Los Angeles', 'California', '90001', 'USA'),
(1016, '62 Cherry St', 'Room 12', 'Melbourne', 'Victoria', '3000', 'Australia'),
(1017, '71 Chestnut St', NULL, 'Chicago', 'Illinois', '60601', 'USA'),
(1018, '48 Bamboo St', NULL, 'Beijing', 'Beijing', '100000', 'China'),
(1019, '53 Teak St', NULL, 'Cape Town', 'Western Cape', '8001', 'South Africa'),
(1020, '10 Poplar St', NULL, 'Dublin', 'Leinster', 'D02', 'Ireland');



-- Education:

INSERT INTO Education (StudentID, Institution, Degree, Specialization, StartingYear, PassingYear, GPA)
VALUES
(1001, 'Harvard University', 'Bachelors', 'Computer Science', 2018, 2022, 3.8),
(1002, 'Vellore Institute of Technology', 'Masters', 'AI and Robotics', 2020, 2022, 3.9),
(1003, 'University of Oxford', 'PhD', 'Philosophy', 2015, 2020, 4.0),
(1004, 'University of Toronto', 'Bachelors', 'Biotechnology', 2017, 2021, 3.7),
(1005, 'Stanford University', 'Masters', 'Business Administration', 2019, 2021, 3.85),
(1006, 'University of Sydney', 'Bachelors', 'Mechanical Engineering', 2016, 2020, 3.6),
(1007, 'National University of Singapore', 'Masters', 'Finance', 2018, 2020, 3.92),
(1008, 'New York University', 'Bachelors', 'Physics', 2015, 2019, 3.88),
(1009, 'University of Mumbai', 'Masters', 'Clinical Psychology', 2016, 2018, 3.75),
(1010, 'Technical University of Berlin', 'PhD', 'Environmental Science', 2014, 2019, 3.95),
(1011, 'University of Paris', 'Bachelors', 'Literature', 2017, 2021, 3.67),
(1012, 'University of Tokyo', 'Masters', 'Data Analytics', 2018, 2020, 3.9),
(1013, 'Seoul National University', 'Bachelors', 'Electrical Engineering', 2016, 2020, 3.78),
(1014, 'American University of Dubai', 'Masters', 'Architecture', 2017, 2019, 3.85),
(1015, 'UCLA', 'PhD', 'Public Health', 2013, 2018, 3.98),
(1016, 'University of Melbourne', 'Bachelors', 'Astrophysics', 2015, 2019, 3.82),
(1017, 'University of Chicago', 'Masters', 'Public Policy', 2018, 2020, 3.88),
(1018, 'Peking University', 'PhD', 'Linguistics', 2014, 2019, 3.93),
(1019, 'University of Cape Town', 'Bachelors', 'Marine Biology', 2017, 2021, 3.77),
(1020, 'Trinity College Dublin', 'Masters', 'Artificial Intelligence', 2018, 2020, 3.89);


-- WorkExperience:

INSERT INTO WorkExperience (StudentID, Company, Title, StartDate, EndDate, PlaceOfWork)
VALUES
(1001, 'Google', 'Software Engineer', '2022-06-01', '2023-12-31', 'Mountain View, CA'),
(1002, 'TCS', 'AI Researcher', '2022-01-15', '2023-07-20', 'Bengaluru, India'),
(1003, 'Microsoft', 'Data Scientist', '2021-05-01', NULL, 'Redmond, WA'),
(1004, 'Pfizer', 'Research Analyst', '2020-09-01', '2022-06-30', 'Toronto, Canada'),
(1005, 'Tesla', 'Project Manager', '2021-03-01', '2023-08-01', 'Palo Alto, CA'),
(1006, 'Qantas', 'Mechanical Engineer', '2020-04-01', '2022-10-15', 'Sydney, Australia'),
(1007, 'DBS Bank', 'Financial Analyst', '2019-07-01', '2022-03-31', 'Singapore'),
(1008, 'SpaceX', 'Astrophysicist', '2021-06-15', '2023-09-30', 'Los Angeles, CA'),
(1009, 'Fortis Healthcare', 'Clinical Psychologist', '2018-11-01', '2021-11-01', 'Mumbai, India'),
(1010, 'Siemens', 'Environmental Engineer', '2017-02-01', '2020-12-31', 'Berlin, Germany'),
(1011, 'Louvre Museum', 'Curator', '2019-08-01', '2022-05-01', 'Paris, France'),
(1012, 'Sony', 'Data Analyst', '2020-05-01', NULL, 'Tokyo, Japan'),
(1013, 'Samsung', 'Electrical Engineer', '2018-04-15', '2021-12-31', 'Seoul, South Korea'),
(1014, 'Dubai Municipality', 'Architect', '2019-06-01', '2022-08-01', 'Dubai, UAE'),
(1015, 'WHO', 'Epidemiologist', '2015-09-01', '2019-09-01', 'Geneva, Switzerland'),
(1016, 'Melbourne Observatory', 'Research Scientist', '2020-02-01', '2023-01-31', 'Melbourne, Australia'),
(1017, 'Chicago Policy Institute', 'Policy Advisor', '2020-09-01', '2023-02-28', 'Chicago, IL'),
(1018, 'Tencent', 'Linguistics Analyst', '2019-05-01', '2023-06-30', 'Beijing, China'),
(1019, 'WWF', 'Marine Biologist', '2021-04-01', '2023-11-01', 'Cape Town, South Africa'),
(1020, 'Accenture', 'AI Consultant', '2020-07-01', NULL, 'Dublin, Ireland');


-- StudentSkills:

INSERT INTO StudentSkills (StudentID, SkillName)
VALUES
(1001, 'Python'),
(1001, 'Java'),
(1002, 'Machine Learning'),
(1002, 'Data Analysis'),
(1003, 'Cloud Computing'),
(1003, 'SQL'),
(1004, 'Biotechnology'),
(1005, 'Project Management'),
(1005, 'Leadership'),
(1006, 'Mechanical Design'),
(1006, 'Matlab'),
(1007, 'Financial Modeling'),
(1008, 'Astrophysics'),
(1009, 'Clinical Psychology'),
(1010, 'Environmental Assessment'),
(1011, 'Art Restoration'),
(1012, 'Data Visualization'),
(1013, 'Electrical Circuit Design'),
(1014, 'Architectural Design'),
(1015, 'Epidemiology'),
(1016, 'Research Methodology'),
(1017, 'Public Policy Analysis'),
(1018, 'Linguistic Processing'),
(1019, 'Marine Biology'),
(1020, 'Artificial Intelligence');



-- Events:

INSERT INTO Events (EventID, EventName, EventDate, Location)
VALUES
(1, 'Tech Summit 2023', '2023-05-15', 'San Francisco, CA'),
(2, 'AI Conference 2023', '2023-06-20', 'Boston, MA'),
(3, 'Robotics Expo', '2023-07-10', 'Tokyo, Japan'),
(4, 'Biotech Forum', '2023-08-05', 'London, UK'),
(5, 'Finance Workshop', '2023-09-15', 'Singapore'),
(6, 'Space Exploration Meetup', '2023-10-01', 'Los Angeles, CA'),
(7, 'Mental Health Seminar', '2023-11-10', 'Mumbai, India'),
(8, 'Sustainability Fair', '2023-12-20', 'Berlin, Germany'),
(9, 'Art Symposium', '2024-01-15', 'Paris, France'),
(10, 'Data Science Bootcamp', '2024-02-10', 'New York, NY'),
(11, 'Engineering Innovation Day', '2024-03-05', 'Seoul, South Korea'),
(12, 'Urban Planning Forum', '2024-04-15', 'Dubai, UAE'),
(13, 'Healthcare Innovations', '2024-05-20', 'Geneva, Switzerland'),
(14, 'Astronomy Night', '2024-06-10', 'Melbourne, Australia'),
(15, 'Policy Analysis Meetup', '2024-07-15', 'Chicago, IL'),
(16, 'Linguistics Research Workshop', '2024-08-20', 'Beijing, China'),
(17, 'Marine Conservation Day', '2024-09-15', 'Cape Town, South Africa'),
(18, 'AI Hackathon', '2024-10-01', 'Dublin, Ireland'),
(19, 'Start-Up Pitch Fest', '2024-11-10', 'Toronto, Canada'),
(20, 'Global Innovation Summit', '2024-12-05', 'Boston, MA');


-- EventParticipants:

INSERT INTO EventParticipants (EventID, StudentID)
VALUES
(1, 1001),
(2, 1002),
(3, 1003),
(4, 1004),
(5, 1005),
(6, 1006),
(7, 1007),
(8, 1008),
(9, 1009),
(10, 1010),
(11, 1011),
(12, 1012),
(13, 1013),
(14, 1014),
(15, 1015),
(16, 1016),
(17, 1017),
(18, 1018),
(19, 1019),
(20, 1020),
(1, 1002),
(3, 1006),
(5, 1010),
(7, 1015),
(9, 1020);