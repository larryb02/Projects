import discord
from discord.ext import commands
import youtube_dl

class Larvin(commands.Cog):
    def __init__(self,client,intents):
        self.intents = intents
        self.intents.message_content = intents.message_content
        self.client = client
        
    @commands.command()
    async def play(self,ctx,*song_name): #takes user input, gets song, bot joins channel that user is in, then streams audio
        
        pass
    @commands.command()
    async def pause(self,ctx): #pauses current song
        pass
    
    @commands.command()
    async def skip(self,ctx,song_number): #removes specified song from queue, skips current one if no song specified
        pass
    
    @commands.command()
    async def queue(self,ctx): #shows list of songs in the queue
        pass
    
    @commands.Cog.listener()
    async def on_ready(self):
        print(f'{self.client.user} has logged in')
        pass
def setup(client):
	client.add_cog(Larvin(client))



