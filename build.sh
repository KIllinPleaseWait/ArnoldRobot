#!/bin/bash

cd src/main/arnoldc/
if [[ ! -f ../../../ArnoldC.jar ]]; then
  echo "Place ArnoldC.jar in the same directory as build.sh"
  exit 0
fi
java -jar ../../../ArnoldC.jar us/loadingpleasewait/arnoldrobot/Arnold.arnoldc # compile ArnoldC source code
# make sure directories are there
if [[ ! -d ../../../bin ]]; then
  mkdir ../../../bin
fi
if [[ ! -d ../../../bin/us/ ]]; then
  mkdir ../../../bin/us/
fi
if [[ ! -d ../../../bin/us/loadingpleasewait/ ]]; then
  mkdir ../../../bin/us/loadingpleasewait/
fi
if [[ ! -d ../../../bin/us/loadingpleasewait/arnoldrobot/ ]]; then
  mkdir ../../../bin/us/loadingpleasewait/arnoldrobot/
fi
mv us/loadingpleasewait/arnoldrobot/Arnold.class ../../../bin/us/loadingpleasewait/arnoldrobot/Arnold.class
cd ../../../bin/
jar -cvf Arnold.jar us/loadingpleasewait/arnoldrobot/Arnold.class # create Arnold.jar in bin directory
cd ..
ant jar # run WPILib ant build file
