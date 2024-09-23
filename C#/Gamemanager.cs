using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;    // UI�� ����� �� �ʿ�

public class Gamemanager : MonoBehaviour
{
    public GameObject mainImage;    // �̹����� ��Ƶδ� GameObject
    public Sprite gameOverSpr;    // GAME OVER �̹���
    public Sprite gameClearSpr;    // GAME CLEAR �̹���
    public GameObject panel;    // �г�
    public GameObject restartButton;    // RESTART ��ư
    public GameObject nextButton;    // NEXT ��ư

    //+++ �ð����� �߰� +++
    public GameObject timeBar; // �ð� ǥ�� �̹���
    public GameObject timeText; //�ð� �ؽ�Ʈ
    TimeController timeCnt; // TimeController

    Image titleImage;    // �̹����� ǥ���ϴ� Image ������Ʈ

    // Start is called before the first frame update
    void Start()
    {
        // �̹��� �����
        Invoke("InactiveImage", 1.0f);
        // ��ư(�г�)�� �����
        panel.SetActive(false);

        //+++ �ð����� �߰� +++
        //TimeController ������
        timeCnt = GetComponent<TimeController>();
        if(timeCnt != null)
        {
            if(timeCnt.gameTime == 0.0f)
            {
                timeBar.SetActive(false); //�ð����� ������ ����
            }
        }
    }

    // Update is called once per frame
    void Update()
    {
        if (playercontroller.gameState == "gameclear")
        {
            // ���� Ŭ����
            mainImage.SetActive(true);    // �̹��� ǥ��
            panel.SetActive(true);    // ��ư(�г�)�� ǥ��
            // RESTART ��ư ��ȿȭ
            Button bt = restartButton.GetComponent<Button>();
            bt.interactable = false;
            mainImage.GetComponent<Image>().sprite = gameClearSpr;
            playercontroller.gameState = "gameend";

            //+++ �ð����� �߰� +++
            if(timeCnt != null)
            {
                timeCnt.isTimeOver = true; // �ð� ī��Ʈ ����
            }
        }
        else if (playercontroller.gameState == "gameover")
        {
            // ���� ����
            mainImage.SetActive(true);    // �̹��� ǥ��
            panel.SetActive(true);    // ��ư(�г�)�� ǥ��
            // NEXT ��ư�� ��Ȱ��
            Button bt = nextButton.GetComponent<Button>();
            bt.interactable = false;
            mainImage.GetComponent<Image>().sprite = gameOverSpr;
            playercontroller.gameState = "gameend";

            //+++ �ð����� �߰� +++
            if (timeCnt != null)
            {
                timeCnt.isTimeOver = true; // �ð� ī��Ʈ ����
            }
        }
        else if (playercontroller.gameState == "playing")
        {
            // ���� ��
            GameObject player = GameObject.FindGameObjectWithTag("Player");

            //PlayerController ��������
            playercontroller playerCnt = player.GetComponent<playercontroller>();
            //+++ �ð����� �߰� +++
            //�ð� ����
            if(timeCnt != null)
            {
                if(timeCnt.gameTime > 0.0f)
                {
                    //������ �Ҵ��Ͽ� �Ҽ��� ���ϸ� ����
                    int time = (int)timeCnt.displayTime;

                    //�ð� ����
                    timeText.GetComponent<Text>().text = time.ToString();
                    if(time == 0)
                    {
                        playerCnt.GameOver(); //���� ����
                    }
                }
            }
        }
    }
    // �̹��� �����
    void InactiveImage()
    {
        mainImage.SetActive(false);
    }
}

