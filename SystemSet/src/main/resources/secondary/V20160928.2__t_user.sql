CREATE TABLE IF NOT EXISTS t_user (
  id int(11) NOT NULL AUTO_INCREMENT ,
  user_name VARCHAR (50) NOT NULL ,
  password VARCHAR (50) NOT NULL ,
  PRIMARY KEY (id)
) COMMENT = '用户表' ;