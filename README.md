# HourlyShiftRateCalculator
User Stories:
1. As a small business owner I want to log employee/contractor name, salary(rate per hour), shift start (date & time), shift end (date & time) so that I can calculate hours worked and amount to be paid.
2. As an employee/contractor I want to print my shift log so that I can verify hours worked and verify the calculations of amount to be received from business owmer.
3. As a business owner, I want to save shift log for record keeping.

Implementation (in Java using NetBeans IDE): 
1. Created user interfaces extending JFrame class.
2. Added lables and fields for name, hourly rate.
3. Added user interfaces for shift start, shift end selection.
4. Placed button to calculate hours and minutes worked
5. Added fields to display hours and minutes for each shift.
6. Placed calculate button and dialog box to display calculated result.
7. Placed save button to write shift log to text file.
8. Print button (implementation pending)
9. Delete additional  rows (implementation pending)

User manual for Hourly Shift Rate Calculator:
1. Run the application
2. Enter name and hourly rate
3. Select shift-start (date & time) and shift-end (date & time). Click 'New Row' button to add additional,  shift if needed.
4. Make selection for each shift-start & shift-end 
5. Once done with step 3 and/or step 4, click 'Calculate' button.
6. Dialog box will pop up dispalyinv hours worked and anount to be paid. View/verify the calculated information against the shift log entered, click ok.
7. If there is any human error, Follow steps from 4 to 6. Else go to step 8.
8. Click save file.
9. Click exit.
10. The information you entered is saved in the same directory in which the application is running. File name is 'shiftLog.txt'
11. Rename the file and move it to your desired directory.
