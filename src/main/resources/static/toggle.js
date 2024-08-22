
    function toggleChat() {
        var chatWrap = document.querySelector('.chatwrap');
        var container = document.querySelector('.container'); // 게시판을 감싸는 클래스가 필요합니다.

        if (chatWrap.style.right === '0px') {
            // 채팅방을 숨길 때
            chatWrap.style.right = '-400px'; // 채팅방을 화면 오른쪽 밖으로 이동
            container.style.marginLeft = '0'; // 게시판을 원위치로
        } else {
            // 채팅방을 보일 때
            chatWrap.style.right = '0'; // 채팅방을 화면 안으로 이동
            container.style.marginLeft = '-400px'; // 게시판을 왼쪽으로 이동
        }
    }
