# TraderLanguage

TraderLanguage is a Domain-Specific Language (DSL) designed for manual traders transitioning into automated trading. Developed with the goal of simplifying the automation of trading strategies, TraderLanguage abstracts the complexities involved in connecting to brokers, implementing strategies, and managing trading bots, allowing users to focus on strategy development without needing deep programming knowledge.
**DO NOT USE ON A LIVE ACCOUNT!!!** This DSL is used to show the automation of the trading execution process, and thus shows these using trading strategies that have not been backtested.

## Features

- **Simplified Trading Syntax:** Intuitive and domain-specific textual syntax tailored for financial trading.
- **Automated Trading Bot Management:** Easily define, execute, and manage trading bots with predefined strategies.
- **Direct Broker Integration:** Simplified commands to connect directly with trading platforms and execute trades.
- **Type Safety and Validation:** Comprehensive validations for variable naming, type checking, and logical constructs to ensure the reliability of trading scripts.
- **Support for Real-Time Trading:** Optimized for real-time trading, enabling swift response to market changes.

## Running the Example
You could run this Example.trader file below in the runtime eclipse:
```
var symbol = "GBPUSD"
var broker = "MetaQuotes-Demo"
var user = "5023919288"
var pwd = "N+UcJj4q"

connect to trade symbol on server user with login user, password pwd, timeframe M1

create bot with strategy simpleStrategyA using lot size 0.01

see registered bots

execute bots for 0 days 0 hours 3 minutes 09 seconds
```
 This will run a demo account already created. However, you are open to create your own demo account and replace the variables (var) provided with your own details.

## Prerequisites
- Java JDK 11 or newer
- Eclipse IDE for Java and DSL Developers
- Metatrader5 (MT5) desktop application
- Account with a broker that integrates with MT5
- Windows OS
- Remember to enable algo trading on MT5 app

**Python packages/requirements:**
- Python 3.7
- MetaTrader5 5.0.4200 (the python package)
- pandas 1.3.5
- pip 20.1.1
- scikit-learn 1.0.2
- ta 0.11.0

## Installation and Implementation

1. Clone the repository:

```bash
git clone https://github.com/6ccs3mde-7ccsmmdd-2023-24/coursework-group-ab.git
```
2. Open Metatrader5 desktop app and connect to your account (you can quickly open a demo account through the MT5 app)
3. Enable algo trading
4. Open the project through the eclipse ide.
5. Generate the xtext artefacts and then open the run the project as an eclipse application
6. Create an xtext project and then create a .trader file
7. Run the .py source code on any ide of your choice that supports python 
