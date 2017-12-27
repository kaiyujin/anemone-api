select
  /*%expand*/*
from
  users_authorities
where
  user_id = /* userId */1
  and
  authority_id = /* authorityId */1
  and
  shop_id = /* shopId */1
