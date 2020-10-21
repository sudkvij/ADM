DROP TABLE IF EXISTS employee CASCADE;
CREATE TABLE employee (
  id         SERIAL,
  emp_number TEXT,
  first_name TEXT,
  last_name  TEXT,
  address1   TEXT,
  PRIMARY KEY (id)
);
