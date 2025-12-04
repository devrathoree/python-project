from flask import Flask
import os

app = Flask(__name__)

@app.route('/')
def hello_world():
    my_var = os.getenv("MY_SECRET_VALUE", "default-value")
    return f"Hello world! how are you {my_var}"

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=5000)
