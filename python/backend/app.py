from flask import Flask, request, Response
from flask_cors import CORS
import time, subprocess, queue, threading

app = Flask(__name__)
CORS(app)

message_queue = queue.Queue()


@app.route('/generate', methods=['POST'])
def generate():
    message = request.data.decode('utf-8').replace('\r', '')
    with open('monitor.py', 'w') as f:
        f.write(message)
    try:
        subprocess.Popen(['C:\\Users\\moone\\anaconda3\\python', 'monitor.py'])
        return 'Verifier started successfully', 200
    except Exception as e:
        print("Error starting verifier script: ", e)
        return str(e), 500

@app.route('/stream')
def stream():
    def event_stream():
        while True:
            result = message_queue.get()
            print(f"sending: {result} to front\n\n")
            yield f"data: {result}\n\n"
    return Response(event_stream(), mimetype='text/event-stream')

@app.route('/push', methods=['POST'])
def push():
    data = request.data.decode('utf-8')
    print(f"received: {data} from verifier")
    message_queue.put(data)
    print(f"pushed to queue: {data}")
    return 'Pushed to queue', 200

if __name__ == '__main__':
    app.run(debug=True, threaded=True)
