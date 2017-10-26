    function gimme(a) {
      return a.indexOf(a.concat().sort(function(a, b) { return a - b })[1])
    }
>passed by reference이기 때문에 새 변수에 slice해서 넣었는데 그냥 원래 변수에 concat해서 인덱스로 접근해도 되는구나아ㅏ