FROM ubuntu as base

WORKDIR /app

COPY requirements.txt .

RUN apt-get update && apt-get install -y python3-pip && pip3 install virtualenv

COPY . /app

FROM python 

COPY --from=base /app /app

WORKDIR /app

RUN pip install Flask

CMD ["python", "app.py"]





