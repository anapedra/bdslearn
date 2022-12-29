
INSERT INTO tb_user (name,email, password) VALUES ('Alex Brown','alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name,email, password) VALUES ('Bob Brown','bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name,email, password) VALUES ('Maria Green','maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course(name,img_Uri,img_Gray_Uri) VALUES ('Bootcamp HTML','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAc3URccfmV8O3BPRQEIcQOWI7keQElJiXKxGC7ltxl_L_vpW36VYDM0oeFLd_MwWYE4s&usqp=CAU',
                                                        'https://univercemig.cemig.com.br/theme/image.php/mb2nl/theme/1668808574/course-default');
INSERT INTO tb_offer(edition,start_Moment,end_Moment,course_id) VALUES ('1.0',TIMESTAMP WITHOUT TIME ZONE'2023-03-14T10:00:00Z',TIMESTAMP WITHOUT TIME ZONE'2024-03-14T10:00:00Z',1);
INSERT INTO tb_offer(edition ,start_Moment,end_Moment,course_id) VALUES ('2.0',TIMESTAMP WITHOUT TIME ZONE'2023-03-14T10:00:00Z',TIMESTAMP WITHOUT TIME ZONE'2024-03-14T10:00:00Z',1);

INSERT INTO tb_resource(title,description,position,img_Uri,type,offer_id) VALUES ('Trilha HTML','Trilha principal do curso',1,'https://univercemig.cemig.com.br/theme/image.php/mb2nl/theme/1668808574/course-default','1',1 );
INSERT INTO tb_resource(title,description,position,img_Uri,type,offer_id) VALUES ('Forum','Tire suas duvidas',2,'https://univercemig.cemig.com.br/theme/image.php/mb2nl/theme/1668808574/course-default','2',1 );
INSERT INTO tb_resource(title,description,position,img_Uri,type,offer_id) VALUES ('Lives','Lives exclusivas para a turma',3,'https://univercemig.cemig.com.br/theme/image.php/mb2nl/theme/1668808574/course-default','0',1 );

INSERT INTO tb_section(title,description,position,img_Uri,resource_id,prerequisite_id) VALUES ('Capitulo 1','Apresentação do curso',1,'https://univercemig.cemig.com.br/theme/image.php/mb2nl/theme/1668808574/course-default',1,null);
INSERT INTO tb_section(title,description,position,img_Uri,resource_id,prerequisite_id) VALUES ('Capitulo 2',' Vamos continuar o curso   ',2,'https://univercemig.cemig.com.br/theme/image.php/mb2nl/theme/1668808574/course-default',1,1);
INSERT INTO tb_section(title,description,position,img_Uri,resource_id,prerequisite_id) VALUES ('Capitulo 3','Vamoas finalizar o curso',3,'https://univercemig.cemig.com.br/theme/image.php/mb2nl/theme/1668808574/course-default',1,2);

INSERT INTO tb_enrollmant(user_id,offer_id,enroll_Moment,refund_Moment,available,only_Update) VALUES (1,1,TIMESTAMP WITHOUT TIME ZONE '2023-03-14T10:00:00Z',null,true,false);
INSERT INTO tb_enrollmant(user_id,offer_id,enroll_Moment,refund_Moment,available,only_Update) VALUES (2,1,TIMESTAMP WITHOUT TIME ZONE'2023-03-14T10:00:00Z',null,true,false);

INSERT INTO tb_lesson(title,position,section_id) VALUES ('Aula 1 do capitulo 1',1,1);
INSERT INTO tb_content(id,text_Content,video_Uri) VALUES (1,'Material de apoio: ABC','https://youtu.be/sqbqoR-lMf8');


INSERT INTO tb_lesson(title,position,section_id) VALUES ('Aula 2 do capitulo 1',2,1);
INSERT INTO tb_content(id,text_Content,video_Uri) VALUES (2,'','https://youtu.be/sqbqoR-lMf8');


INSERT INTO tb_lesson(title,position,section_id) VALUES ('Aula 3 do capitulo 1',3,1);
INSERT INTO tb_content(id,text_Content,video_Uri) VALUES (3,'','https://youtu.be/sqbqoR-lMf8');

INSERT INTO tb_lesson(title,position,section_id) VALUES ('Tarefa do capitulo 1',4,1);
INSERT INTO tb_tesk(id,description,question_Count,approval_Count,weight, due_Date) VALUES (4,'Trabalho á realizar',5,4,1.0,TIMESTAMP WITHOUT TIME ZONE'2023-03-14T10:00:00Z');


INSERT INTO tb_lesson_done(lesson_id,user_id,offer_id) VALUES (1,1,1);
INSERT INTO tb_lesson_done(lesson_id,user_id,offer_id) VALUES (2,1,1);


