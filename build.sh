#!/bin/bash

cd src/main/arnoldc/
java -jar ../../../ArnoldC.jar us/loadingpleasewait/arnoldrobot/Arnold.arnoldc # compile ArnoldC source code
mv us/loadingpleasewait/arnoldrobot/Arnold.class ../../../bin/us/loadingpleasewait/arnoldrobot/Arnold.class
cd ../../../bin/
jar -cvf Arnold.jar us/loadingpleasewait/arnoldrobot/Arnold.class # create Arnold.jar in bin directory
cd ..
ant compile # run WPILib ant build file
