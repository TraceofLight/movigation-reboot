# Movigation의 Refactoring Log

## [:cinema:Movigation Website Link](https://movigation.app/)

## 1. 프로젝트를 다시 작업하는 이유?

기존에 완성했던 프로젝트는 Django와 VueJS를 기반으로 완성되었는데 개인적으로 즐거운 마음을 가지고 완성했음에도 실력의 부족으로 멀끔한 결과물을 내놓지 못했던 것에 아쉬움이 남아 다시 진행하게 되었다. 해당 과정을 진행하면서 크게 바뀔 부분은 다음과 같을 예정이다.

- Django &rarr; Spring Boot, VueJS &rarr; React 기반으로 프레임워크를 변경
- Django의 Sqlite를 사용하는 대신 MariaDB를 활용한 Database를 구축
- 적절한 File Structure의 사용, Git Branch 관리 전략을 통한 개발 선진화
- ~~프로젝트의 무중단 자동 배포 진행~~ &rarr; 인스턴스 성능 이슈로 필요에 따라 자동 배포만 사용할 가능성 존재

## 2. 개발 일지

### 2023-04-07

- 프로젝트 Git 생성
- URL 구매
- 인스턴스 생성 

### 2023-04-12

- Spring Boot 및 React 기본 빌드 후 Jenkins를 활용한 배포 진행
- DB 연결 이슈 해결

### 2023-04-14

- Spring Boot의 Swagger와 연관된 빌드 오류 해결

### 2023-04-17

- 기존 Sqlite를 기반으로 작업한 DB를 MySQL Workbench의 Reverse Engineering 기능을 활용하여 재작성
- ForeignKey 이슈 발생 &rarr; 기존 프로젝트 진행하면서 ERD를 깔끔하게 작성하지 않은 것이 이유로 보임

### 2023-04-18

- DB 재구축 성공
- 기능 명세 및 API 명세 재구축 시작
- Figma를 통한 UI/UX 개선 시작
