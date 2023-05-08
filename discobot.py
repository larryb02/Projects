import discord
import os
import random
from dotenv import load_dotenv
import logging

load_dotenv()
logging.basicConfig(level=logging.INFO)
client = discord.Bot()
token = os.getenv('TOKEN')
#establish connection to discord api/server
@client.event

async def on_ready():
    print('I am Larvin and I am alive!')
   


