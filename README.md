 
IMAD PRACTICUM
Sayjel Shamsundar- ST10446790
 
 
Purpose 
The purpose of this app is to allow users to get detailed information about the weather for each day and provides the average temperature for each week. This helps users plan their activities based on the weather forecast.
 ![image](https://github.com/sayjel/sayjelpracticum/assets/163901900/92919878-874d-48a7-b8c2-f1577b10a253)

Key Features
1. Weekly Average Temperature: Displays the average temperature for the entire week.
2. Detailed Daily Information: Allows users to view detailed weather information (such as temperature, humidity, wind speed, etc.) for each day of the week.
3. User-Friendly Navigation: Provides an intuitive interface for navigating between the weekly summary and daily details.
 ![image](https://github.com/sayjel/sayjelpracticum/assets/163901900/f286f936-794f-4d30-b39d-06d599c00812)

Purpose of Arrays, Loops, and Screen Navigation
 Arrays
- Purpose: Arrays are used to store weather data for each day of the week. This includes temperatures, humidity levels, wind speeds, and other relevant weather information.
 - Arrays help in efficiently accessing and manipulating weather data for each day. They allow for easy iteration and data retrieval.
Loops
- Purpose: Loops are utilized to process the data stored in arrays, such as calculating the average temperature or displaying detailed information for each day.
 - Loops enable repetitive operations, such as summing up temperatures or iterating through daily weather data to display it.
 Screen Navigation
- Purpose: Screen navigation provides a way for users to switch between different views in the app, such as the weekly summary screen and the daily details screen.
Example Workflow
1. Average Temperature Calculation: A loop processes the array of daily temperatures to calculate the average temperature for the week.
2. User Interface:
    - The weekly summary screen displays the calculated average temperature.
    - Users can tap on a day to view more detailed information.
    - The app navigates to the daily details screen, where the detailed weather data for the selected day is displayed.
 ![image](https://github.com/sayjel/sayjelpracticum/assets/163901900/d20b719c-fcf3-45bf-9d6d-a16213cd1d67)

Conclusion
The weather app leverages arrays for data storage, loops for processing and displaying data, and intuitive screen navigation to provide a seamless user experience. By combining these elements, the app delivers comprehensive and easily accessible weather information, helping users stay informed and plan their activities effectively

Pseudocode
1)  Start

    Private Button btnNext, btnSave, btnClear, btnExit
    Private EditText etDay, etMinTemp, etMaxTemp, etConditions
    Private TextView tvMessage
    Private List dayList, minTempList, maxTempList, weatherList

    Method onCreate(Bundle savedInstanceState):
        Call superclass onCreate method with savedInstanceState
        Set the content view to the layout activity_mainscreen

        Initialize etDay by finding the view with id et_day
        Initialize etMinTemp by finding the view with id et_min_temp
        Initialize etMaxTemp by finding the view with id et_max_temp
        Initialize etConditions by finding the view with id et_conditions
        Initialize tvMessage by finding the view with id tv_message

        Initialize btnSave by finding the view with id btn_save
        Initialize btnClear by finding the view with id btn_clear
        Initialize btnExit by finding the view with id btn_exit
        Initialize btnNext by finding the view with id btn_next

        Set onClickListener for btnSave:
            Retrieve text from etDay, etMinTemp, etMaxTemp, etConditions
            Convert etMinTemp and etMaxTemp text to Float
            If any input is invalid:
                Set tvMessage text to "Please fill all fields"
                Return from onClickListener
            Add day to dayList
            Add minTemp to minTempList
            Add maxTemp to maxTempList
            Add conditions to weatherList
            Set tvMessage text to "Saved"

        Set onClickListener for btnClear:
            Clear text in etDay, etMinTemp, etMaxTemp, etConditions
            Set tvMessage text to ""

        Set onClickListener for btnNext:
            If dayList is not empty:
                Create an intent to start detailedviewscreen
                Add dayList to intent
                Add minTempList to intent
                Add maxTempList to intent
                Add weatherList to intent
                Start the detailedviewscreen activity with the intent
            Else:
                Set tvMessage text to "No data to show"
        Set onClickListener for btnExit:
            Call finish to close the activity
Stop 
2)  Start 
    Private TextView tvSum
        Initialize tvSum by finding the view with id tvSum
        Retrieve days list from intent
        Retrieve minTemps array from intent
        Retrieve maxTemps array from intent
        Retrieve conditions list from intent

        If days is not null AND minTemps is not null AND maxTemps is not null AND conditions is not null:
            Initialize a string builder for the summary
            For each index in days:
                Append day, minTemp, maxTemp, and condition to the summary builder
            Set tvSum text to the summary string
        Else:
            Set tvSum text to "No data available"
End 


