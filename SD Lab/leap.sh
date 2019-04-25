echo "Enter a year: "
read x
y=$(($x % 4))
if [ $y == 0 ]
   then
   echo $x is a leap year
else
   echo $x is not a leap year
fi
