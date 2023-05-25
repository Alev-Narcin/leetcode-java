const RomanToInt = (string) => {
    const charterAndValue = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
    };

    let res = 0;

    for (let i = 0; i < string.length; i++) {
        if (charterAndValue[string[i]] < charterAndValue[string[i + 1]]) {
            res -= charterAndValue[string[i]];
        } else {
            res += charterAndValue[string[i]];
        }
    }
    return res;


}