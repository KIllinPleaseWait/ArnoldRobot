cd src/main/arnoldc/
java -jar ../../../ArnoldC.jar us/loadingpleasewait/arnoldrobot/Arnold.arnoldc
move "%~dp0\src\main\arnoldc/us\loadingpleasewait\arnoldrobot\Arnold.class" "%~dp0\bin\us\loadingpleasewait\arnoldrobot\Arnold.class"
cd ../../../bin/
jar -cvf Arnold.jar us/loadingpleasewait/arnoldrobot/Arnold.class
cd ..
ant compile
