const IsValidTo = (value) => {
    const items = [];

    for (const val of value) {
        if (val === '{' || val === '[' || val === '(') {
            items.push(val);
        } else {
            if (items.length < 0 && val.length > 0) {
                return false;
            } else {
                if (val === '}' && items[items.length - 1] === '{') {
                    items.pop();
                } else if (val === ']' && items[items.length - 1] === '[') {
                    items.pop();
                } else if (val === ')' && items[items.length - 1] === '(') {
                    items.pop();
                } else {
                    return false;
                }
            }
        }
    }
    if (items.length > 0) {
        return false;
    }
    return true;
}