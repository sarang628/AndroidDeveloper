https://developer.android.com/courses/pathways/android-basics-compose-unit-1-pathway-3

# [1. Intro to Jetpack Compose](https://developer.android.com/courses/pathways/android-basics-compose-unit-1-pathway-3)
```
프로젝트 생성과 간단한 UI를 만들어봤다면

이번엔 좀 더 UI에 대해 자세히 배워보자.

compose는 Jetpack 라이브러리 중 하나, 모던 UI 라이브러리이다.

기존 xml기반 개발방식과 비교해 훨씬 간결하게 작성할 수 있다.

composable 함수는 파라미터를 받아 UI를 그리는데 사용할 수 있다.

composable은 immutable이다 한번 그려진 것은 바꿀 수 없음.

앱 데이터가 변경되 UI 변경이 필요한 경우, 자동으로 함수를 재 호출해 화면을 다시 그린다.

새로운 상태가 되면 새로운 UI를 그림. recomposition이라고 함.

Composable함수는 입력에 의해서만 제어 된다.

리컴포지션 지 변경되지 않은 데이터에 대해서는 skip하는 최적화 기능을 가지고 있다.

컴포즈는 쉽게 리스트를 만들수도 있고 커스텀을 할 수 도 있다. 애니메이션과 테스트도.

```

# [2. Design a birthday card app] 

```

- Effective
- Efficient
- Beautiful
- Accessible


```

# [3 Build a simple app with text composables](https://developer.android.com/codelabs/basic-android-kotlin-compose-text-composables?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-text-composables#0)
HappyBirthday module 참고

# [4 Add images to your Android app](https://developer.android.com/codelabs/basic-android-kotlin-compose-add-images?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-add-images#0)

## [1. Before you begin](https://developer.android.com/codelabs/basic-android-kotlin-compose-add-images?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-add-images#0)

```
Prerequisites
- 안드로이드 스튜디오로 앱 생성과 실행 방법.
- composable UI 요소들 추가 방법 

What you'll learn
- 이미지, 사진 추가.
- Image composable로 이미지 표시.
- String 리소스 사용 모범 사례

What you'll build
- 생일 축하 앱에 이미지 추가

What you'll need
- 안드로이드 스튜디오
- 이전에 만든 생일축하 앱 앱
```

## [2. Set up your app](https://developer.android.com/codelabs/basic-android-kotlin-compose-add-images?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-add-images#1)
