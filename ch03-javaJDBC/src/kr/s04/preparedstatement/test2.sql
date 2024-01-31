
--이 파일은 보관만 하는 거다.  텍스트 파일 
--얘를 만들려면 복사해서 sqldeveloper에서 실행해야 한다. 

create table test2(
 num number primary key,
 title varchar2(30) not null,
 name varchar2(30) not null,
 memo varchar2(4000) not null,
 email varchar2(30),
 reg_date date not null
);
create sequence test2_seq;     --sequence는 pk를 만들어주는 거 