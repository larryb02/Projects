import discord
from discord.ext import commands
import os
from dotenv import load_dotenv



file = '.\\discordbot\\bot.env'
load_dotenv(file)
token = os.getenv('TOKEN')
intents = discord.Intents.default()
intents.message_content = True
client = commands.Bot(command_prefix=commands.when_mentioned_or('$'),intents = intents)

#print(os.listdir("C:\\"))


# for f in os.listdir("./cogs"):
# 	if f.endswith(".py"):
# 		client.load_extension("cogs." + f[:-3])

#client.run(token)





     





     
     










    

   


