# NCR POC

## Requirement

Write program to process a work using multi thread and write client program as well to initiate work, 
the thread should not exceed 5 and if there is more than 5 work getting assigned concurrently, 
additional thread should wait for 5 seconds for next available work thread to get processed.

## GIT URL
https://github.com/anilkumarkatta204/ncr-poc.git

## Setup

Command Line Interface:

Pre-Requisite: Maven Latest Distributions

1. Open Command Line Interface
2. run following command </br>
   ```
   git clone https://github.com/anilkumarkatta204/ncr-poc.git
   ```
3. change directory to noc-poc</br>
   ```
   cd noc-poc
   ```
4. run ```mvn clean``` package which would clean, compile sources and create a jar file in target file
5. run ```java -jar .\target\ncr-poc.0.0.1-SNAPSHOT-jar-with-dependencies.jar```
6. Follow the screen instructions :-)

PS: Please update Root logger option to DEBUG for detailed logging.
