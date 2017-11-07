#list.insert(0,llenar) #inicio
def Conway(inicio):
    list = inicio
    print(inicio)
    list =1,inicio
    cuenta=list.count(inicio)
    #list =cuenta,inicio
    print(1,inicio) #[1 1]
    for i in range(3):
        cont=1
        a=[1]
        for n in range(len(list)):
            num=list[n]
            num2=list[n-1]
            if (num==num2):
                cont=cont+1
            else:
                a=a+[cont,num2]
                cont=1
            list=cont,a
            a += [cont, num2]

            print(list)


#    i = 0
    #while (i < len(list)):
     #   num=list[i]
#
 #       yield num
  #      i += 1

c=Conway(1)
#print(list(c))
#print(c)