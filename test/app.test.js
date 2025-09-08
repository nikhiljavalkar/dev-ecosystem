const greet = require('../src/app');

describe('greet function', () => {
    test('should greet with the correct name', () => {
        expect(greet('World')).toBe('Hello, World!');
    });
});