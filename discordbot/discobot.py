import discord
from discord.ext import commands
import os
from dotenv import load_dotenv
import logging


file = 'bot.env'
load_dotenv(file)
logging.basicConfig(level=logging.INFO)
intents = discord.Intents.default()
intents.message_content = True
client = commands.Bot(command_prefix=commands.when_mentioned_or('$'), intents=intents)

token = os.getenv('TOKEN')


@client.command()
async def play(ctx, *,song_name):
    await ctx.send("Playing " + song_name)#will replace the parameter with the
                                         #function that gets the song link
    
@client.event
async def on_ready():
    await client.tree.sync()
    print(f'{client.user} is online')


@client.event
async def on_message(message):
    if message.author == client.user:
        pass

    await client.process_commands(message)

     
    
client.run(token)




     





     
     










    

   


