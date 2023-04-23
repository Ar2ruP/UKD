using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class MainMenu : MonoBehaviour
{
    public void PlayAlbum()
    {
        SceneManager.LoadScene(1);
    }

    public void DownloadAlbums()
    {
        SceneManager.LoadScene(2);
    }
    
    public void Settings()
    {
        SceneManager.LoadScene(3);
    }


    public void Exit()
    {
        Application.Quit();
    }
}