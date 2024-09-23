using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;    // UI를 사용할 때 필요

public class Gamemanager : MonoBehaviour
{
    public GameObject mainImage;    // 이미지를 담아두는 GameObject
    public Sprite gameOverSpr;    // GAME OVER 이미지
    public Sprite gameClearSpr;    // GAME CLEAR 이미지
    public GameObject panel;    // 패널
    public GameObject restartButton;    // RESTART 버튼
    public GameObject nextButton;    // NEXT 버튼

    //+++ 시간제한 추가 +++
    public GameObject timeBar; // 시간 표시 이미지
    public GameObject timeText; //시간 텍스트
    TimeController timeCnt; // TimeController

    Image titleImage;    // 이미지를 표시하는 Image 컴포넌트

    // Start is called before the first frame update
    void Start()
    {
        // 이미지 숨기기
        Invoke("InactiveImage", 1.0f);
        // 버튼(패널)을 숨기기
        panel.SetActive(false);

        //+++ 시간제한 추가 +++
        //TimeController 가져옴
        timeCnt = GetComponent<TimeController>();
        if(timeCnt != null)
        {
            if(timeCnt.gameTime == 0.0f)
            {
                timeBar.SetActive(false); //시간제한 없으면 숨김
            }
        }
    }

    // Update is called once per frame
    void Update()
    {
        if (playercontroller.gameState == "gameclear")
        {
            // 게임 클리어
            mainImage.SetActive(true);    // 이미지 표시
            panel.SetActive(true);    // 버튼(패널)을 표시
            // RESTART 버튼 무효화
            Button bt = restartButton.GetComponent<Button>();
            bt.interactable = false;
            mainImage.GetComponent<Image>().sprite = gameClearSpr;
            playercontroller.gameState = "gameend";

            //+++ 시간제한 추가 +++
            if(timeCnt != null)
            {
                timeCnt.isTimeOver = true; // 시간 카운트 중지
            }
        }
        else if (playercontroller.gameState == "gameover")
        {
            // 게임 오버
            mainImage.SetActive(true);    // 이미지 표시
            panel.SetActive(true);    // 버튼(패널)을 표시
            // NEXT 버튼을 비활성
            Button bt = nextButton.GetComponent<Button>();
            bt.interactable = false;
            mainImage.GetComponent<Image>().sprite = gameOverSpr;
            playercontroller.gameState = "gameend";

            //+++ 시간제한 추가 +++
            if (timeCnt != null)
            {
                timeCnt.isTimeOver = true; // 시간 카운트 중지
            }
        }
        else if (playercontroller.gameState == "playing")
        {
            // 게임 중
            GameObject player = GameObject.FindGameObjectWithTag("Player");

            //PlayerController 가져오기
            playercontroller playerCnt = player.GetComponent<playercontroller>();
            //+++ 시간제한 추가 +++
            //시간 갱신
            if(timeCnt != null)
            {
                if(timeCnt.gameTime > 0.0f)
                {
                    //정수에 할당하여 소수점 이하를 버림
                    int time = (int)timeCnt.displayTime;

                    //시간 갱신
                    timeText.GetComponent<Text>().text = time.ToString();
                    if(time == 0)
                    {
                        playerCnt.GameOver(); //게임 오버
                    }
                }
            }
        }
    }
    // 이미지 숨기기
    void InactiveImage()
    {
        mainImage.SetActive(false);
    }
}

