select * from Jaegers;

select * from Jaegers
    where status is true;

select * from Jaegers
    where mark in ('MARK-1', 'MARK-6');

select * from Jaegers
    order by mark desc;

select  * from Jaegers
    order by launch
    limit 1;

select * from Jaegers
    where kaijukill in
            (select min (kaijukill)
                from Jaegers);

select * from Jaegers
    where kaijukill in
            (select max (kaijukill)
                from Jaegers);

select avg(weight) as avgweight from Jaegers;

update Jaegers
    set kaijukill = kaijukill + 1
    where status is true;

delete from Jaegers
    where status is false;