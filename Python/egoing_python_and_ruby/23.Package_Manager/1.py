import requests
r = requests.get('https://dataquestio.github.io/web-scraping-pages/simple.html')
print(r.text)
