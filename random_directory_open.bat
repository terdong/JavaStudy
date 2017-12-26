@echo off
setlocal

:: Create numbered list of files in a temporary file
set dirList="dir_list.txt"
set tempFile="temp_file.txt"
IF NOT EXIST %dirList% (
dir /b /ad %1 | findstr /n "^" >"%dirList%"
)

:: Count the files
for /f %%N in ('type "%dirList%" ^| find /c /v ""') do set cnt=%%N

call :openRandomFile

exit /b

:openRandomFile
set /a "randomNum=(%random% %% cnt) + 1"
for /f "tokens=1* delims=:" %%A in (
  'findstr "^%randomNum%:" "%dirList%"'
) do (
%SystemRoot%\explorer.exe "%%B"
findstr /v /i /c:"%%B" %dirList% > %tempFile%
xcopy %tempFile% %dirList% /y
del %tempFile%
)
exit /b

endlocal
pause 
