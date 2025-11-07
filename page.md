<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width,initial-scale=1.0" />
  <title>My Shop</title>
  <link rel="stylesheet" href="style.css" />
</head>
<body>
  <!-- 헤더 -->
  <header class="header">
    <div class="inner header-top">
      <h1 class="logo"><a href="/">MYSHOP</a></h1>
      <form class="search-bar">
        <input type="text" placeholder="상품을 검색해보세요" />
        <button type="submit">검색</button>
      </form>
      <div class="header-actions">
        <a href="#">로그인</a>
        <a href="#">회원가입</a>
        <a href="#">장바구니(0)</a>
      </div>
    </div>
    <nav class="gnb">
      <div class="inner gnb-list">
        <a href="#">전체카테고리</a>
        <a href="#">신상품</a>
        <a href="#">베스트</a>
        <a href="#">기획전</a>
        <a href="#">공지사항</a>
      </div>
    </nav>
  </header>

  <main>
    <!-- 메인 배너 -->
    <section class="hero">
      <div class="inner hero-box">
        <div class="hero-text">
          <h2>11월 특가 세일</h2>
          <p>지금 주문하면 내일 도착!</p>
          <a href="#" class="btn-primary">바로가기</a>
        </div>
        <div class="hero-img">
          <!-- 배너 이미지 자리 -->
        </div>
      </div>
    </section>

    <!-- 추천/오늘의 상품 -->
    <section class="inner product-section">
      <div class="sec-title">
        <h3>오늘의 추천상품</h3>
        <a href="#">더보기</a>
      </div>
      <div class="product-grid">
        <article class="product-card">
          <div class="thumb"></div>
          <h4 class="p-name">상품명 노출</h4>
          <p class="p-price">₩29,000</p>
        </article>
        <article class="product-card">
          <div class="thumb"></div>
          <h4 class="p-name">상품명 노출</h4>
          <p class="p-price">₩19,000</p>
        </article>
        <article class="product-card">
          <div class="thumb"></div>
          <h4 class="p-name">상품명 노출</h4>
          <p class="p-price">₩39,000</p>
        </article>
        <article class="product-card">
          <div class="thumb"></div>
          <h4 class="p-name">상품명 노출</h4>
          <p class="p-price">₩15,000</p>
        </article>
      </div>
    </section>

    <!-- 공지/게시판 미리보기 -->
    <section class="inner board-preview">
      <div class="sec-title">
        <h3>공지사항</h3>
        <a href="#">전체보기</a>
      </div>
      <ul class="board-list">
        <li><a href="#">[공지] 11월 배송 일정 안내</a><span>2025-11-08</span></li>
        <li><a href="#">[이벤트] 신규가입 쿠폰 지급</a><span>2025-11-07</span></li>
        <li><a href="#">[점검] 시스템 점검 안내</a><span>2025-11-06</span></li>
      </ul>
    </section>
  </main>

  <footer class="footer">
    <div class="inner">
      <p>© 2025 MYSHOP. All rights reserved.</p>
    </div>
  </footer>
</body>
</html>



-----------------------------------------------------------------------------css 시작

