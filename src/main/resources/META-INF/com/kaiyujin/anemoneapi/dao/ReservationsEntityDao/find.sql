select
  /*%expand*/*
from
  reservations
where
  /*%if reservation.statusId != null */ status_id = /*reservation.statusId*/0 /*%end*/