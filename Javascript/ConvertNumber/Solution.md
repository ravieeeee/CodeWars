## Best Practice
    function digitize(n){
      return (n + '').split('').map(Number).reverse();
    }
>map은 갓함수다...