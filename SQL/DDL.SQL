-- 회원 테이블

CREATE TABLE user (
    user_no INT AUTO_INCREMENT PRIMARY KEY,
    user_id VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    phone VARCHAR(20),
    address VARCHAR(255),
    role VARCHAR(20) DEFAULT 'USER',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);


-- 관리자 테이블

CREATE TABLE user_auth (
    auth_no INT AUTO_INCREMENT PRIMARY KEY,
    user_id VARCHAR(50) NOT NULL,
    auth VARCHAR(50) NOT NULL DEFAULT 'ROLE_USER'
);


-- 게시판 테이블

CREATE TABLE board (
    board_id INT AUTO_INCREMENT PRIMARY KEY,
    category VARCHAR(50),
    title VARCHAR(255) NOT NULL,
    content TEXT NOT NULL,
    writer VARCHAR(50) NOT NULL,
    view_count INT DEFAULT 0,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);


-- 파일 테이블

CREATE TABLE file (
    no INT AUTO_INCREMENT PRIMARY KEY,
    parent_table VARCHAR(100) NOT NULL,
    parent_no INT NOT NULL,
    file_name VARCHAR(255) NOT NULL,
    origin_name VARCHAR(255) NOT NULL,
    file_path VARCHAR(255) NOT NULL,
    file_size BIGINT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    file_code VARCHAR(50)
);


-- 상품 테이블

CREATE TABLE product (
    product_no INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price DECIMAL(10,2) NOT NULL,
    stock INT DEFAULT 0,
    category VARCHAR(100),
    thumbnail VARCHAR(255),
    reg_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    upd_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);


-- 장바구니 테이블

CREATE TABLE cart (
    cart_no INT AUTO_INCREMENT PRIMARY KEY,
    member_no INT NOT NULL,
    product_no INT NOT NULL,
    quantity INT DEFAULT 1,
    reg_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_no) REFERENCES user(user_no),
    FOREIGN KEY (product_no) REFERENCES product(product_no)
);


-- 결제정보 테이블

CREATE TABLE payment (
    payment_no INT AUTO_INCREMENT PRIMARY KEY,
    member_no INT NOT NULL,
    order_no VARCHAR(100) NOT NULL,
    total_amount DECIMAL(10,2) NOT NULL,
    payment_method VARCHAR(50),
    status VARCHAR(50) DEFAULT 'READY',
    reg_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_no) REFERENCES user(user_no)
);
