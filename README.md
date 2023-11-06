<pre>

user@user-linux:~$ sudo docker ps
                                            
CONTAINER ID   IMAGE                   COMMAND                  CREATED        STATUS         PORTS                                     NAMES
2b6eac0820e7   postgres:16.0         "docker-entrypoint.s…"   10 hours ago   Up 7 seconds   0.0.0.0:51203->5432/tcp                   spring-compose-postgres-1
b127353daf81   dpage/pgadmin4:latest   "/entrypoint.sh"         10 hours ago   Up 7 seconds   80/tcp, 443/tcp, 0.0.0.0:5050->5050     spring-compose-pgadmin-1

user@user-linux:~$ sudo docker exec -it spring-compose psql -U myuser -d mydatabase
psql (15.2 (Debian 15.2-1.pgdg110+1))
Type "help" for help.

mydatabase=# \l

mydatabase=# \c mydatabase

You are now connected to database "mydatabase" as user "myuser".

mydatabase=# \dt

        List of relations
 Schema | Name  | Type  | Owner  
--------+-------+-------+--------

 public | event | table | myuser
(1 row)

mydatabase=# \d event

                       Table "public.event"
 Column |          Type          | Collation | Nullable | Default 
--------+------------------------+-----------+----------+---------
 id     | bigint                 |           | not null | 
 name   | character varying(255) |           |          | 

Indexes:
    "event_pkey" PRIMARY KEY, btree (id)

mydatabase=# select * from event;

 id | name 
----+------
  1 | EVENT1
  2 | EVENT2
  3 | EVENT3
(3 rows)

mydatabase=# 

</pre>

