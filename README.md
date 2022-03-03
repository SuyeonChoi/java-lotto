# java-lotto

로또 미션 저장소

## 구현 기능 목록

- [x] 구입 금액 입력 기능
  - [x] 숫자만 입력 가능
  - [x] 로또 1장(1000원) 가격 이상 입력 가능

- [x] 구입 금액으로 구매할 수 있는 로또 총 개수 계산

- [x] 수동으로 구매할 로또 수 입력 기능
  - [x] 계산된 최대 구매가능한 로또 개수를 초과할 수 없음

- [x] 수동으로 번호를 입력하여 로또를 구입하는 기능
  - [x] 중복되지 않은 6개 숫자 입력
  - [x] 1 이상 45 이하의 번호만 입력 가능
  - [x] 쉼표(,)로 로또 번호를 구분하고 숫자만 입력 가능
  - [x] 개행으로 로또를 구분하고 숫자만 입력 가능
  - [x] 수동으로 구매하지 않는 경우, 해당 입력 기능 생략

- [ ] (구입하는 총 로또 개수 - 수동 구매한 로또 개수)만큼 자동으로 로또 생성
- [ ] 구입한 로또에 대해 로또 리스트 생성

- [x] 로또 번호 생성 기능
  - [x] 서로 중복되지 않고 랜덤한 6개의 숫자 생성

- [x] 로또 당첨 번호 입력
  - [x] 중복되지 않은 6개 숫자 입력
  - [x] 쉼표(,)로 구분하고 숫자만 입력 가능

- [x] 보너스 볼 입력
  - [x] 당첨 번호와 중복될 수 없음

- [x] 로또 당첨 확인
  - [x] 당첨번호와 일치하는 로또 숫자 개수 카운트
  - [x] 보너스 번호 보유 여부 확인

- [x] 당첨된 로또 개수 조회
  - [x] 로또 결과 조회

- [ ] 구입한 로또 유형과 개수 출력
- [ ] 자동으로 구입한 로또 번호 출력

- [x] 당첨 통계 출력
  - [x] 일치 개수에 따라 로또 당첨 결과를 출력
  - [x] 당첨번호와 3개 일치, 4개 일치, 5개 일치, 5개와 보너스 번호가 일치, 6개 일치하는 로또 개수를 출력

- [x] 수익률 출력
  - [x] (당첨금액 / 구입금액)으로 수익률을 계산하여 출력
  - [x] 수익률은 소수점 셋째자리에서 반올림
  - [x] 수익률 결과에 따라 손해 또는 이득 정보 출력

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)
