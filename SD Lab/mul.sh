echo "Enter a number: "
read n
for(( i=1; i<=10; i++ ))
do 
   y=$(($n*$i))
   echo "$n * $i = $y"
done

