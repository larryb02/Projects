import discord
from discord.ext import commands
import os
from dotenv import load_dotenv
import logging
from discord import app_commands
#import handleMessages

file = 'bot.env'
load_dotenv(file)
logging.basicConfig(level=logging.INFO)
intents = discord.Intents.default()
intents.message_content = True
client = commands.Bot(command_prefix='>', intents=intents)
tree = app_commands.CommandTree(client)

token = os.getenv('TOKEN')



#establish connection to discord api/server
@client.event
async def on_ready():
    print(f'{client.user} is online')


@client.event
async def on_message(message):
    if message.author == client.user:
        return
    else:
        handle(message.content)
    #create slash commands
     
    
client.run(token)

def handle(message):
    return


     





     
     










    

   


