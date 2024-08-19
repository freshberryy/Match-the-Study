const chat = (function(){
    const myName = "blue";

    function init() {
        $(document).on('keydown', 'div.input-div textarea', function(e){
            if(e.keyCode == 13 && !e.shiftKey) {  // shiftkey -> shiftKey
                e.preventDefault();  // preventdefault -> preventDefault
                const message = $(this).val();

                sendMessage(message);
                clearTextarea();  // cleatTextarea -> clearTextarea
            }
        });
    }

    function createMessageTag(LR_className, senderName, message){
        let chatLi = $('div.chat.format ul li').clone();

        chatLi.addClass(LR_className);
        chatLi.find('.sender span').text(senderName);
        chatLi.find('.message span').text(message);  // .message.span -> .message span

        return chatLi;
    }

    function sendMessage(message) {
        const data = {
            "senderName": "blue",
            "message": message
        };

        receive(data);  // 'resive' -> 'receive'
    }

    function clearTextarea() {
        $('div.input-div textarea').val('');
    }

    function receive(data) {  // resive -> receive
        const LR = (data.senderName != myName) ? "left" : "right";
        const messageTag = createMessageTag(LR, data.senderName, data.message);
        $('div.chat ul').append(messageTag);  // 메시지를 실제로 추가
    }

    return {
        'init': init
    };
})();

$(function(){
    chat.init();
});


