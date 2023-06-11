import discord
from discord.ext import commands
import os
from dotenv import load_dotenv
import logging


file = 'bot.env'
load_dotenv(file)
token = os.getenv('TOKEN')

class Larvin(commands.Cog):
    def __init__(self):
        self.intents = discord.Intents.default()
        self.intents.message_content = True
        self.client = commands.Bot(command_prefix=commands.when_mentioned_or('$'),intents = self.intents)
        pass
    @commands.Cog.listener()








     





     
     










    

   


