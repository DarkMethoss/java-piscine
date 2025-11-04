#!/bin/sh

# Usage:
#   ./run.sh compile           # only compile
#   ./run.sh run [args...]     # only run
#   ./run.sh [args...]         # default: compile and run with args

BUILD_DIR="build"
MAIN_CLASS="ExerciseRunner"

# Function to compile Java files
compile() {
    javac *.java -d "$BUILD_DIR" || { echo "Compilation failed."; exit 1; }
}

# Function to run the main class
run() {
    java -cp "$BUILD_DIR" "$MAIN_CLASS" "$@"
}

# Main logic
ACTION="$1"

if [ "$ACTION" = "compile" ]; then
    compile

elif [ "$ACTION" = "run" ]; then
    shift
    run "$@"

else
    compile
    run "$@"
fi
