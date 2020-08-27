// "p" stands for "previous" [selected mountain height]
// "c" stands for "current" [mountain height]
// "I" stands for current "index" [of mountain]
// "a" stands for the full "array" [of mountains]
while (true)
  print(
    [...Array(8)]
      .map((n) => parseInt(readline()))
      .reduce((p, c, i, a) => (c > a[p] ? i : p), 0)
  );
