call runcrud
if "%ERRORLEVEL%" == "0" goto openbrowser
timeout 30
echo.
echo runcrud script has faild
goto fail

goto openbrowser

:openbrowser
start opera.exe http://localhost:8080/crud/v1/task/getTasks
if "%ERRORLEVEL%" == "0" goto end
echo.
echo browser can not be open
goto fail

:fail
echo.
echo There were errors

:end
echo.
echo Work is finished. Thank you, to turn off pls use scr. 'wylacztomcat'