* { box-sizing: border-box; }
body { margin:0; font-family: 'Segoe UI', sans-serif; background:#f5f5f5; color:#222; }
.inner { width:1200px; margin:0 auto; max-width:100%; padding:0 16px; }
.header { background:#fff; border-bottom:1px solid #eee; }
.header-top { display:flex; align-items:center; justify-content:space-between; gap:16px; padding:12px 0; }
.logo a { font-size:1.4rem; font-weight:700; color:#222; text-decoration:none; }
.search-bar { flex:1; display:flex; gap:8px; }
.search-bar input { flex:1; padding:8px 12px; border:1px solid #ddd; border-radius:4px; }
.search-bar button { padding:8px 16px; border:none; background:#ff5b59; color:#fff; border-radius:4px; cursor:pointer; }
.header-actions a { margin-left:10px; font-size:0.9rem; color:#444; text-decoration:none; }

.gnb { background:#fff; border-top:1px solid #eee; }
.gnb-list { display:flex; gap:20px; padding:10px 0; }
.gnb-list a { text-decoration:none; color:#333; font-weight:500; }

.hero { background:#ffece9; padding:32px 0 24px; }
.hero-box { display:flex; align-items:center; justify-content:space-between; gap:32px; }
.hero-text h2 { font-size:2rem; margin-bottom:10px; }
.btn-primary { display:inline-block; background:#ff5b59; color:#fff; padding:10px 18px; border-radius:4px; text-decoration:none; }

.product-section { margin-top:32px; }
.sec-title { display:flex; align-items:center; justify-content:space-between; margin-bottom:16px; }
.product-grid { display:grid; grid-template-columns:repeat(auto-fit, minmax(210px, 1fr)); gap:16px; }
.product-card { background:#fff; border-radius:8px; padding:12px; box-shadow:0 1px 2px rgba(0,0,0,0.05); }
.product-card .thumb { background:#ddd; border-radius:6px; height:160px; margin-bottom:10px; }
.p-name { margin:4px 0; font-size:0.95rem; }
.p-price { color:#ff5b59; font-weight:600; }

.board-preview { margin:40px auto; }
.board-list { list-style:none; padding:0; margin:0; background:#fff; border-radius:8px; }
.board-list li { display:flex; justify-content:space-between; padding:10px 12px; border-bottom:1px solid #efefef; }
.board-list li:last-child { border-bottom:none; }
.board-list a { text-decoration:none; color:#333; }
.footer { margin-top:40px; background:#fff; border-top:1px solid #eee; padding:20px 0; text-align:center; font-size:0.85rem; }
@media (max-width:768px) {
  .header-top { flex-wrap:wrap; }
  .hero-box { flex-direction:column; align-items:flex-start; }
  .inner { width:100%; }
}



------------------------------------------공통래퍼

<div class="board-wrap inner">
  <h2 class="board-title">공지사항 등록</h2>
  <!-- 여기 안에 form이나 내용 들어감 -->
</div>


.board-wrap { background:#fff; margin:32px auto; padding:24px; border-radius:8px; box-shadow:0 1px 3px rgba(0,0,0,0.05); }
.board-title { margin-bottom:20px; font-size:1.3rem; }
.board-form .form-row { margin-bottom:16px; }
.board-form label { display:block; margin-bottom:6px; font-weight:500; }
.board-form input[type="text"],
.board-form input[type="file"],
.board-form textarea,
.board-form select {
  width:100%; padding:10px 12px; border:1px solid #ddd; border-radius:4px;
}
.board-form textarea { min-height:200px; resize:vertical; }
.form-actions { margin-top:20px; display:flex; gap:10px; }
.btn { padding:9px 16px; border-radius:4px; border:none; cursor:pointer; }
.btn-primary { background:#ff5b59; color:#fff; }
.btn-secondary { background:#eee; }



---------------------------------------------등록

<div class="board-wrap inner">
  <h2 class="board-title">공지사항 등록</h2>
  <form class="board-form" action="/board/insert" method="post" enctype="multipart/form-data">
    <div class="form-row">
      <label for="title">제목</label>
      <input type="text" id="title" name="title" placeholder="제목을 입력하세요" required>
    </div>
    <div class="form-row">
      <label for="writer">작성자</label>
      <input type="text" id="writer" name="writer" value="관리자" readonly>
    </div>
    <div class="form-row">
      <label for="content">내용</label>
      <textarea id="content" name="content" placeholder="내용을 입력하세요"></textarea>
    </div>
    <div class="form-row">
      <label for="file">첨부파일</label>
      <input type="file" id="file" name="file">
    </div>
    <div class="form-actions">
      <button type="submit" class="btn btn-primary">등록</button>
      <a href="/board/list" class="btn btn-secondary">목록</a>
    </div>
  </form>
</div>






-------------------------------수정





<div class="board-wrap inner">
  <h2 class="board-title">공지사항 수정</h2>
  <form class="board-form" action="/board/update" method="post" enctype="multipart/form-data">
    <input type="hidden" name="id" value="123">
    <div class="form-row">
      <label for="title">제목</label>
      <input type="text" id="title" name="title" value="기존 제목입니다." required>
    </div>
    <div class="form-row">
      <label for="writer">작성자</label>
      <input type="text" id="writer" name="writer" value="관리자" readonly>
    </div>
    <div class="form-row">
      <label for="content">내용</label>
      <textarea id="content" name="content">기존 내용입니다.</textarea>
    </div>
    <div class="form-row">
      <label>기존 첨부: event_notice.pdf</label>
      <input type="file" name="file">
    </div>
    <div class="form-actions">
      <button type="submit" class="btn btn-primary">저장</button>
      <a href="/board/view/123" class="btn btn-secondary">취소</a>
    </div>
  </form>
</div>


---------------------------------상세

<div class="board-wrap inner">
  <h2 class="board-title">공지사항</h2>
  <div class="board-view">
    <div class="view-head">
      <h3>[공지] 11월 배송 일정 안내</h3>
      <div class="meta">
        <span>작성자 : 관리자</span>
        <span>등록일 : 2025-11-08</span>
        <span>조회수 : 35</span>
      </div>
    </div>
    <div class="view-body">
      <p>
        11월 중 물류센터 점검으로 인해 일부 지역의 배송이 1~2일 지연될 수 있습니다. <br>
        고객 여러분의 양해 부탁드립니다.
      </p>
    </div>
    <div class="view-file">
      <strong>첨부파일</strong>
      <a href="/file/download/1">배송일정.pdf</a>
    </div>
    <div class="form-actions">
      <a href="/board/list" class="btn btn-secondary">목록</a>
      <a href="/board/edit/123" class="btn btn-primary">수정</a>
      <form action="/board/delete/123" method="post" style="display:inline;">
        <button type="submit" class="btn btn-secondary">삭제</button>
      </form>
    </div>
  </div>
</div>



.board-view .view-head h3 { font-size:1.2rem; margin-bottom:6px; }
.board-view .meta { display:flex; gap:12px; font-size:0.85rem; color:#666; margin-bottom:20px; flex-wrap:wrap; }
.view-body { line-height:1.6; margin-bottom:20px; }
.view-file { margin-bottom:20px; }
.view-file a { margin-left:6px; color:#ff5b59; text-decoration:none; }











