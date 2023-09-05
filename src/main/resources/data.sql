DROP TABLE IF EXISTS cars;

CREATE TABLE cars (
                           id INT AUTO_INCREMENT  PRIMARY KEY,
                           model VARCHAR(250) NOT NULL,
                           constructor VARCHAR(250) NOT NULL,
                           color VARCHAR(250) NOT NULL
);

INSERT INTO cars (model, constructor, color) VALUES
                                                                  ('Alpine', 'Renault','Blue'),
                                                                  ('Escort', 'Ford', 'White'),
                                                                  ('131 Abarth', 'Fiat', 'Black');