const exampleFunction = require('../src/example');

test('example function test', () => {
    console.log = jest.fn();
    exampleFunction();
    expect(console.log).toHaveBeenCalledWith('This is an example function.');
});
