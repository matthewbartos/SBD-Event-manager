# SBD Event-manager

## UI
Login:
![Login](https://github.com/matis11/SBD-Event-manager/blob/master/ui/login.png)

Participant View:
![Participant View](https://github.com/matis11/SBD-Event-manager/blob/master/ui/participantView.png)

Organizer View:
![Organizer View](https://github.com/matis11/SBD-Event-manager/blob/master/ui/organizerView.png)

Event View:
![Event View](https://github.com/matis11/SBD-Event-manager/blob/master/ui/eventView.png)

Event Creation View:
![Event Creation View](https://github.com/matis11/SBD-Event-manager/blob/master/ui/eventCreationView.png)

Event Edit View:
![Event Creation View](https://github.com/matis11/SBD-Event-manager/blob/master/ui/eventEditView.png)

## Charts
Entities:
![Entities](https://github.com/matis11/SBD-Event-manager/blob/master/charts/Entities.png)

UserStories:
![UserStories](https://github.com/matis11/SBD-Event-manager/blob/master/charts/UserStories.png)

## Table definitions

```
CREATE TABLE INF122437.participants
(
    user_id INT PRIMARY KEY NOT NULL,
    first_name VARCHAR2(50) NOT NULL,
    surname VARCHAR2(50) NOT NULL,
    register_date DATE NOT NULL,
    isDeleted INT DEFAULT 0 NOT NULL,
    login VARCHAR2(50) NOT NULL,
    password VARCHAR2(50) NOT NULL
);
CREATE UNIQUE INDEX "participants_user_id_uindex" ON INF122437.participants (user_id);
CREATE UNIQUE INDEX "participants_login_uindex" ON INF122437.participants (login);

CREATE TABLE INF122437.events
(
    event_id INT PRIMARY KEY NOT NULL,
    event_name VARCHAR2(50) NOT NULL,
    start_date_time DATE,
    end_date_time DATE,
    event_category VARCHAR2(50),
    event_place VARCHAR2(50) NOT NULL,
    "size" INT
);
CREATE UNIQUE INDEX "events_event_id_uindex" ON INF122437.events (event_id);

CREATE TABLE INF122437.organizers
(
    USER_ID NUMBER(*) PRIMARY KEY NOT NULL,
    FIRST_NAME VARCHAR2(50) NOT NULL,
    SURNAME VARCHAR2(50) NOT NULL,
    ORGANIZER_GROUP VARCHAR2(50),
    LOGIN VARCHAR2(50) NOT NULL,
    PASSWORD VARCHAR2(50) NOT NULL
);
CREATE UNIQUE INDEX "organizers_user_id_uindex" ON INF122437.organizers (user_id);

CREATE TABLE INF122437.waiting_list
(
    list_id INT PRIMARY KEY NOT NULL,
    event_id INT NOT NULL,
    CONSTRAINT waiting_list_EVENTS_EVENT_ID_fk FOREIGN KEY (event_id) REFERENCES EVENTS (EVENT_ID)
);
CREATE UNIQUE INDEX "waiting_list_list_id_uindex" ON INF122437.waiting_list (list_id);
```

## Roadmap
- [x] Created entity chart,
- [x] Created user cases chart,
- [x] Created table declarations,
- [x] Created UI,
- [x] Connected to extrernal DB,
- [ ] Implemented controllers for login / logout,
- [ ] Implemented controllers for viewing event,
- [ ] Implemented controllers for searching events,
- [ ] Implemented controllers for creating events,
- [ ] Implemented controllers for editing events,
- [ ] Implemented controllers for joining events,
- [ ] Implemented controllers for joining waiting list for events,
- [ ] Implemented controllers for changing profile data.
