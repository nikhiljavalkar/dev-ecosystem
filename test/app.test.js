const exampleFunction = require('../src/app.js');

describe('Example Function', () => {
    it('should call console.log', () => {
        const logSpy = jest.spyOn(console, 'log');
        exampleFunction();
        expect(logSpy).toHaveBeenCalledWith('This is an example function');
        logSpy.mockRestore();
    });
});
