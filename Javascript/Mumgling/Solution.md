## Best Practice
    function accum(s) {
      return s.split('').map((c, i) => (c.toUpperCase() + c.toLowerCase().repeat(i))).join('-');
    }
>이런게 좀 더 js다운듯 하다