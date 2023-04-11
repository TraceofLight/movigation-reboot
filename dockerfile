FROM node:16

WORKDIR /app

CMD ["cd", "frontend"]

COPY package.json .
RUN npm install
COPY . .

CMD ["npm", "run", "dev"]
