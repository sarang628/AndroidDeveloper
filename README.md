https://developer.android.com/codelabs/basic-android-kotlin-compose-first-app?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-first-app#0

# 1. Before you begin
```
1. Before you begin

안드로이드 스튜디오 설치. 사양 확인

안드로이드 스튜디오에서 제공하는 탬플릿으로 첫 앱 만들기

코틀린과 Jetpack으로 앱 커스터마이즈 하기

안드로이드 스튜디오가 업데이트 될 때마다 UI가 조금씩 바뀌어 튜토리얼과 디자인지 좀 다른 수 있지만 괜찮음.

전제 조건
- 코틀린 지식

필요 한 것
- 최신버전 안드로이드 스튜디오

무엇을 배울 것인가?
- 안드로이드 스튜디오에서 앱 생성
- 안드로이드 Preview 도구와 함께 앱 실행
- 코틀린으로 text 업데이트
- Jetpack Compose로 UI 업데이트 방법

∫
무엇을 빌드?
- 당신을 소개하는 앱
```

안드로이드 스튜디오는 설치되어 있다.

다음장으로 넘어가 보자.

# 2. Create a project using the template
https://developer.android.com/codelabs/basic-android-kotlin-compose-first-app?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-first-app#1

```
안드로이드 스튜디오에선 프로젝트 탬플릿은 (특정 타입의 앱을 위한 청사진을 제공하는 안드로이드) 프로젝트 이다.
'템플릿은 프로젝트의 구조'와 '안드로이드 스튜디오가 프로젝트를 빌드하는데 필요로 하는 파일'을 생성한다
선택한 탬플릿은 빨리 개발할 수 있도록 '시작 코드'를 제공.

- Phone and Tablet 선택
- Empty Activity 선택
- Name: Greeting Card
- Package name: com.example.greetingcard
- Save location : 원하는 위치
- API 24: Android 7.0 (Nougat)
- MainActivity 이동
- Click Split
- 프로젝트 개발 화면
    - 좌측 프로젝트 뷰 - 프로젝트 파일 및 폴더
    - 중앙 코드 뷰 - 코드를 수정하는 영역
    - 우측 디자인 뷰 - 앱의 디자인을 미리 볼 수 있는 영역
- Build & Refresh를 누르면 미리보기 볼 수 있음.
```

<img src = "./screenshots/create_a_project_using_the_template.png" width="600"/>

