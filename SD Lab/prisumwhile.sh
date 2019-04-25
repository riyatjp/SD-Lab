echo "Enter a number: "
read n
sum=0
echo sum is:
for((i=1; i<=n; i++))
do
f=0
for((j=2; j<i; j++))
do
if [ `expr $i % $j` -eq 0 ]
then 
f=1
fi
done
if [ $f -eq 0 ]
then
sum=$(($sum+$i))
fi
done
echo $sum
   
   
