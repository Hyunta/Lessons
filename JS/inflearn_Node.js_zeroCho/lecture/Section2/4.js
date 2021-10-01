const relationship1 = {
    name: 'zero',
    friends: ['nero', 'hexo', 'xero'],
    logFriends: function () {
        const that = this;
        this.friends.forEach(function (friend) {
            console.log(that.name, friend);
        });
    }
};
relationship1.logFriends();

// this가 필요로 한다면 function을 쓰고 아니면 화살표함수를 쓴다.