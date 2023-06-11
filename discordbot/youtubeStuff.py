import discord
from discord.ext import commands

class Larvin(commands.Cog):
    def __init__(self,client,intents):
        self.intents = intents
        self.intents.message_content = intents.message_content
        self.client = client
        
    @commands.Cog.listener()
    async def filler(ctx):
        pass

   

    async def on_ready(self):
        print(f'{self.client.user} has logged in')
        pass



