import java.awt.*;

import static java.lang.Math.*;

public class Screen {
    int w, h, worldMap[][];

    public Screen(int wi, int he, int[][] wm) {
        w=wi;
        h=he;
        worldMap=wm;
    }

    public int[] update(Camera camera, int[] pixels) {
        int color;
        for(int n = 0; n < ((pixels.length) / 2); n++) {
            if(pixels[n] != Color.DARK_GRAY.getRGB()) pixels[n] = Color.DARK_GRAY.getRGB();
        }
        for(int i=pixels.length/2; i<pixels.length; i++){
            if(pixels[i] != Color.gray.getRGB()) pixels[i] = Color.gray.getRGB();
        }
        for (int x = 0; x < w; x++) {
            //calculate ray position and direction
            double cameraX = 2 * x / (double) (w) - 1; //x-coordinate in camera space
            double rayPosX = camera.posX;
            double rayPosY = camera.posY;
            double rayDirX = camera.dirX + camera.planeX * cameraX;
            double rayDirY = camera.dirY + camera.planeY * cameraX;
            //which box of the map we're in
            int mapX = (int) (rayPosX);
            int mapY = (int) (rayPosY);

            //length of ray from current position to next x or y-side
            double sideDistX;
            double sideDistY;

            //length of ray from one x or y-side to next x or y-side
            double deltaDistX = sqrt(1 + (rayDirY * rayDirY) / (rayDirX * rayDirX));
            double deltaDistY = sqrt(1 + (rayDirX * rayDirX) / (rayDirY * rayDirY));
            double perpWallDist;

            //what direction to step in x or y-direction (either +1 or -1)
            int stepX;
            int stepY;

            int hit = 0; //was there a wall hit?
            int side=0; //was a NS or a EW wall hit?
            //calculate step and initial sideDist
            if (rayDirX < 0) {
                stepX = -1;
                sideDistX = (rayPosX - mapX) * deltaDistX;
            } else {
                stepX = 1;
                sideDistX = (mapX + 1.0 - rayPosX) * deltaDistX;
            }
            if (rayDirY < 0) {
                stepY = -1;
                sideDistY = (rayPosY - mapY) * deltaDistY;
            } else {
                stepY = 1;
                sideDistY = (mapY + 1.0 - rayPosY) * deltaDistY;
            }
            //perform DDA
            while (hit == 0) {
                //jump to next map square, OR in x-direction, OR in y-direction
                if (sideDistX < sideDistY) {
                    sideDistX += deltaDistX;
                    mapX += stepX;
                    side = 0;
                } else {
                    sideDistY += deltaDistY;
                    mapY += stepY;
                    side = 1;
                }
                //Check if ray has hit a wall
                if (worldMap[mapX][mapY] > 0) hit = 1;
            }
            //Calculate distance projected on camera direction (oblique distance will give fisheye effect!)
            if (side == 0) perpWallDist = (mapX - rayPosX + (1 - stepX) / 2) / rayDirX;
            else perpWallDist = (mapY - rayPosY + (1 - stepY) / 2) / rayDirY;

            //Calculate height of line to draw on screen
            int lineHeight = (int) (h / perpWallDist);

            //calculate lowest and highest pixel to fill in current stripe
            int drawStart = -lineHeight / 2 + h / 2;
            if (drawStart < 0) drawStart = 0;
            int drawEnd = lineHeight / 2 + h / 2;
            if (drawEnd >= h) drawEnd = h - 1;

            //choose wall color
            switch (worldMap[mapX][mapY]) {
                case 1: {
                    color = Color.GREEN.getRGB();
                    break;
                }
                case 2: {
                    color = Color.BLUE.getRGB();
                    break;
                }
                case 3: {
                    color = Color.RED.getRGB();
                    break;
                }
                case 4: {
                    color = Color.YELLOW.getRGB();
                    break;
                }
                default: {
                    color = Color.MAGENTA.getRGB();
                    break;
                }
            }
            for(int y=drawStart; y<drawEnd; y++)
                pixels[x + y*(w)] = color;
        }
return pixels;
    }

}
