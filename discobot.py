import discord
from discord.ext import commands
import os
from dotenv import load_dotenv
import logging
#import handleMessages

file = 'bot.env'
load_dotenv(file)
logging.basicConfig(level=logging.INFO)
intents = discord.Intents.default()
intents.message_content = True
client = commands.Bot(command_prefix='>', intents=intents)

token = os.getenv('TOKEN')


@client.tree.command
async def command():
    pass


#establish connection to discord api/server
@client.event
async def on_ready():
    await client.tree.sync()
    print(f'{client.user} is online')


@client.event
async def on_message(message):
    if message.author == client.user:
        pass
    else:
        handle(message.content)
    #create slash commands
     
    
client.run(token)

def handle(message):
    return


     





     
     










    

   


