
# Weather Info using Pincode and Date 
 Our Spring Boot application provides weather information based on a specific date and pincode using the OpenWeather API for historical weather data (https://openweathermap.org/api/history-api-timestamp) and the OpenWeather GeoCoding API for location data (https://openweathermap.org/api/geocoding-api).


### Request
`GET:  /weather` \
 `GET`  'http://localhost:8080/weather?pincode={pincode}&for_date={date}'

#### Parameters
`pincode`  required \
`date` required 

### Example of API Call
'http://localhost:8080/weather?pincode=411014&for_date=2020-10-15'
### Example of API Response 
```--data-raw 
{
    "pincode": 411014,
    "place": "Viman Nagar",
    "date": "2020-10-15",
    "temperature": 298.67,
    "humidity": 24,
    "pressure": 1017,
    "windSpeed": 0.41,
    "description": "clear sky"
}
```
### Technology
1. Java
2. Spring Boot
3. Spring Data Jpa
4. Mysql
5. REST API
6. RestTemplate
