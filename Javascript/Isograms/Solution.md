    function isIsogram(str){ 
      return !/(\w).*\1/i.test(str)
    }
>정규식 크