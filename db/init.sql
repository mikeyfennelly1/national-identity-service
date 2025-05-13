CREATE TABLE countries(
                          country_id INT PRIMARY KEY,
                          country_name VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE application_user (
                                  user_id INT PRIMARY KEY,
                                  username VARCHAR(50) NOT NULL,
                                  email VARCHAR(50) NOT NULL,
                                  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                  country_id INT,
                                  is_active BOOLEAN DEFAULT TRUE,
                                  FOREIGN KEY (country_id) REFERENCES countries(country_id)
);