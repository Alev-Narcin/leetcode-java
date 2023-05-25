const LongestCommonPrefix = (val) => {
    let prefix = val[0];

    for (let i = 1; i < val.length; i++) {
        while (!val[i].startsWith(prefix)) {
            prefix = prefix.substring(0, prefix.length - 1);
            if (prefix === null) {
                return "";
            }
        }
    }
    return prefix;
}