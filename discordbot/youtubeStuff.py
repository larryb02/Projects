import discord
from discord.ext import commands

class Larvin(commands.Cog):
    def __init__(self,client,intents):
        self.intents = intents
        self.intents.message_content = intents.message_content
        self.client = client
        
    @commands.command()
    async def play(ctx,song_name): #takes user input, gets song, bot joins channel that user is in, then streams audio
        pass
    @commands.command()
    async def pause(ctx):
        pass
    
    @commands.command()
    async def skip(ctx):
        pass
    
    @commands.command()
    async def queue(ctx): #shows list of songs in the queue
        pass
    
    @commands.Cog.listener()
    async def on_ready(self):
        print(f'{self.client.user} has logged in')
        pass



