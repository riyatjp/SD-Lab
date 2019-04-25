echo "Enter a number:"
read a
b=$(($a % 2))
if [ $a == 0 ]
   then
   echo $a is zero
elif [ $b == 0 ]
    then
    echo $a is even
else
    echo $a is odd
fi
