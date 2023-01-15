create table team
(
    id          serial,
    name        varchar,
    primary key (id)
);

create table player
(
    id          serial,
    name        varchar,
    number      int,
    id_team     int,
    primary key (id),
    foreign key (id_team) references team(id)
);

create table play_against
(
    id                  serial,
    datetime            timestamp,
    stadium             varchar,
    id_teamA            int,
    id_teamB            int,
    primary key (id),
    foreign key (id_teamA) references team(id),
    foreign key (id_teamB) references team(id)
);

create table sponsor
(
    id          serial,
    name        varchar,
    primary key (id)
);

create table team_sponsor
(
    id          serial,
    id_team     int,
    id_sponsor  int,
    foreign key (id_team) references team(id),
    foreign key (id_sponsor) references sponsor(id)
);

create table score
(
    id              serial,
    time            int,
    is_own_goal       boolean,
    id_play_against int,
    id_player       int,
    primary key (id),
    foreign key (id_play_against) references play_against(id),
    foreign key (id_player) references player(id),
    check (time>0 and time<=90)
);