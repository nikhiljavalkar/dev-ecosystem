from flask import Flask, request, jsonify

app = Flask(__name__)

@app.route('/ntsterror/v1/add')
def add():
    a = request.args.get('a', type=float)
    b = request.args.get('b', type=float)
    return jsonify(result=a + b)

@app.route('/ntsterror/v1/subtarct')
def subtract():
    a = request.args.get('a', type=float)
    b = request.args.get('b', type=float)
    return jsonify(result=a - b)

@app.route('/ntsterror/v1/multiply')
def multiply():
    a = request.args.get('a', type=float)
    b = request.args.get('b', type=float)
    return jsonify(result=a * b)

@app.route('/ntsterror/v1/division')
def division():
    a = request.args.get('a', type=float)
    b = request.args.get('b', type=float)
    if b == 0:
        return jsonify(error='Division by zero is not allowed'), 400
    return jsonify(result=a / b)

if __name__ == '__main__':
    app.run(debug=True)