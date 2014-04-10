package z.ghostface.game.level;

import java.util.List;

import z.ghostface.game.level.tiles.Tile;

//This class is going to generate a 64x64 level made up of VOID, GRASS, WATER, and STONE tiles
public class GenerateLevel{
	private int borderSize;
	
	private int x, y;
	private List<int[]> tileCoords;
	private int rand = (int)(0 + Math.random() * 3);
	private Tile[] tiles = {Tile.VOID, Tile.GRASS, Tile.WATER, Tile.STONE};

	public GenerateLevel(int x, int y, List<int[]> tileCoords, int borderSize){
		this.tileCoords = tileCoords;
		this.x = x;
		this.y = y;
		this.borderSize = borderSize;
		int[] startCoord = {x,y};
		
		while(x < borderSize & y < borderSize){	
			for(int[] currentXY : tileCoords){
				int switchX = startCoord[0];
				
				switch(switchX): //Parse and handle as ordered pair
					case(switchX < y):
						x++;
						getTile(rand);//Random tile from tiles at int[] coord, x++
					case(switchX > y):
						x = 0;
						y++;
						getTile(rand);//Random tile from tiles at int[] coord, y++
					case(switchX == y):
						x++;
						getTile(rand);
					default:
						x = 0;
						y++;
						getTile(0);//Return VOID tile
				}
			}
	
		}
	private Tile getTile(int tileArrayId){
		return tiles[tileArrayId];
	}
	
	

}
