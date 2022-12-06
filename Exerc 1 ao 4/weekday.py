import datetime
import calendar
 
def findDay(date):
    dia = datetime.datetime.strptime(date, '%d %m %Y').weekday()
    return (calendar.day_name[dia])
 
# Driver program
date = '06 12 2022'
print(findDay(date))