----------------------- TEAM -------------------------------
insert into team(id,name) values(1,'Madagascar');
insert into team(id, name) values(2,'Argentine');

------------------------ MATCH / PLAY AGAINST -------------------------
insert into play_against(id, datetime, stadium, id_teamA, id_teamB) values(1,'2021-03-01T17:20:00.000+01:00','Mahamasina',2,1);

---------------------------------------------- PLAYER -----------------------
insert into player(id, name, number, id_team) values(1,'Voavy Paulin',10,1);
insert into player(id, name, number, id_team) values(2,'Adrien',1,1);
insert into player(id, name, number, id_team) values(3,'Leo Messi',10,2);
insert into player(id, name, number, id_team) values(4,'Di Maria',7,2);

---------------------- SPONSOR -------------------------------
insert into sponsor(id, name) values (1,'Maskita');

----------------------- TEAM_SPONSOR -------------------------
insert into team_sponsor(id, id_team, id_sponsor) values(1,1,1);

---------------------SCORE--------------
insert into score(id,time,is_own_goal,id_play_against,id_player) values(1,10,false,1,1);
insert into score(id,time,is_own_goal,id_play_against,id_player) values(2,44,false,1,2);
insert into score(id,time,is_own_goal,id_play_against,id_player) values(3,90,true,1,1);
